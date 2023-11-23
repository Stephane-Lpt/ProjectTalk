package api.projecttalk.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

/**
 * class that represent the user's controller
 */
@RestController
@RequestMapping("/users")
public class UserController {

    /**
     * service that will manage the user's data before sending it to the database
     */
    @Autowired
    private UserService userService;

    /**
     * Display a user searched with his username
     * @param username username of the user given in the url
     * @return the user related to the username given
     */
    @GetMapping("/{username}")
    public ResponseEntity<User> getUser(@PathVariable String username) {
        Optional<User> user = userService.getUserByUsername(username);
        // if the user is not found, throw an exception with a 404 error
        if(!user.isPresent()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "The username : " + username + " was not found");
        }
        // else return the user
        return new ResponseEntity<User>(user.get(), HttpStatus.OK);
    }
}
