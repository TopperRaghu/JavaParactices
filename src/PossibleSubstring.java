
public class PossibleSubstring {

	public static void main(String[] args) {
		findThePossibleSubstring("Raghvendra");
		
		demo();

	}

	public static void demo() {
		String str="Raghvendra Pathak";
		String word="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);//
			if(ch!=' ') {
				word=word+ch;//Pathak
			}else {
				System.out.print(word.substring(0, 1)+".");//R.
				word="";
			}
		}System.out.print(word);
		
	}

	public static void findThePossibleSubstring(String string) {
	int count=0;
		for(int i=0;i<string.length();i++) {
			for(int j=i+1;j<string.length();j++) {
				count++;
				System.out.println(string.substring(i, j));
			}
		}System.out.println("Total all posssible substring::"+count);
	}
	
	

	
	

}
