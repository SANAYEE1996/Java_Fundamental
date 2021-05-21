package java_20210521;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnectionDemo {

	public static void main(String[] args) throws IOException {
		
		URL url = new URL("https://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=102&oid=003&aid=0010509683");
		URLConnection urlcon = url.openConnection();
		
		String cache = urlcon.getHeaderField("cache-control");
		String content = urlcon.getHeaderField("cotent-type");
		String date = urlcon.getHeaderField("date");
		
		System.out.println("cache-control : " +cache);
		System.out.println("content : " +content);
		System.out.println("date : " +date);
		
		InputStream in = urlcon.getInputStream();
		
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		String readLine = null;
		while((readLine = br.readLine()) != null) {
			System.out.println(readLine);
		}
		
		in.close();
		
	}

}
