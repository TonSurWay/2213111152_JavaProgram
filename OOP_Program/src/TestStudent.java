
public class TestStudent {

	public static void main(String[] args) {
		//TestConstructor and toString
		Student passakorn = new Student("Passakorn Saewong","1 Haapy Ave");
		System.out.println(passakorn);
		
		//Test Getters and Setters
		passakorn.setAddress("25 Pattanakarn");
		System.out.println(passakorn); //toString()
		System.out.println(passakorn.getName());
		System.out.println(passakorn.getAddress());
		System.out.println();
		
		//Test addCourseGrade(),printGrade(), and getAverageGrade()
		passakorn.addCourseGrade("INT-107", 25);
		passakorn.addCourseGrade("INT-108", 79);
		passakorn.addCourseGrade("MSC-202", 69);
		passakorn.printGrade();
		
		System.out.printf("The average grade is %.2f%n", passakorn.getAverageGrade());
	}
}
