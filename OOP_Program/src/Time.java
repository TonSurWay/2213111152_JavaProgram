
public class Time {
	private int second;
	private int minute;
	private int hour;

	// Default Constructor

	public Time() {
		this.second = 0;
		this.minute = 0;
		this.hour = 0;
	}

	public Time(int second, int minute, int hour) {
		this.second = second;
		this.minute = minute;
		this.hour = hour;

	}

	// Getter and Setter methods
	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public String toString() {
		// Use function String.format() to form a formated String
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}

	// Set second,minute and hour to the given values
	public void setTime(int second, int minute, int hour) {
		this.second = second;
		this.minute = minute;
		this.hour = hour;

	}

	// Advances this Time instance by one second
	public Time nextSecond() {
		++second;
		if (second >= 60) {
			second = 0;
			++minute;
			if (minute >= 60) {
				minute = 0;
				++hour;
				if(hour>=24) {
					hour = 0;
				}//end of hour
				
			}//end of minute
			
		}//end of second
		
		//Return "this" instance,to support chaining operations
		//e.g. , t1.nextSecond().nextSecond()
		return this;
	}//end of nextSecond
}
