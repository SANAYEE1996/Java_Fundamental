package java_20210520;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
//import java.net.MalformedURLException;
import java.net.URL;

public class InputStreamReaderDemo2 {

	public static void main(String[] args) throws IOException {
		URL url = new URL("https://jamesdreaming.tistory.com/99");
		InputStream in = url.openStream();
		
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		FileWriter fw = new FileWriter("C:\\Users\\user\\Desktop\\자바_필기\\history.html");
		BufferedWriter bw = new BufferedWriter(fw);
		
		String readLine = null;
		
		while((readLine = br.readLine()) != null) {
			System.out.println(readLine);
			
			bw.write(readLine);
			bw.newLine();
		}
		bw.flush();
	}
		
}
