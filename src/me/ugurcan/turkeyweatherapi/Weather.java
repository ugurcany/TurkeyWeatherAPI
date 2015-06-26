package me.ugurcan.turkeyweatherapi;

public class Weather {
	
	private String date;
	private String maxTemp;
	private String minTemp;

	public Weather(String date, String maxTemp, String minTemp) {

		this.date = date;
		this.maxTemp = maxTemp;
		this.minTemp = minTemp;
		
	}
	
	// date
	public String getDate() {
		return date;
	}

	protected void setDate(String date) {
		this.date = date;
	}

	// max temp
	public String getMaxTemp() {
		return maxTemp;
	}

	protected void setMaxTemp(String maxTemp) {
		this.maxTemp = maxTemp;
	}

	// min temp
	public String getMinTemp() {
		return minTemp;
	}

	protected void setMinTemp(String minTemp) {
		this.minTemp = minTemp;
	}
	
	// print neatly
	@Override
	public String toString(){
		return date + " -> " + "max: " + maxTemp + " - min: " + minTemp ;
	}

}
