
public class PersonalInfo {
	private Person name;
	private Date dDay;
	private int personID;
	
	public PersonalInfo() {
		name = new Person();
		dDay = new Date();
		this.personID = 0;
	}
	public PersonalInfo(String first, String last, int month,int day, int year, int ID) {
		//initialize the object name
		name = new Person(first,last);
		//initialize the object dDay
		dDay = new Date(month,day,year);
		this.personID = ID;
		
		
	}
	public void setPersonalInfo(String first, String last, int month,int day, int year, int ID) {
		name.setName(first, last);
		dDay.setDate(month, day, year);
		personID = ID;
	}
	public String toString() {
		return "Name: " + name.toString()
		+"\nDate of birth: " + dDay.toString()
		+"\nPersonal ID: " + personID;
	}
}
