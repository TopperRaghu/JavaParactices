package JavaBasic;

public class PractiveJava {
	public static void main(String[] args) {
		String s="Selenium";
		int len=s.length();
		String rev="";//
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev +s.charAt(i);//mu
		}System.out.println("String is reverse>>>"+rev);
		
		StringBuffer str=new StringBuffer(s);
	
		
		System.out.println(str.reverse());
	System.out.println("-----------------------");
	String sf="*&^$#@% latin string 0123456789";
	String sf1=sf.replace("*&^$#@%", "");
	String sf2=sf1.replace("0123456789", "");
	System.out.println(sf2);
	System.out.println("--------------------------");
	sf=sf.replaceAll("[^a-zA-z0-9]", "");
	System.out.println(sf);
	
	
	
	}


	
	
}
