    
package autofile;
import java.io.*;
import java.net.*;

public class Autofile {
    private static final String SERVER_IP = "192.168.1.100"; // Replace with the actual server's IP address
    private static final int SERVER_PORT = 12345; // Port where server is listening
    public static void main(String[] args) {
        try {
            // Connect to the server
            Socket socket = new Socket(SERVER_IP, SERVER_PORT);

            // Get input and output streams for communication
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // Student data to send
            String studentData = "Student123"; // Replace with actual data (student name or ID)

            // Send student data to server
            writer.println(studentData);
            System.out.println("Sent student data: " + studentData);

            // Read response from server
            String response = reader.readLine();
            System.out.println("Server response: " + response);

            // Close the connection
            socket.close();
        } catch (IOException e) {
            System.err.println("Error connecting to the server: " + e.getMessage());
        }
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new membercount().setVisible(true);
            }
        });
    }
    
}
