package java_20210524.echo.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {

	private int port;
	private String ip;

	public EchoClient(String ip, int port) {
		this.setIp(ip);
		this.setPort(port);
	}

	public String console(String msg) {
		System.out.print(msg + " : ");
		Scanner sc = new Scanner(System.in);
		return sc.nextLine(); // 메세지 -> hello
	}

	public void run() {
		Socket socket = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		OutputStreamWriter osw = null;
		BufferedWriter wr = null;

		// 3.IP와 port로 서버에 접속을 시도한다.
		try {
			socket = new Socket(ip, port);
			System.out.println("server access success !");
			
			// 6. Socket 을 이용해서 서버와 통신할 수 있는 입출력 스트림 생성.
			
			OutputStream out = socket.getOutputStream(); // =>writer
			// 6-1
	
			osw = new OutputStreamWriter(out);
			wr = new BufferedWriter(osw);

			InputStream in = socket.getInputStream(); // =>reader
			// 6-2
			isr = new InputStreamReader(in);
			br = new BufferedReader(isr);

			while (true) {
				String message = console("메세지 ");
				wr.write(message);
				wr.newLine();
				wr.flush();

				String readLine = br.readLine();
				System.out.println("Server message : " + readLine);
			}

		} catch (IOException e) {
			System.err.println("server access fail // error message : " + e.getMessage());
		}
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public static void main(String[] args) {

		// IpV4 주소
		new EchoClient("192.168.0.82", 3000).run();
	}
}
