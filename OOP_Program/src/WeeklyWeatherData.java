
public class WeeklyWeatherData {
	static int NUMDAYS = 7;
	private double[] rainFall = new double[NUMDAYS];
	private double[] avgPressure = new double[NUMDAYS];
	private double avgRain;
	private double maxRain;

	public void setData(double[] rain, double[] pressure) {
		rainFall = rain;
		avgPressure = pressure;
	}

	public void calculateStats() {
		maxRain = 0.0;
		double rainSum = 0.0;

		for (int i = 0; i < rainFall.length; i++) {
			if(rainFall[i]>=maxRain) {
				maxRain = rainFall[i];
			}
			rainSum += rainFall[i];
			
		}// end for loop
		avgRain = rainSum/NUMDAYS;
	}//end of calculateStats
	public double getavgRain() {
		return avgRain;
	}
	public double getmaxRain() {
		return maxRain;
	}
}
