package java_20210520;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {

	public static void main(String[] args) {
		
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("C:\\dev\\test\\2021\\05\\20\\FileDemo.java");
			fw = new FileWriter("C:\\dev\\test\\2021\\05\\20\\FileDemo_copy.java");
			//true를 주면 계속 이어서 씀 용량이 늘어남.
			//true없이 실행하면 그전의 내용을 싹 다 지우고 처음부터 입력. 용량 초기화.
			
			long start = System.currentTimeMillis();
			/*
			 * 한문자를 읽고 쓰는 logic
			int rchar = 0;			
			while((rchar = fr.read()) != -1) {		//read() : 한 개의 문자를 읽는다.
				System.out.print((char) rchar);
				fw.write(rchar);					//write() : 한 개의 문자를 쓴다.
			}
			*/
			
			int rcount = 0;
			char[] rchar = new char[1024*10];
			while((rcount = fr.read(rchar))!= -1) {
				System.out.println(rchar);
				fw.write(rchar , 0 , rcount);
			}	//제일 빠름.
			
			
			long end = System.currentTimeMillis();
			System.out.println("\nElasped Time : " + (double)(end - start)/1000 + " sec");
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fr != null) fr.close();
				if(fw != null) fw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
