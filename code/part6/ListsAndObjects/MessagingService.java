package part6.ListsAndObjects;

import java.util.ArrayList;

public class MessagingService
{
    private ArrayList<Message> messages;

    public MessagingService() {
        this.messages = new ArrayList<>();
    }
    public void add(Message message) {
        if (message.getMessage().length() < 280) {
            messages.add(message);
        }
    }
    public ArrayList<Message> getMessages() {
        return messages;
    }
}
