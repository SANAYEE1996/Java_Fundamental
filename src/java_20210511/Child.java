package java_20210511;

public class Child extends Parent{
	String phone;
	double weight;
	double height;
	public Child(String phone,double weight,double height) {
		this.phone = phone;
		this.weight = weight;
		this.height = height;
	}
	
	public Child(String name, String addr, int age, String phone, double weight, double height) {
		super(name, addr, age);
		this.phone = phone;
		this.weight = weight;
		this.height = height;
	}
	
	
}
