package String_Manipulation;

public class StrinConcepts {

	public static void main(String[] args) {
		String s = "Hello";
		String s1 = "Hello";
		String s2 = "hello";
		System.out.println(s == s1);
		System.out.println(s1 == s2);
		// string with object
		String st = new String("Java");
		String st1 = new String("Hello");

		System.out.println(s == st1);
		System.out.println(s.equals(st1));
		String test = new String("Selenium");// ----->Heap
		test.intern();// it will try to create entry in "SCP"
		String t1 = "Selenium";
		// total object=2
		findStringLength();
	}

	public static void findStringLength() {
		String name = "Raghvendra";
		char arrayName[] = name.toCharArray();
		int count=0;
		for (int i = 0; i < arrayName.length; i++) {
                 count++;
		}System.out.println(count+" is the length");
	}

}
