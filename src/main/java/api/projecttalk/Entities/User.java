package api.projecttalk.Entities;

import java.util.Map;

/**
 * class that represent a user
 */
public class User {
    /**
     * id of the user
     */
    private String id;
    /**
     * username of the user
     */
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
}
