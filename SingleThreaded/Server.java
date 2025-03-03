package SingleThreaded;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public void run() throws IOException {
        int port = 8010;
        ServerSocket socket = new ServerSocket(port);
        socket.setSoTimeout(10000);
        while (true) {
            try {
                System.out.println("Server is listening on port " + port);
                Socket acceptedConnection = socket.accept();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }

    public static void main(String args) {

    }
}