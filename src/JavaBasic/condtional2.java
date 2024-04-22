package JavaBasic;

public class condtional2 {

	public static void main(String[] args) {
		int number =85;
		
		if (number<=100) {
			System.out.println("Calculating your marks");
			if(number>=90) {
				System.out.println("GRADE A");
				if(number==100) {
					System.out.println("you got 100% scholreship");
				}
				else{
					System.out.println("Not elegible for scholerchip");
				}
			}
			else {
				if(number>=80) {
					System.out.println("Grade B");
				}
			}
		}
		else {
			System.out.println("Plz pass the right marks");
		}

	}

}
