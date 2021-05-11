package java_20210506.aa;

public class NoticeDemo {
	
	public static void main(String[] args) {
		Notice n = new Notice();
		n.number = 1; //public은 서로 다른 패키지에서 접근 가능
		n.title = "공지사항 입니다"; //protected는 서로다른 패키지이면서 
								//상속받은 경우만 접근 가능
		n.hit = 0;				//default는 같은 패키지 내에서 접근 가능
		//n.regdate = "2021-05-06";//private는 같은 클래스 내에서만 접근 가능
		
		
		
		
	}
	
}
