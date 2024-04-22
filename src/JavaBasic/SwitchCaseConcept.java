package JavaBasic;

public class SwitchCaseConcept {

	public static void main(String[] args) {
		
		String browser ="Chrome";
		switch (browser.replace("Chrome", "chrome")) {
		
		case "chrome": 
			System.out.println("Lunch Chrome");
			break;
		               
		case "Firefox": 
			System.out.println("Lunch Firefox");
			break;          
		
		case "Safari": 
			System.out.println("Lunch Safari");
			break;
		               
		case "Ie": 
			System.out.println("Lunch Ie");
			break;
			
		default:
			System.out.println("Please pass the correct browse....");
			break;
		}
	}
	
}
