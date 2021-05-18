package java_20210518;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInOutStreamDemo {

	public static void main(String[] args) {
		
		FileInputStream fin = null;
		FileOutputStream fout = null;
		
		try {
			fin = new FileInputStream("c:\\dev\\test\\2021\\05\\18\\프로젝트아이디어.txt");
			//매개변수 path의 디렉토리가 존재하지 않으면 예외 발생
			//예외가 발생하지 않고 객체가 생성되면 파일을 생성한다.
			//이때 무조건 빈파일을 생성함
			fout = new FileOutputStream("c:\\dev\\test\\2021\\05\\18\\idea_copy.txt");
			
			long start = System.nanoTime();
			
			/*
			//read()는 1바이트 단위로 읽는다.
			int readByte = 0;
			while((readByte = fin.read()) != -1) { 
				fout.write(readByte);
			}
			//write()는 1바이트 단위로 쓴다.
			//※시간 쥰내 걸림. 4981800 (nanotime)
			*/
			
			int readByteCount = 0;
			byte[] readBytes = new byte[1024*10];
			while((readByteCount = fin.read(readBytes)) != -1) {
				fout.write(readBytes,0,readByteCount);
			}
			//102700 (nanotime)
			
			long end = System.nanoTime();
			
			System.out.println("경과 시간 : "+(end-start));
			
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		finally {
			try {
				if(fin != null) fin.close();
				if(fout != null) fout.close();
			} catch (IOException e) {
				System.err.println(e.getMessage());
			}
		}
		
		
	}
}
