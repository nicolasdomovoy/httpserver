package ua.com.domdev.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
    private String port;

    public void setPort(String port) {
        this.port = port;
    }

    public String getPort() {
        return port;
    }

    public void start(){
        try {
            ServerSocket serverSocket = new ServerSocket(8088);

            Socket socket = serverSocket.accept();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter messageSender = new PrintWriter(socket.getOutputStream());

            String receivedMessage;
            System.out.println("Server started!");
            while ((receivedMessage = bufferedReader.readLine()) != null) {
                if ("ololo".equals(receivedMessage = "ololo")) {
                    System.out.println("receivedMessage Is equal");
                }
                System.out.println(receivedMessage);

                messageSender.write("echo " + receivedMessage + "\n");
                messageSender.flush();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
