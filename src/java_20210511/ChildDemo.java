package java_20210511;

public class ChildDemo {

	public static void main(String[] args) {
		
		Child ch = new Child("park","man",26,"010-30-40",175,78.0);
		Child ch1 = new Child("010-30-40",175,78.0);
		
		System.out.println(ch1.addr +" "+ch1.age+" "+ch1.name+" "
							+ch1.height+" "+ch1.phone+" "+ch1.weight);
		
		System.out.println(ch.addr +" "+ch.age+" "+ch.name+" "
							+ch.height+" "+ch.phone+" "+ch.weight);
	}

}
