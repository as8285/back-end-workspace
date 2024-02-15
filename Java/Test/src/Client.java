import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		
		try {
			String ip = InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
		
			e.printStackTrace();
		}
		Socket s = new Socket();
	}

}
