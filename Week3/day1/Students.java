package Week3.day1;

public class Students {
public void getStudentInfo(int id) {
	System.out.println("Id ="+id);
}
public void getStudentInfo(int id, String name) {
	System.out.println("Id -"+id);
	System.out.println("Name - "+name);
	
}
public void getStudentInfo(String email,int phoneNumber) {
	System.out.println("Email -"+email);
	System.out.println("Phone Number -"+phoneNumber);
}
public static void main(String[] args) {
	Students details = new Students();
	details.getStudentInfo(101);
	details.getStudentInfo(101, "Tamil");
	details.getStudentInfo("abc@gmail.com", 1234567890);
	
}
}
