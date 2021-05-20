package java_20210520;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {

	public static void main(String[] args) {
		FileInputStream fin = null;
		BufferedInputStream bin = null;
		
		FileOutputStream fout = null;
		BufferedOutputStream bout = null;
		
		PrintStream ps = null;	//file
		PrintStream ps1 = null; //monitor
		
		ps1 = System.out;
		ps1.println("hi");
		ps1.println("에이치 아이~");
		
		try {
			fin = new FileInputStream("C:\\dev\\test\\2021\\05\\18\\apache-tomcat-9.0.46.zip");
			bin = new BufferedInputStream(fin);
			
			fout = new FileOutputStream("C:\\dev\\test\\2021\\05\\18\\apache-tomcat-9.0.46_copy.zip");
			bout = new BufferedOutputStream(fout);	//Stream changing
			
			//첫번째 인자에 file 출력을 넣으면 의미가 없으니 꼭 buffer 출력을 넣어주자
			//1. PrintStream의 메서드는 IOException을 발생시키지 않는다.
			//2. auto - flush 기능을 가지고 있음. (두번째 인자로 true를 줘야함.)
			ps = new PrintStream(bout,true);	//Stream changing 
			
			long start = System.currentTimeMillis();
			//핵심.
			int rb = 0;
			while((rb = bin.read())!= -1) {
				ps.write(rb);		//print : 시간 오래 걸림(26578) //write : 시간 적게 걸림 (579)
			}
			long end = System.currentTimeMillis();
			System.out.println("elapsed Time : "+(end - start));
			//ps.flush(); 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fin != null) fin.close();
				if(bin != null) bin.close();
				if(fout != null) fout.close();
				if(ps != null) ps.close();		//순서를 file과 buffer 사이에 해줘야 에러 발생 하지 않는다.
				if(bout != null) bout.close();
			}catch(IOException e) {
				System.err.println(e.getMessage());
			}
		}
		
	}
}
