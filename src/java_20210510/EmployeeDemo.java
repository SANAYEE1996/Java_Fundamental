package java_20210510;

public class EmployeeDemo {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.name = "park young sang";		//Emplyee 부모 클래스인 Customer의 
										//모든 멤버변수(name,phone1,phone2,phone3)를
										//사용할 수 있다.
		e.phone1 = "010";				
		e.phone2 = "3237";				
		e.phone3 = "0219";				
										
		e.zipcode = "38864";			
		e.addr1 = "daegu";				
		e.addr2 = "Suseong";			
		e.id = "dudtkd0219";			
		e.pwd = "******";				
		
		
		
	}

}
