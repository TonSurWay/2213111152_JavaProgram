
public class FictionBook implements Author3, Book2{
	private String author_name;
	private String email;
	private String title;
	private int publicYear;
	
	public FictionBook(String title, int publicYear) {
		this.title = title;
		this.publicYear = publicYear;
	}
	public void setAuthorName(String name) {
		author_name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean checkFormatName() {
		String firstName = "";
		if(firstName == author_name.substring(0, author_name.indexOf(' '))) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public String getLastName() {
		String lastName = author_name.substring(0, author_name.indexOf(' '));
		lastName = lastName.substring(0, 0);
		return lastName.toUpperCase();	
		}
	public String getFirstname() {
		String firstName = author_name.substring(0, author_name.indexOf(' '));
		
		return firstName.toUpperCase();
	}
	public boolean checkEmail(String email) {
		if(email.endsWith("@hotmail.com") || email.endsWith("@windowslive.com")) {
			return true;
		}
		else {
			return false;
		}
	}
	public int totalPublicYear() {
		return 2023-publicYear;
	}
	public String toString() {
		return getTitle()+ "write by" + getLastName()+"."+getFirstName()+"("+email+") \nPublished for"+ totalPublicYear()+"years.";
	}
	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean checkEmail() {
		// TODO Auto-generated method stub
		return false;
	}
}
