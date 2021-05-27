package java_20210527;
//member 테이블을 클래스화 한 이유
//1. 매개변수 줄일 목적.
//2. 테이블의 한개의 row를 객체화 하기 위함.
public class MemberDto {
	//member테이블의 컬럼을 멤버변수로 설정한다.
	
	private int num;
	private String name;
	private String addr;
	private String sex;
	
	public MemberDto() {
		super();
	}
	
	public MemberDto(int num, String name, String addr, String sex) {
		super();
		this.num = num;
		this.name = name;
		this.addr = addr;
		this.sex = sex;
	}
	
	public MemberDto(String addr, String sex, int num) {
		super();
		this.num = num;
		this.addr = addr;
		this.sex = sex;
	}

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
	
}
