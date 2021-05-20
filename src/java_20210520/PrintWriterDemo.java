package java_20210520;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) {
		
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		PrintWriter pw = null;
		
		try {
			fr = new FileReader("C:\\dev\\test\\2021\\05\\20\\FileDemo.java");
			br = new BufferedReader(fr);
			fw = new FileWriter("C:\\dev\\test\\2021\\05\\20\\FileDemo_copy.java"); //2번째 인자로 true를 주면
			bw = new BufferedWriter(fw);											//이어쓰기 가능 , 용량은 커짐.
			
			pw = new PrintWriter(bw,true); // true는 auto-flush
			
			long start = System.currentTimeMillis();
			
			
			String readLine = null;							 
			while((readLine = br.readLine()) != null) {		//한 줄 단위로 읽어서 저장 
				System.out.println(readLine);
				pw.println(readLine);						//코드가 짧아짐.
			}	//빠름.
			//print가 자동으로 flush 해주기 때문에 훨씬 간결해짐.
			
			
			
			
			
			
			long end = System.currentTimeMillis();
			
			System.out.println("Elapsed Time : " + (double)(end - start)/1000 + " sec");
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fr != null) fr.close();
				if(br != null) br.close();
				if(fw != null) fw.close();
				if(bw != null) bw.close();
			}catch (IOException e) {
				System.err.println(e.getMessage());
			}
		}
		

	}
	
	public void renameFile(String filename, String newFilename) {
	    File file = new File( filename );
	    File fileNew = new File( newFilename );
	    if( file.exists() ) file.renameTo( fileNew );
	}

}
