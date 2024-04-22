package JavaLoops;

public class loop2 {

	public static void main(String[] args) {
		for(char ch='a'; ch<='z'; ch++) {
			System.out.print(ch+ "="+(byte)ch +" ");
			//System.out.print(ch+" ");
		}
		
		for(int i=1; i<=100; i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}

	}
//Use cases of while loop
	// When numbers of iteration is not fixed
	// Example total no of links/images on the web page
	// Web table pagination 1 2 3 4......next
	// web element is loading on the page not sure how much time it will take to load the page
	// page load time out
	// Calender
	// build is running or jenkin pipeline is running we are not sure when will be build availabele for qa team for testing 10 ims 20 mins 1 hr 2hr
}
