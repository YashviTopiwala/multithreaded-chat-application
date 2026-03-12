import java.net.*;
import java.io.*;
import java.util.*;

public class ChatServer {

    private static final int PORT = 1234;
    private static Set<PrintWriter> clientWriters = new HashSet<>();

    public static void main(String[] args) {

        System.out.println("Chat Server Started...");

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("New client connected");

                new ClientHandler(clientSocket).start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static synchronized void broadcast(String message) {
        for (PrintWriter writer : clientWriters) {
            writer.println(message);
        }
    }

    public static synchronized void addWriter(PrintWriter writer) {
        clientWriters.add(writer);
    }

    public static synchronized void removeWriter(PrintWriter writer) {
        clientWriters.remove(writer);
    }
}