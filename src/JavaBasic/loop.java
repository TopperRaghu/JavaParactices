package JavaBasic;

import java.util.ArrayList;
import java.util.Arrays;

public class loop {

	public static void main(String[] args) {
		loop lp=new loop();
		lp.stringManipultion("Selenium and Java", 0, 0);
		int add=lp.testarraypractice(30, 40, 0);
		if((add-5)%2!=0) {
			System.out.println("Number is odd");
		}
		
		System.out.println("-----------------------------");
		String str ="Pathak";
		System.out.println(str.length());
		char ch[]=str.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
			count++;
		}
		System.out.println("The lenth will be "+count);
      }
  public int testarraypractice(int a,int b,int sum) {
		 sum=a+b;
		 System.out.println(sum);
		 return sum;
	}
	public  void stringManipultion(String strr,int count,int countt) {
		String []str=strr.split(" ");
		ArrayList<String> list=new ArrayList<String>(Arrays.asList(str));
		list.add("Raghvendra");
		list.add("Automation");
		list.add("Automation");
		System.out.println(list);
		for(int i=0; i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				if(list.get(i)==(list.get(j))&&list.get(i)!=list.get(j))
					countt++;
			}System.out.println(countt);
			if(list.get(i).equalsIgnoreCase("Raghvendra")) {
				count++;
				//System.out.println("Bravo");
			}
	   }System.out.println(count);
	
	}	


}
