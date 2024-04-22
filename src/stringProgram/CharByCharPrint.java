package stringProgram;

public class CharByCharPrint {
	
	public void countVowel(String s,String news,int count) {
	
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				news=news+ch;
				count++;
			}
			
		}System.out.println(count);
		System.out.println(news);
	}


	public static void main(String[] args) {
		CharByCharPrint cp=new CharByCharPrint();
		cp.countVowel("Raghvendra", "", 0);
		
		
		String str="Raghvendra Kumar Pathak";
		String uppercase="";
		int countUpper=0;
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			//System.out.println(ch+" "+(int)ch);
			if(Character.isUpperCase(ch)) {
				//uppercase=uppercase+ch+" ";
				countUpper++;
			}
		}System.out.println(countUpper);

	}

}
