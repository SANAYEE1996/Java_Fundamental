package java_20210524.echo.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	private int port;

	public EchoServer(int port) {
		this.setPort(port);
	}

	public void run() {
		ServerSocket serverSocket = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		OutputStreamWriter osw = null;
		BufferedWriter wr = null;

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
				InetAddress i = socket.getInetAddress();
				System.out.println("client access success " + i.getAddress() + " !~");

				// 5. Socket을 이용해서 클라이언트와 통신할 수 있는 입출력 스트림 생성.
				
				InputStream in = socket.getInputStream();
				// 6-2 읽는다
				isr = new InputStreamReader(in);
				br = new BufferedReader(isr);

				OutputStream out = socket.getOutputStream();
				// 6-3 다시 써준다.
				osw = new OutputStreamWriter(out);
				wr = new BufferedWriter(osw);
				
				while (true) {
					String readLine = br.readLine();
					System.out.println("client message : " + readLine);

					wr.write(readLine);
					wr.newLine();
					wr.flush();
				}

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
		new EchoServer(3000).run();
	}

}
