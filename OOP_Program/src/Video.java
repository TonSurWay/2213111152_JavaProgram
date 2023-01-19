
public class Video {
	private String title;
	private boolean checkOut = false; // beginner boolean is false
	private double averageRating;
	private int ratingSum = 0;
	private int ratingCount = 0;
	
	public void setTitle(String iTitle) {
		title = iTitle;
	}
	public String getTitle() {
		return title;
	}
	public void addRating(int rate) {
		ratingSum += rate; // ratingSum = rate + ratingSum;
		ratingCount+= 1; // ratingCount = 1 + ratingCount;
		averageRating = ratingSum/ratingCount;
	}
	public double getRating() {
		return averageRating;
	}
	public void checkOut() {
		checkOut = true;
	}
	public void returnToStore() {
		checkOut = false;
	}
	public boolean isCheckOut() {
		return checkOut;
	}
}
