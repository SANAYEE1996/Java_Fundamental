package java_20210514;

import java.util.ArrayList;

public class MemberManager {
	private ArrayList<Member> list;
	
	public MemberManager() {
		list = new ArrayList<>();
	}
	
	public void insert(String id, String name, int age) {
		list.add(new Member(id,name,age));
	}
	
	public void update(String id1, String id, String name, int age) {
		for(int i = 0; i < list.size(); i++) {
			Member m = (Member) list.get(i);
			if(id1.equals(m.getId())) {
				list.set(i, new Member(id,name,age));
				break;
			}
		}
	}
	
	public void delete(String id) {
		for(int i = 0; i < list.size(); i++) {
			Member m = (Member) list.get(i);
			if(id.equals(m.getId())) {
				list.remove(i);
				break;
			}
		}
	}
	
	public ArrayList<Member> select() {
		for(int i = 0; i < list.size();i++) {
			Member mm = (Member) list.get(i);
			System.out.println(mm.getId()+" "+mm.getName()+" "+mm.getAge());
		}
		return list;
	}
	
	public void selectall() {
		for(int i = 0; i < list.size();i++) {
			Member mm = (Member) list.get(i);
			System.out.println(mm.getId()+" "+mm.getName()+" "+mm.getAge());
		}
	}
	
	public void select(String id) {
		for(int i = 0; i < list.size(); i++) {
			Member m = (Member) list.get(i);
			if(id.equals(m.getId())) {
				System.out.println(m.getId()+" "+m.getName()+" "+m.getAge());
				break;
			}
		}
	}
	
}
