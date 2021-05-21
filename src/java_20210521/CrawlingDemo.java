package java_20210521;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlingDemo {

	public static void main(String[] args) {
		
		String url = "http://www.imbc.com/";
		//html 문서를 관리하기 위한 객체
		Document doc = null;
		
		try {
			doc = Jsoup.connect(url).get();
			
			
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		
		//jsoup은 css의 문법을 따라해서 #이 아닌 .으로 적는다.
		Elements elements = doc.select(".notice-list li");
		
		for(Element e : elements) {
			System.out.println(e.text());
		}
		
	}

}
