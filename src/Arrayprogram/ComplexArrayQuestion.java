package Arrayprogram;

public class ComplexArrayQuestion {

	public static void main(String[] args) {
		deleteElement();
		insertElement();
	}
	
	public static void insertElement() {
		String str[]= {"Java","Python","Javascript","Rust","Php"};
		String a=".Net";
	     int pos=3;
	     for (int i = str.length-1; i >pos-1; i--) {
			      str[i]=str[i-1];
		}
	     str[pos-1]=a;
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}  
	}

	public static void deleteElement() {
		String str[]= {"Java","Python","Javascript","Rust"};
		String element="Python";
		int count=0;
		for (int i = 0; i < str.length; i++) {
			 if(element.equals(str[i])) {
				  for (int j = i; j < str.length-1; j++) {
					   str[j]=str[j+1];
					   count++;
				}
			 }
		}if (count==0) {
			  System.out.println("Element not found");
		}else {
			System.out.println("Element deleted succesfully");
			for (int j = 0; j < str.length-1; j++) {
				   System.out.println(str[j]);
			}
		}
	}
	
	

}
