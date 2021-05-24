package java_20210524.echo.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

public class EchoServerThread implements Runnable{
	private Socket socket;
	//인스턴스 변수기 때문에 이 클래스 안에서 어디든 사용 가능.
	
	public EchoServerThread(Socket socket) {
		this.socket = socket;
		//인스턴스 변수를 매개변수로 받겠다.
	}
	
	@Override
	public void run() {
		InputStreamReader isr = null;
		BufferedReader br = null;
		OutputStreamWriter osw = null;
		BufferedWriter wr = null;
		
		try {
			
			InetAddress i = socket.getInetAddress();
			System.out.println("client access success " + i.getAddress() + " !~");
			
			
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
			System.err.println("비 정상적으로 종료 되었습니다.");
		}
		
	}
}
