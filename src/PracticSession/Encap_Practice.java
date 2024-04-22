package PracticSession;

public class Encap_Practice {
	private String name;
	private String dob;
	private int age;
	private String place;
	
	public Encap_Practice(String name, String dob, int age, String place) {
		this.name = name;
		this.dob = dob;
		this.age = age;
		this.place = place;
		isbachore();
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getName() {
		return name;
	}
	public String getDob() {
		return dob;
	}
	public int getAge() {
		return age;
	}
	public String getPlace() {
		return place;
	}
	
    public void isbachore() {
		System.out.println("Bachlore");
	}
	
	
	
	

}
