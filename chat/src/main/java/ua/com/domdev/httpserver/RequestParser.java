package ua.com.domdev.httpserver;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RequestParser {
    private static final String REGEXP_FOR_FILE = "( /)(.+?)( HTTP)";
    private String fileName;
    private final Pattern pattern = Pattern.compile(REGEXP_FOR_FILE);

    public static void main(String[] args) {

        String testText = "GET /package/system/out/808/index.html5 HTTP/1.1\n" +
                "Host: developer.mozilla.org\n" +
                "Accept-Language: fr";
        RequestParser parser = new RequestParser();

        System.out.println(parser.parseRequest(testText));
    }

    public String parseRequest(String receivedMessage){
        Matcher matcher = pattern.matcher(receivedMessage);

        if (matcher.find()) {
            fileName = receivedMessage.substring(matcher.start(2), matcher.end(2));
        }

        return fileName;
    }


}
