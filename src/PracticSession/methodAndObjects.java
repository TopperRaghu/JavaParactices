package PracticSession;

public class methodAndObjects {

	public void aa() {
		System.out.println("NonStatic----AA");
		bb();
	}
	
    public void bb() {
    	System.out.println("NonStatic----BB");
    	cc();
	}
    public void cc() {
    	System.out.println("NonStatic----CC");
    	//aa();
	}
    
    public static void mm() {
    	System.out.println("Static--mm");
    	methodAndObjects mo=new methodAndObjects();
    	mo.bb();
	}
    public static void nn() {
    	System.out.println("Static--nn");
	}
	
	public static void main(String[] args) {
		methodAndObjects mo=new methodAndObjects();
		mm();
		mo.aa();

	}

}
