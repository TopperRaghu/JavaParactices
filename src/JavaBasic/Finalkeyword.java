package JavaBasic;

public class Finalkeyword {

	public static void main(String[] args) {
		//use to define the constant value
		
		int x =10;
		x=20;
		x=30;
		x=40;
		System.out.println(x);
		
		 final int days = 7;
		//days =10;
		int salary = days*100;
		System.out.println(salary);
		
//		final int DEFAULT_TIME_OUT = 10;
//		
//	    final String LOGIN_PAGE_TITLE = "Amazon login";
//		
//	    final char GENDER = 'f';

        char ch='e';
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
			System.out.println(ch + " is vowel ");
		}else {
			System.out.println(ch + " is consonant ");
		}
	}

}
