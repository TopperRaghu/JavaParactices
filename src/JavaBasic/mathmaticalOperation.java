package JavaBasic;

public class mathmaticalOperation {

	public static void main(String[] args) {
		System.out.println(4/2);
		System.out.println(4+2);
		System.out.println(4*2);
		
		System.out.println(9/2);//reason int divided by int will always give int resultant remove point
		System.out.println(9.0/2);
		System.out.println(9/2.0);
		System.out.println(9/2f);
		System.out.println((float)9/2);
		
		System.out.println(0/9);
		//System.out.println(9/0);//Exception will be thrown
		
		//System.out.println(0/0);//Exception will be thrown
		
		System.out.println(9.0/0);//if u diveide any float no by 0 it will give "infinity"
		System.out.println(9/0.0);//same
		System.out.println(9.0/0.0);
		System.out.println(0.0/0.0);//special NaN not a number bcz 0.0 is not a number
		System.out.println(0.0/2.0);
		
		System.out.println('a'/2);
		System.out.println(9 % 3);//% will alway give us reaminder
		

	}

}
