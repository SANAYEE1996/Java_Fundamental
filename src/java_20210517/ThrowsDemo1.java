package java_20210517;

import java.io.FileNotFoundException;
import java.io.FileReader;
public class ThrowsDemo1 {
	
	public static void m() throws FileNotFoundException{
		FileReader f = new FileReader("");
		
	}
	
	public static void m1(String path) throws FileNotFoundException{
		FileReader f = new FileReader(path);
		
	}
	
	public static void main(String[] args) throws FileNotFoundException{
		//m();
		try {
			String path = args[0];
			m1(path);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
			System.err.println("경로와 파일명을 정확히 입력 하세요. ");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.err.println("실행시 파일명을 입력하세요.");
			System.err.println("예");
			
		}
	}

}
