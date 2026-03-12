import java.net.*;
import java.io.*;

public class ClientHandler extends Thread {

    private Socket socket;
    private PrintWriter out;
    private BufferedReader in;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    public void run() {

        try {

            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);

            ChatServer.addWriter(out);

            String message;

            while ((message = in.readLine()) != null) {
                System.out.println("Message: " + message);
                ChatServer.broadcast(message);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            ChatServer.removeWriter(out);
        }
    }
}