package ua.com.domdev.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient {
    public void start() {
        try {
            Socket socket = new Socket("localhost", 8088);

            PrintWriter messageSender = new PrintWriter(socket.getOutputStream());
            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader responseReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            while (true) {
                String message = consoleReader.readLine();
                messageSender.write(message + "\n");
                messageSender.flush();

                System.out.println(responseReader.readLine());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
