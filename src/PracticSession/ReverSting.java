package PracticSession;

public class ReverSting {

	public static void main(String[] args) {
		String str = "Pathak Raghva";
		String string[] = str.split(" ");
		String revstring = "";
//		char[] strr=str.toCharArray();
//		int len=strr.length;
//		String revstring="";
//		for(int i=len-1;i>=0;i--) {
//			revstring=revstring+strr[i];
//		}System.out.println(revstring);
//		
		StringBuffer str1 = new StringBuffer(str);
		//System.out.println(str1.reverse());

		StringBuilder str2 = new StringBuilder();
		System.out.println(str2.reverse());
		for (int i = 0; i <str.length(); i++) {
			String s = string[i];
			try {
				for (int j = s.length()-1; j >0; j--) {
					revstring = revstring + s.charAt(j);
				}
			} catch (IndexOutOfBoundsException e) {
				e.printStackTrace();
			}
		}
		System.out.println(revstring);

	}

}
