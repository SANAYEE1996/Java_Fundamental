package java_20210524;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketScanDemo {

	public static void main(String[] args) {
		
		Socket socket = null;
		for(int port = 1; port<= 1024; port++) {
			try {
				//Socket 객체가 생성되었다는 의미는 host, port 로
				//통신 할 수 있다는 것. 이는 해당 host에 port 번호가
				//사용되고 있음을 뜻함.
				socket = new Socket("127.0.0.1",port);
				//해당 호스트에 포트 번호를 사용하고 있는지를 파악.
				//특정 서버의 포트를 스캔할 목적으로 사용하므로 많이 느림.
				System.out.println(port +" 번호를 사용하고 있습니다.");
			} catch (UnknownHostException e) {
				System.err.println("not exists host");
			} catch (IOException e) {
				System.err.println(port + " number not used");
			}
		}
		
		try {
			if(socket != null) socket.close();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		

	}

}
