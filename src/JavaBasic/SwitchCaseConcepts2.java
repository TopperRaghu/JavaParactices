package JavaBasic;

public class SwitchCaseConcepts2 {

	public static void main(String[] args) {
		String str= "Selenium";
		switch (str) {
		case "Selenium":	
		System.out.println("Web automation using Selenium");
		break;
		case "Cypress":
		System.out.println("Web automation using Cypress");
		break;
		case "Playwright":
		System.out.println("Web automation using Playwright");
		break;
		default:
		break;
		}
	}

}
