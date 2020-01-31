package main.java.com.olehhilchenko.javadesigntemplates.behavioral.mediator;

public class SimpleChatRunner {
    public static void main(String[] args) {
        SimpleTextChat chat = new SimpleTextChat();

        User admin = new Admin(chat, "Admin");
        User user = new SimpleUser(chat, "User");
        User user1 = new SimpleUser(chat, "User 1");

        chat.setAdmin(admin);
        chat.addUserToChat(user);
        chat.addUserToChat(user1);

        user1.sendMessage("KY");
        admin.sendMessage("YO");
    }
}
