package PracticSession;

public class CountandfindspclChar {

	public static void main(String[] args) {
		String s="CloudTech&*#";
		String sr="Raghvendra Pathak";
		int count=0;
		String s1="";
		String sr1="";
		for(int i=0;i<s.length();i++) {
			//char ch=s.charAt(i);
			if(!Character.isDigit(s.charAt(i))&&!Character.isLetter(s.charAt(i))&&!Character.isWhitespace(s.charAt(i))) {
				count++;
			}else {
				s1=s1+s.charAt(i);
			}
			
		}System.out.println(count);
		System.out.println(s1);
		
		for(int i=0;i<sr.length();i++) {
			char ch=sr.toLowerCase().charAt(i);
			   if(ch!='c') {
				   sr1=sr1+ch;
				   
			   }
			}System.out.println(sr1);
		
		
		
		
		
	}

}
