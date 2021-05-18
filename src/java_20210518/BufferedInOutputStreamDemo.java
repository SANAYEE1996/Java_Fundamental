package java_20210518;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInOutputStreamDemo {

	public static void main(String[] args) {
		FileInputStream fin = null;
		FileOutputStream fout = null;
		
		BufferedInputStream bin = null;
		BufferedOutputStream bout = null;
		
		try {
			
			//1. FileInputStream과 FileOutputStream을 이용하여
			// 1바이트씩 읽어서 1바이트 출력한 예제.
			fin = new FileInputStream("C:\\dev\\test\\2021\\05\\18\\apache-tomcat-9.0.46.zip");
			fout = new FileOutputStream("C:\\dev\\test\\2021\\05\\18\\apache-tomcat-9.0.46_copy.zip");
			
			
			/*
			int rbyte = 0;
			while((rbyte = fin.read()) != -1){
				fout.write(rbyte);
			}//경과시간 : 45초 (17756kb 크기)
			*/
			
			
			
			//2. BufferedInputStream과 BufferedOutputStream을 이용.
			// 1바이트 단위로 읽고 출력한 예제.
			// BufferedOutputStream의 버퍼(byte[]) 공간에 가득 차 있으면 출력한다.
			// 만약 다 채워지지 않으면 출력하지 않음.
			// 이런 경우 flush() 메서드를 호출하여 모든 남은 버퍼를 출력해줘야 한다.
			// flush() 메서드는 '사용자가 원할때' 라는 것을 인지할 것.
			// 버퍼 크기를 어느정도 늘려주는 것은 속도 향상에 영향을 끼친다.
			bin = new BufferedInputStream(fin);
			bout = new BufferedOutputStream(fout);
			
			long start = System.currentTimeMillis();
			
			int rbyte = 0;
			while((rbyte = bin.read())!= -1) {
				bout.write(rbyte);
			}//경과시간 : 0.3초 (17756kb 크기)
			bout.flush();	//버퍼를 비워준다.
			
			
			 
			
			/*
			int rbyte = 0;
			byte[] rbytes = new byte[1024*10];
			while((rbyte = fin.read(rbytes))!= -1) {
				fout.write(rbytes,0,rbyte);
			}//경과 시간 : 0.015초 (17756kb 크기) // 제일 빠름.
			*/
			long end = System.currentTimeMillis();
			System.out.println("경과 시간 : "+(end - start));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fin != null) fin.close();
				if(bin != null) bin.close();
				if(fout != null) fout.close();
				if(bout != null) bout.close();
			}catch(IOException e) {
				System.err.println(e.getMessage());
			}
		}
		
		
	}
}
