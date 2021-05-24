package java_20210524;

import java.io.IOException;
import java.net.ServerSocket;

public class ServerSocketScan {
	public static void main(String[] args) {
		ServerSocket socket = null;
			
		for(int port = 1; port <= 65536; port++) {
			try {
				//ServerSocket 클래스는 해당 서버의 port 번호를 사용할 수 있으면
				//ServerSocket 인스턴스를 생성할 수 있다.
				//그렇지 않으면 예외를 발생 시킨다.
				//예외가 발생했으면 해당 port를 사용하고 있다는 뜻.
				socket = new ServerSocket(port);
				//본인의 로컬 컴퓨터의 포트를 스캔하는 거라 빠름.
			} catch (IOException e) {
				System.err.println(port+" number is being used");
			}
		}
		
		try {
			socket.close();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		
	}
}
