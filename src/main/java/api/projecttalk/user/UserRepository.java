package api.projecttalk.user;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

/**
 * class that represent the user's repository that will communicate with the database
 */
@Repository
public interface UserRepository extends MongoRepository<User, String> {
    /**
     * Get a user by his username
     * @param username username of the user
     * @return the user related to the username given
     */
    Optional<User> findByUsername(String username);

    /**
     * Get a user by his email
     * @param email email of the user
     * @return the user related to the email given
     */
    Optional<User> findByEmail(String email);
}
