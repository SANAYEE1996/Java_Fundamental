package java_20210514;

import java.util.ArrayList;

class Product{
	private int number;
	private String name;
	private double price;
	
	public Product() {
		super();
	}
	
	public Product(int number, String name, double price) {
		super();
		this.number = number;
		this.name = name;
		this.price = price;
	}

	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}

public class ListDemo {

	public static Product selectByNumber() {
		return new Product(1,"shoes",100000);
	}
	
	public static ArrayList<Product> select() {
		ArrayList<Product> list = new ArrayList<Product>();
		list.add(new Product(2,"egg",5000));
		list.add(new Product(3,"milk",2000));
		list.add(new Product(4,"water",1000));
		list.add(new Product(5,"pepper",500));
		
		return list;
	}
	
	public static void main(String[] args) {
		
		//ArrayList : 순서가 잇고, 객체의 중복을 허용한다.
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(4);
		list.add(3);
		
		for(Integer tmp : list) {
			System.out.println(tmp);
		}
		
		Product pro = selectByNumber();
		System.out.println(pro.getNumber() + "\t" +pro.getName()+ "\t"+pro.getPrice());
		
		ArrayList<Product> list2 = select();
		for(int i = 0; i < list2.size(); i++) {
			Product p = (Product) list2.get(i);
			System.out.println(p.getNumber()+"\t"+p.getName()+"\t"+p.getPrice());
		}
		
		
		

	}

}
