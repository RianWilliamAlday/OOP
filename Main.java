public class Main
{
	public static void main(String[] args) {
		Student student1 = new Student("Kai Dela Vuega", "Lian, Batangas", "BSIT", 2);
		System.out.println("Student Name: " + student1.getName());
	    System.out.println("Student Address: " + student1.getAddress());
	    System.out.println("Student Program: " + student1.getProgram());
		System.out.println("Student Year: " + student1.getYear());
		
		Staff staff1 = new Staff("Kurt Angle", "Balayan, Batangas", "Batangas State University", 600.00f );
		System.out.println("Staff Name: " + staff1.getName());
	    System.out.println("Address: " + staff1.getAddress());
		System.out.println("School: " + staff1.getSchool());
		System.out.println("Salary: " + staff1.getSalary());



	}
	
}