package ua.com.domdev.httpserver;

import java.io.IOException;

public class ApplicationStarter {
    public static void main(String[] args) {
        try {
            Server server = new Server(8080, "localpath");
            server.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
