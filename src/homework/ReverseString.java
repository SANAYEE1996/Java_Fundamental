package homework;

public class ReverseString {
	public static StringBuilder reverse(String str) {
		StringBuilder s = new StringBuilder();
		char a;
		for(int i = str.length()-1; i>=0;i--) {
			a = str.charAt(i);
			s.append(a);
		}
		return s;
	}

	public static void main(String[] args) {
		System.out.println(reverse("it is not your fault!!"));
	}

}
