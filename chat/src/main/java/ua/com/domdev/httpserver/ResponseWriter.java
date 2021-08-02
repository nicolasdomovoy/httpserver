package ua.com.domdev.httpserver;

import java.io.*;
import java.util.Objects;

public class ResponseWriter {
    private String readFile(File file) throws IOException {
        StringBuffer stringFile = new StringBuffer();

        if (file != null) {
            try (FileReader fileReader = new FileReader((file))){
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line;
                while((line = bufferedReader.readLine()) != null) {
                    stringFile.append(line);
                };
            }
        }

        return stringFile.toString();
    }

    public void writeSuccessResponse(PrintWriter printWriter, String filePath) throws IOException {
        File file = new File(Objects.requireNonNull(getClass().getClassLoader().getResource(filePath)).getFile());

        String response = "HTTP/1.1 200 OK\r\n" +
                "Content-Type: text/html\n\n" +
                this.readFile(file);

        System.out.println(response);

        printWriter.write(response);
        printWriter.flush();
    }
}
