package PracticSession;

public class ReversetheString {

	public void reverseonspot(String str, String rev) {
		String newrev = "";
		String arraystr[] = str.split(" ");
		for (String splitArray : arraystr) {
			for (int i = splitArray.length() - 1; i >= 0; i--) {
				rev = rev + splitArray.charAt(i);
			}
		}
		newrev = newrev + rev + " ";
		System.out.println(newrev);

	}

	public static void main(String[] args) {
		ReversetheString spotrev = new ReversetheString();
		spotrev.reverseonspot("Raghvendra Ramesh Pathak", "");

	}

}
