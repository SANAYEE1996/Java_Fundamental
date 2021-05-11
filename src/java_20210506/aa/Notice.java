package java_20210506.aa;

public class Notice {

	public int number;
	protected String title;
	int hit;
	private String regdate;
	public static void main(String[] args) {
		Notice n = new Notice();
		n.number = 1; 				//public access available
		n.title = "공지사항 입니다"; 	//protected access available
		n.hit = 0;					//default access available
		n.regdate = "2021-05-06";	//private access denied
		
	}
}
