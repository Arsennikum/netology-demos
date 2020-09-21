package netology;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class DemoOsi {

    public static void main(String[] args) throws IOException {
        String host = "netology.ru";
        int port = 80;
        try (Socket socket = new Socket();
             PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            writer.println("GET / HTTP/1.1"
//                    "Host: netology.ru\n" +
//                    "Content-Type: application/json; charset=utf-8\n"
//                    "" +
//                    "{\"key1\":\"shkaf\"}\n"
//                    "\n\n"
            );

            // server make responses
            System.out.println(reader.readLine());
            System.out.println(reader.readLine());
            System.out.println(reader.readLine());
            System.out.println(reader.readLine());
            System.out.println(reader.readLine());
            System.out.println(reader.readLine());
            System.out.println(reader.readLine());
            System.out.println(reader.readLine());


        }
    }

    public static void main1(String[] args) throws UnknownHostException {
        String host = "netology.ru";
        InetAddress inetAddress = InetAddress.getByName(host);
        System.out.println(host + ", ip address: " + inetAddress.getHostAddress());
    }
}
