package api.projecttalk.Entities;

import org.springframework.scheduling.support.SimpleTriggerContext;

import java.util.List;

/**
 * class that represent a chat message by a user
 */
public class Chat {
    /**
     * id of the chat message
     */
    private String id;
    /**
     * text of the chat message
     */
    private String text;
    /**
     * id of the author of the chat message
     */
    private String idAuthor;
    /**
     * date of the chat message
     */
    private String date;
    /**
     * id of the server the chat message was sent in
     * important to sort the messages in the right chronological order
     */
    private String idServer;
    /**
     * id of the channel the chat message was sent in
     */
    private List<String> channels;

}
