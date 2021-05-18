package java_20210518;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileDemo {
	
	public static String format(File f) {
		Calendar cal = Calendar.getInstance();
		//1970년 1월 1일 00:00:00 초 부터 파일을 수정한까지의 시간을
		//밀리세컨드로 반환한 값.
		cal.setTimeInMillis(f.lastModified());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
		
		return sdf.format(cal.getTime());
	}

	public static void main(String[] args) {
		
		File f1 = new File("c:\\dev\\test\\2021\\05\\18");
		
		if(f1.mkdirs()) 
			System.out.println("디렉토리를 생성했습니다.");
		else
			System.out.println("이미 디렉토리가 존재합니다.");
		
		File f2 = new File("c:\\dev\\test\\2021\\05\\18\\프로젝트아이디어.txt");
		
		System.out.println("file size : " + f2.length());
		
		boolean isFile = f2.isFile();
		boolean isDir = f2.isDirectory();
		System.out.println("is it directory? : " + isDir);
		
		if(isFile) {
			System.out.println("파일이 맞습니다.");
			System.out.println("마지막 수정 시간 : "+format(f2));
			String path = f2.getPath();
			System.out.println("경로 : "+path);
			if(path.endsWith("zip")) 
				System.out.println("압축파일");
			else if(path.endsWith("txt")) 
				System.out.println("텍스트 파일");
			else 
				System.out.println();
		}
		else {
			System.out.println("파일이 아닙니다.");
		}
		
		File f3 = new File("c:\\dev\\test\\2021\\05\\18\\프로젝트아이디어3.txt");
		
		File f4 = new File("c:\\dev\\test\\2021\\05\\18","프로젝트아이디어5.txt");
		
		f3.renameTo(f4); //f3파일을 f4 파일의 이름으로 변경
		
		String path = f4.getPath();		//자기 경로
		String parent = f4.getParent();	//상위폴더 경로
		String name = f4.getName();		//이름
		System.out.println(path + " |||| " + parent + " |||| " + name);
		
		f4.delete();				//삭제
		
		File f5 = new File("C:\\Users\\user\\eclipse-workspace\\Java_Fundamental");
		
		File[] files = f5.listFiles();
		
		for(File temp : files) {
			if(temp.isDirectory()) {
				System.out.println("이름 : "+temp.getName()+"\t\t수정시간 :  "+format(temp));
			}
			else if(temp.isFile()) {
				System.out.println("파일 이름 : "+temp.getName()+"\t크기 :  "+temp.length()+"B");
			}
		}
		
		
		
		
	}

}
