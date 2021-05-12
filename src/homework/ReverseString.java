package homework;

public class ReverseString {
	public static StringBuilder reverse(String str) {
		StringBuilder s = new StringBuilder();
		for(int i = str.length()-1; i>=0;i--) {
			s.append(str.charAt(i));
		}
		return s;
	}

	public static void main(String[] args) {
		System.out.println(reverse("it is not your fault!!"));
	}

}
