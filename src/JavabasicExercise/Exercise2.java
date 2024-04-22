package JavabasicExercise;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		 System.out.print ("Enter a int "); 
		  int input = scn.nextInt();
		   
		   if(input>0) {
			   System.out.println("It is a Positive number");
		   }else if(input<0) {
			   System.out.println("It is a negative number");
		   }else {
			   System.out.println("Number is zero");
		   }
		   

	}

}
