package Socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerSide1 {
    public static void main(String[] args) throws IOException {
        while(true) {
            try (ServerSocket serverSocket = new ServerSocket(6666))

            {
                Socket client = serverSocket.accept();
                System.out.println("Client is connected!");

                DataInputStream inputStream = new DataInputStream(client.getInputStream());
                DataOutputStream outputStream = new DataOutputStream(client.getOutputStream());

                String clientResponse = inputStream.readUTF();
                System.out.println("Client response " + clientResponse); // тоже самое что эхо-сервер
            }
        }
    }
}
