package lab8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Bai2 {

    static final int defaultPort = 13;

    public static void main(String[] args) {
        int portNumber;
        Socket clientSocket;
        BufferedReader timeStream;
        String hostName;
        switch (args.length) {
            case 1:
                hostName = args[0];
                portNumber = defaultPort;
                break;
            case 2:
                hostName = args[0];
                portNumber = Integer.parseInt(args[1]);
                break;
            default:
                hostName = "localhost";
                portNumber = defaultPort;
        }
        try {
            // Establish connection to the server
            clientSocket = new Socket(hostName, portNumber);
            // Create a data stream from the connection
            timeStream = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            // Get data from the server
            String timeString = timeStream.readLine();
            System.out.println("It is " + timeString + " at " + hostName);
            // Close the connection
            timeStream.close();
            clientSocket.close();
        } catch (UnknownHostException e) {
            System.out.println("Unknown host error");
        } catch (ConnectException e) {
            System.out.println("Service unavailable on port " + portNumber + " of host " + hostName);
        } catch (IOException e) {
            System.out.println("Communication error occurred\r\n" + e);
        }
    }
}
