import java.util.*;

interface ChatMediator {
    void addUser(User user);

    void sendMessage(String message, User user);
}

class ChatRoom implements ChatMediator {
    private List<User> users;

    public ChatRoom() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : users) {
            if (u != user) {
                u.receive(message);
            }
        }
    }
}

abstract class User {
    protected String name;
    protected ChatMediator mediator;

    public User(String name, ChatMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public abstract void send(String message);

    public abstract void receive(String message);
}

class BasicUser extends User {
    public BasicUser(String name, ChatMediator mediator) {
        super(name, mediator);
    }

    @Override
    public void send(String message) {
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(name + " received: " + message);
    }
}

public class Mediator {
    public static void main(String[] args) {
        // Create mediator
        ChatMediator chatRoom = new ChatRoom();

        // Create users
        User user1 = new BasicUser("Alice", chatRoom);
        User user2 = new BasicUser("Bob", chatRoom);

        // Add users to the chat room
        chatRoom.addUser(user1);
        chatRoom.addUser(user2);

        // User1 sends a message
        user1.send("Hello everyone!");
    }
}