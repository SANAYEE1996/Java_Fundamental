package java_20210521;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class UrlDemo {

	public static void main(String[] args) throws IOException {

		URL url = new URL(
				"https://www.naver.com");
		String protocol = url.getProtocol();
		String host = url.getHost();
		int port = url.getPort();
		String path = url.getPath();
		String query = url.getQuery();
		String ref = url.getRef();

		System.out.println(	"프로토콜 : " + protocol + "\n호스트 :  " + host + 
							"\n포트 : " + port + "\n경로 : " + path + 
							"\n쿼리 : " + query + "\n레퍼런스 : " + ref);
		
		InputStream is = url.openStream();
		/*
		int rb = 0;
		byte[] rbytes = new byte[1024*10];
		FileOutputStream fout = new FileOutputStream("C:\\Users\\user\\Downloads\\test.jpg");
		while((rb = is.read(rbytes)) != -1) {
			fout.write(rbytes,0,rb);
		}
		fout.flush();
		
		fout.close();
		 */
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String readLine = null;
		while((readLine = br.readLine()) != null) {
			System.out.println(readLine);
		}
		
		
		
	}

}
