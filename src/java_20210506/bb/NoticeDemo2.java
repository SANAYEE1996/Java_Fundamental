package java_20210506.bb;

import java_20210506.aa.Notice;

public class NoticeDemo2 extends Notice{

	public static void main(String[] args) {
		
		//서로 다른 패키지의 클래스를 사용하기 위해서는
		//import 구분을 사용해야 한다.
		//package => import -> class 순으로 코딩해야 한다.
		Notice n = new Notice();
		
		n.number = 1;	//public은 서로 다른 패키지에서도 접근 가능
		//n.title = "";	//protected는 서로다른 패키지에서 접근하려면
						//상속을 받아야 함.
		//n.hit = 10;		//default는 서로 다른 패키지에서 접근 불가능
		//n.regdate = "";	//private는 서로 다른 패키지에서 접근 불가능
		
		NoticeDemo2 n1 = new NoticeDemo2();
		n1.number = 1;
		n1.title = "";		//상속 받았으니 접근 가능
		//n1.hit = 10;
		//n1.regdate = "";
		
	}

}
