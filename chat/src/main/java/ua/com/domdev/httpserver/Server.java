package ua.com.domdev.httpserver;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private int port;
    private String webAppPath;

    public Server(int port, String webAppPath) {
        this.port = port;
        this.webAppPath = webAppPath;
    }

    public void start() throws IOException {
        ServerSocket serverSocket = new ServerSocket(port);
        while (true) {
            try (Socket socket = serverSocket.accept()) {
                RequestHandler requestHandler = new RequestHandler();
                requestHandler.handle(socket);
            }
        }
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getWebAppPath() {
        return webAppPath;
    }

    public void setWebAppPath(String webAppPath) {
        this.webAppPath = webAppPath;
    }
}
