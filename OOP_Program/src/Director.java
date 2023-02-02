
public class Director {
	private String name;
	private String email;
	private char gender;
	
	public Director(String name, String email , char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public Director(String name, String email) {
		this.name = name;
		this.email = email;
	}
	public String getName() {
		return name ;
	}
	public String getEmail() {
		return email;
	}
	public String getGenderName() {
		if (Character.toUpperCase(gender) == 'M') {
			return "Male";
		} else if (Character.toUpperCase(gender) == 'F') {
			return "Female";
		} else
			return "";
	}
	public String toString() {
		return getName()+"(" +getEmail() + ";" + getGenderName()+")";
	}
}
