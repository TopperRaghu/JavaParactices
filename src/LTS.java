import java.io.File;

public class LTS {

	public static void main(String[] args) {
		File folder=new File("C:\\Users\\pramesh\\Downloads\\Automation");
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("Folder is created::"+folder);
		}
   
	}

}
