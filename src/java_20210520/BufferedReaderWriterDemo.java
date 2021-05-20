package java_20210520;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderWriterDemo {

	public static void main(String[] args) {
		
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fr = new FileReader("C:\\dev\\test\\2021\\05\\20\\FileDemo.java");
			br = new BufferedReader(fr);
			fw = new FileWriter("C:\\dev\\test\\2021\\05\\20\\FileDemo_copy.java");
			bw = new BufferedWriter(fw);
			
			long start = System.currentTimeMillis();
			
			
			String readLine = null;							 
			while((readLine = br.readLine()) != null) {		//한 줄 단위로 읽어서 저장 
				System.out.println(readLine);
				bw.write(readLine);							//한 줄 단위로 쓴다
				bw.newLine();				//readLine 변수에는 개행을 포함하지 않아서 개행을 넣어준다. 
			}	//빠름.
			bw.flush();
			
			
			
			
			
			
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

}
