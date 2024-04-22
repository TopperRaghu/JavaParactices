package String_Manipulation;

public class StringImmutable {

	public static void main(String[] args) {
		String s = "Selenium";
		String t = s + "Hello";

		System.out.println(t);
		System.out.println(s);

		String st = "Java";
		System.out.println(st + "Python");
		System.out.println(st);
		// mutable classes
		StringBuilder sb = new StringBuilder("Testing");
		System.out.println(sb);
		sb.append("Automation");
		System.out.println(sb);
		System.out.println(sb.reverse());
		name();
	}

	public static void name() {
		String s = "Raghvendra";
		char[] t = s.toCharArray();
		String d = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'R') {
				d = d + s.charAt(i);
			}
		}System.out.println("My name start with-->"+d);
	}
}
