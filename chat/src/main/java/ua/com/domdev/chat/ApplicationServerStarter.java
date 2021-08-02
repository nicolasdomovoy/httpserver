package ua.com.domdev.chat;

public class ApplicationServerStarter {
    public static void main(String[] args) {
        ChatServer server = new ChatServer();
        server.start();
    }
}
