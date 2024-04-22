package JavaBasic;

public class SwitchCaseconcept1 {

	public static void main(String[] args) {
		//Wap to check given alphabet is Vovel or consonat using Switch case 
		char ch='a';
		switch (ch) {
		case 'a':
			System.out.println(ch+ " : is a vowel");
	    break;
		case 'e':
			System.out.println(ch+ " : is a vowel");
	    break;
		case 'i':
			System.out.println(ch+ " : is a vowel");
	    break;
		case 'o':
			System.out.println(ch+ " : is a vowel");
	    break;
		case 'u':
			System.out.println(ch+ " : is a vowel");
	    break;
	    
		default:
			System.out.println(ch+ ": is a consonant");
			break;
		}
		//QA, STAGE, UAT, DEV, PROD
	String envname=" Q A   ";
	switch (envname.toLowerCase().trim()) {
	case "qa":
		System.out.println("run tests on QA");
    break;
	case "stage":
		System.out.println("run tests on STAGE");
    break;
	case "Dev":
		System.out.println("run tests on DEV");
    break; 
	case "UAT":
		System.out.println("run tests on UAT");
    break;
	case "PROD":
		System.out.println("run tests on PROD");
    break;
	default:
		System.out.println("please pass the right env::" +envname);
		break;
	}
	
	}
	
	

	
	
	
	
	
}
