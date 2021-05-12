package java_20210512;

class Test{
	String name;
	Test(String name){
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test other = (Test) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Test [name=" + name + ", hashCode()=" + hashCode() + "]";
	}
	
	
}


public class ObjectDemo {

	public static void main(String[] args) {
		Test t = new Test("서울");
		Test t1 = new Test("서울");
		System.out.println(t == t1);
		System.out.println(t.equals(t1));
		
		System.out.println(t.hashCode());
		System.out.println(t1.hashCode());
		
		System.out.println(t.name.hashCode());
		System.out.println(t1.name.hashCode());
		
		System.out.println(t.name.equals(t1.name));
		
		System.out.println(t.hashCode());
		System.out.println(t1.hashCode());
		
		System.out.println(t);
	}

}
