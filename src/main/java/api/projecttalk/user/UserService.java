package api.projecttalk.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * class that represent the user's service
 */
@Service
public class UserService {

    /**
     * repository that will communicate with the database
     */
    @Autowired
    private UserRepository userRepository;

    /**
     *
     * Get a user by his username
     * @param username username of the user
     * @return the user related to the username given
     */
    public Optional<User> getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
