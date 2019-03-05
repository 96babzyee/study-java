package chat3.server;

import java.net.*;

class ServerExample4 {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(9002);
			System.out.println("wait!");
			while (true) {
				Socket socket = serverSocket.accept();
				Thread thread = new PerClinetThread(socket);
				thread.start();
				System.out.println("conn!");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
