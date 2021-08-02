package ua.com.domdev.httpserver;

import java.io.*;
import java.net.Socket;

public class RequestHandler {
    public void handle(Socket socket) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
            StringBuffer receivedMessage = new StringBuffer();
            String receivedLine;
            while (!"".equals(receivedLine = bufferedReader.readLine())) {
                receivedMessage.append(receivedLine).append("\r\n");
            }
            System.out.println(receivedMessage);

            RequestParser requestParser = new RequestParser();
            String filePath = requestParser.parseRequest(receivedMessage.toString());

            System.out.println("Recourse address is " + filePath);

            ResponseWriter responseWriter = new ResponseWriter();

            try (PrintWriter printWriter = new PrintWriter(socket.getOutputStream())) {
                responseWriter.writeSuccessResponse(printWriter, filePath);
            } catch(NullPointerException e) {
                System.out.println("OOPS! NullPointerException :(.");
            };
        }
    }
}
