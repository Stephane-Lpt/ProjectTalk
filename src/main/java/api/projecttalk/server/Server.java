package api.projecttalk.server;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * class that represent a server often related to a project
 */
@Document(collection = "servers")
public class Server {

    /**
     * id of the server
     */
    @Id
    private String id;
    /**
     * name of the server
     */
    private String name;
    /**
     * roles that could be assigned to a user on the server
     */
    private List<String> roles;
    /**
     * the different channels that are part of the server
     */
    private List<String> channels;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getRoles() {
        return roles;
    }

    public List<String> getChannels() {
        return channels;
    }
}
