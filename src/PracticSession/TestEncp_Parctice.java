package PracticSession;

public class TestEncp_Parctice {

	public static void main(String[] args) {
		Encap_Practice ep=new Encap_Practice("Raghu", "27/08/1996", 27, "Banglore");
		int i=ep.getAge();
		System.out.println(i);
		System.out.println(ep.getName()+" "+ep.getDob()+" "+ep.getAge()+" "+ep.getPlace());
		
		ep.setPlace("Nagpur");
		
		System.out.println(ep.getName()+" "+ep.getDob()+" "+ep.getAge()+" "+ep.getPlace());
		
		

	}

}
