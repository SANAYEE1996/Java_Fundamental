package java_20210520;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 1byte로 읽고 쓰는 방법
		InputStream in = System.in;	//source 가 키보드인 경우
		byte[] b = new byte[100];
		int readByteCount = 0;
		System.out.print("입력 하십시오 : ");
		while((readByteCount = in.read(b))!= -1) {
			String message = new String(b,0,readByteCount);
			if(message == null || message.trim().equals("exit")) break;	//trim()이 공백도 제거해주지만
																		//개행 열도 제거해준다.
			System.out.print(message);//String 안에 개행이 포함되어 있어 ln을 붙일 필요 없다.
			System.out.print("입력 하십시오 : ");
		}
		* 1byte로 읽고 쓰는 방법
		*/

		InputStream in = System.in;
		InputStreamReader is = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(is);
		
		FileWriter fw = new FileWriter("C:\\Users\\user\\Desktop\\자바_필기\\2021_05_20.txt",true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		
		String readLine = null;
		System.out.print("enter in : ");
		
		while((readLine = br.readLine()) != null) {
			if(readLine != null && readLine.equals("exit")) break;
			System.out.println(readLine);		//개행을 읽지 않아서 println을 붙여준다.
			bw.write(readLine);
			bw.newLine();
			System.out.print("enter in : ");
		}
		bw.flush();
		
	}

}
