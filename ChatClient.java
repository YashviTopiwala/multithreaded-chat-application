import java.net.*;
import java.io.*;

public class ChatClient {

    private static final String SERVER_ADDRESS = "localhost";
    private static final int SERVER_PORT = 1234;

    public static void main(String[] args) {

        try {

            Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT);

            BufferedReader keyboard =
                    new BufferedReader(new InputStreamReader(System.in));

            PrintWriter out =
                    new PrintWriter(socket.getOutputStream(), true);

            BufferedReader in =
                    new BufferedReader(new InputStreamReader(socket.getInputStream()));

            Thread receiveThread = new Thread(() -> {
                try {
                    String message;
                    while ((message = in.readLine()) != null) {
                        System.out.println(message);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            receiveThread.start();

            String userInput;

            while ((userInput = keyboard.readLine()) != null) {
                out.println(userInput);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}