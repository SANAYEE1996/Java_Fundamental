package java_20210524.echo.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer2 {

	private int port;

	public EchoServer2(int port) {
		this.setPort(port);
	}

	public void run() {
		ServerSocket serverSocket = null;
		
		EchoServerThread est = null;
		
		// 1. ServerSocket 인스턴스를 생성한다.
		try {
			serverSocket = new ServerSocket(port);
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}

		// 2. 클라이언트 접속을 기다린다.
		// accept() : 클라이언트 접속을 기다리다 클라이언트가 접속하면
		// 클라이언트와 통신할 수 있는 Socket 객체를 생성해준다.
		System.out.println("///SERVER///");
		while (true) {
			System.out.println("waiting client accept");
			try {
				Socket socket = serverSocket.accept();
				
				est = new EchoServerThread(socket);
				Thread t = new Thread(est);
				t.start();
				
			} catch (IOException e) {
				System.err.println(e.getMessage());
			}
		}

	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public static void main(String[] args) {
		new EchoServer2(3000).run();
	}

}
