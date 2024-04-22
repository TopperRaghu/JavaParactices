package JavaBasic;

public class StringManipulation {

	public static void main(String[] args) {
		int a =10;
		int b =20;
		
		System.out.println(a+b);
		
		String x= "hello";
		String y= "Selenium";
		
		System.out.println(x+y);
		System.out.println(a+b+x+y);//30helloSelenium
		System.out.println(x+y+a+b);//helloSelenium
		System.out.println(x+y+(a+b));//helloSelenium30
		System.out.println(a+b+x+y+a+b);//30hellowSelenium1020
		System.out.println(a+b+x+y+(a+b));//30helloSelenium30
		
		double c=12.33;
	    double d=23.44;
	    System.out.println(x+y+c+d);//helloSelenium12.3323.44
	    char g ='m';
	    char p ='n';
	    
	    String l="testing";
	    String u="automation";
	    
	    System.out.println(l+u+g+p);
	    
	    char t1='m';// askiq value=109
	    char t2='n';
	    System.out.println(t1+t2);
	    System.out.println(t1+10);
	    System.out.println((byte) 'a');
	    
	    int s1=100;
	    int s2=300;
	    
	    System.out.println("the value of s1 :"+s1);
	    System.out.println("the value of s1 :"+s2);
	    System.out.println("the sum is :" +s1 +s2);
	    System.out.println("the sum is :" +(s1 +s2));
	    
	    
	    
	    
	}
	

}
