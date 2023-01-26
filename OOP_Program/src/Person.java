
public class Person {
	private String firstName;
	private String lastName;
	
	public Person() {
		this("","");
	}
	public Person(String first, String last) {
		this.firstName = first;
		this.lastName = last;
	}
	public void setName(String first, String last) {
		firstName = first;
		lastName = last;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public String toString() {
		return getFirstName()+" "+getlastName();
	}
	
}
