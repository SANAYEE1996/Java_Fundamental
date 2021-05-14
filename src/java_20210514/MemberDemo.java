package java_20210514;

public class MemberDemo {

	public static void main(String[] args) {
		MemberManager m = new MemberManager();
		m.insert("21511744","박영상",26);
		m.insert("21511778","이종민",28);
		m.insert("21511804","황상혁",27);
		m.insert("21511742","배재병",26);
		
		System.out.println("========================select all=====================");
		
		m.selectall();
		
		System.out.println("\n========================delete=========================");
		
		m.delete("21511744");
		m.selectall();
		
		System.out.println("\n========================update=========================");
		
		m.update("21511778", "21511701", "김무신", 21);
		m.selectall();
		
		System.out.println("\n========================select=========================");
		
		m.select("21511742");
	}
}
