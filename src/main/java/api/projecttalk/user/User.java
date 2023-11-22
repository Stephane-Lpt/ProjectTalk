package api.projecttalk.user;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;

/**
 * class that represent a user
 */
@Document(collection = "users")
public class User {
    /**
     * id of the user
     */
    @Id
    private String id;
    /**
     * username of the user
     */
    @Indexed(unique = true)
    private String username;
    /**
     * email of the user
     */
    private String email;
    /**
     * password of the user
     */
    private String password;
    /**
     * servers the user participates in
     */
    private Map<String,String> servers;

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Map<String, String> getServers() {
        return servers;
    }
}
