package JavaBasic;

public class conditonal3 {

	public static void main(String[] args) {
		//String browser ="chrome";
		
//		if(browser.equals("chrome")) {
//			System.out.println("Launch chrome");
//		}
//		
//		if(browser.equals("firefox")) {
//			System.out.println("Launch firefox");
//		}
//		if(browser.equals("safari")) {
//			System.out.println("Launch safari");
//		}
//		
//		if(browser.equals("ie")) {
//			System.out.println("Launch ie");
//		}
//	}
		
		conditonal3 cd3=new conditonal3();
		cd3.browserSwitch();
	//if-elseif

		String browser ="safari";
		
		if(browser.equals("Chrome")) {
			System.out.println("Launch chrome");
		}
		
		else if(browser.equals("firefox")) {
			System.out.println("Launch firefox");
		}
		
		else if(browser.equals("safari")) {
			System.out.println("Launch safari");
		}
		else if(browser.equals("ie")) {
			System.out.println("Launch ie");
		}
		
		else {
			System.out.println("Plz pass right browser");
		}
		
		
			
		
}
	
	public void browserSwitch() {
		String browser="Firefox";
		if(browser.equals("Chrome")) {
			System.out.println("Launch the chrome browser");
		}else if(browser.equals("Firefox")) {
			System.out.println("Launch the firefox browser");
		}else if(browser.equals("Safari")) {
			System.out.println("Launch the chrome browser");
		}else {
			System.out.println("Plz pass the correct browser");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

