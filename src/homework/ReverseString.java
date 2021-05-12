package homework;

public class ReverseString {
	public static StringBuilder reverse(String str) {
		StringBuilder s = new StringBuilder();
		for(int i = str.length()-1; i>=0;i--) {
			s.append(str.charAt(i));
		}
		return s;
	}
	
	public static String reve(String str) {
		String s = "";
		for(int i = str.length(); i > 0; i--) {
			s = s.concat(str.substring(i-1,i));
		}	
		return s;
	}

	public static void main(String[] args) {
		System.out.println(reverse("it is not your fault!!"));
		System.out.println(reve("it is not your fault!!"));
	}

}
