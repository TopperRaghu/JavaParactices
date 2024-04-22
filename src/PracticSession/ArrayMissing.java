package PracticSession;

public class ArrayMissing {

	public static void main(String[] args) {
		int []num= {2,3,4,5,6,7,8,9,10};
		int sum1=0;
		int sum2=0;
		
	    for(int i=0;i<num.length;i++) {
	    	sum1=sum1+num[i];
	    }System.out.println(sum1);
		 
       for(int j=1;j<=10;j++) {
    	   sum2=sum2+j;
       }System.out.println(sum2);
       System.out.println("Missing no is>>>>"+(sum2-sum1));
	}

}
