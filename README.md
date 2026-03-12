## MULTITHREADED-CHAT-APPLICATION

**COMPANY:** CODTECH IT SOLUTIONS

**NAME:** YASHVI TOPIWALA

**INTERN ID:** CTIS4485

**DOMAIN:** Java Programming

**DURATION:** 16 Weeks

**MENTOR:** NEELA SANTOSH

## DESCRIPTION OF TASK
The objective of this task was to develop a multithreaded client-server chat application using Java sockets. In modern network-based systems, communication between multiple users happens through client-server architecture where a central server manages connections and data exchange between clients. This task demonstrates how Java can be used to build real-time communication systems using networking and multithreading concepts.

The developed application is a console-based chat system consisting of a server program and multiple client programs. The server listens for incoming client connections using a ServerSocket. When a client connects to the server, a new thread is created to handle that client. This allows multiple users to communicate with the server simultaneously without interrupting other connected clients.

The program uses Java’s java.net package for socket communication. The ServerSocket class is used to create the server that waits for client connections, while the Socket class is used by clients to connect to the server. InputStreamReader, BufferedReader, and PrintWriter classes are used to send and receive messages between the server and clients.

Multithreading is implemented using the Thread class so that each connected client runs in its own thread. This ensures that the server can manage multiple clients at the same time. When a message is sent by one client, the server broadcasts the message to all connected clients so that everyone in the chat can see it in real time.

This task helped in understanding how network communication works in Java, how servers manage multiple users simultaneously, and how multithreading improves the efficiency of client-server applications.

## CONCEPTS USED

Operation | Class Used

Server Creation | ServerSocket

Client Connection | Socket

Message Sending | PrintWriter

Message Reading | BufferedReader + InputStreamReader

Multithreading | Thread Class

Error Handling | Try-Catch (IOException)

📂 PROJECT STRUCTURE

MultithreadedChatApp/

├── ChatServer.java

├── ClientHandler.java

├── ChatClient.java

└── README.md

⚙️ FEATURES

Client-server chat architecture

Multiple clients can connect to the server

Real-time message communication

Multithreading used to handle multiple clients

Broadcast messages to all connected users

Exception handling implemented

💻 TECHNOLOGIES / TOOLS USED

Java (JDK 8+)

java.net package

ServerSocket

Socket

BufferedReader

InputStreamReader

PrintWriter

Thread Class

Command Prompt / PowerShell

Git & GitHub

▶️ HOW TO RUN

Compile

javac *.java

Run Server

java ChatServer

Run Client (open multiple terminals)

java ChatClient

🧪 SAMPLE OUTPUT

Server Side

Chat Server Started...
New client connected
Message: Hello everyone

Client 1

Hello everyone

Client 2

Hello everyone

📘 LEARNING OUTCOME

Understanding client-server architecture

Learning Java socket programming

Implementing multithreading in Java applications

Managing communication between multiple users

Building real-time chat systems using Java

