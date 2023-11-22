package api.projecttalk.Entities;

import java.util.List;

/**
 * class that represent a server often related to a project
 */
public class Server {

    /**
     * id of the server
     */
    private String id;
    /**
     * title of the server
     */
    private String title;
    /**
     * roles that could be assigned to a user on the server
     */
    private List<String> roles;
    /**
     * the different channels that are part of the server
     */
    private List<String> channels;
}
