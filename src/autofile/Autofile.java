package autofile;

import java.io.*;
import java.net.*;

public class Autofile {
    private static final String SERVER_IP = "192.168.1.100"; // Replace with your actual server IP
    private static final int SERVER_PORT = 12345;

    public static void sendStudentData(String studentId) {
        try {
            Socket socket = new Socket(SERVER_IP, SERVER_PORT);

            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // Send student ID
            writer.println(studentId);
            System.out.println("Sent student ID: " + studentId);

            // Read response
            String response = reader.readLine();
            System.out.println("Server response: " + response);

            socket.close();
        } catch (IOException e) {
            System.err.println("Error connecting to the server: " + e.getMessage());
        }
    }
}
