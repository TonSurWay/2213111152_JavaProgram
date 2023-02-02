
public class Theater extends Movie{
	private int theaterNo;
	public Theater(String id,String name,Director director,int TheaterNo) {
		super(id,name,director);
		this.theaterNo=TheaterNo;
	}	

	public Theater() {
		super();
		this.theaterNo=0;
	}

	public String getTheaterName() {
		if (this.theaterNo>0&&this.theaterNo<12) {
			return "Basic Theater";
		}
		else if (this.theaterNo>11&&this.theaterNo<15) {
			return "Sweet Theater";
		}
		else if (this.theaterNo==15) {
			return "Premium Theater";
		}
		else return null;

	}

	public String toString() {
		return getTheaterName()+": "+super.toString();
	}
}
