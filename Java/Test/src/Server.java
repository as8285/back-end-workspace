import java.io.BufferedReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		ServerSocket server;
	BufferedReader br = localhost(3000);

		try {
			server = new ServerSocket();
			Socket s = server.accept();
	
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

}
