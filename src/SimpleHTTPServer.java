import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class SimpleHTTPServer {
    public static void main(String[] args) throws Exception{
        final ServerSocket server = new ServerSocket(8080);
        System.out.println("Listening for connection on port 8080 ....");
        while(true) {
            // 1. Read HTTP request from the client socket
            // 2. Prepare an HTTP response
            // 3. Send HTTP response to the client
            // 4. Close the socket
            try (final Socket client = server.accept()){
            InputStreamReader isr = new InputStreamReader(client.getInputStream());
            BufferedReader read = new BufferedReader(isr);
            String line = read.readLine();
            while (!line.isEmpty()) {
                System.out.println(line);
                line = read.readLine();
            }
            String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + "Mangaoo";
            client.getOutputStream().write(httpResponse.getBytes(StandardCharsets.UTF_8));
          }
        }
    }
}
