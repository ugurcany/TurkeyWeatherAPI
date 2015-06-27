package me.ugurcan.turkeyweatherapi;

public class Weather {
	
	private String date;
	private String maxTemp;
	private String minTemp;
	private String status;
	
	private String windSpeed;
	private String windDirection;

	public Weather(String date, String maxTemp, String minTemp, String status, String windSpeed, String windDirection) {

		this.date = date;
		this.maxTemp = maxTemp;
		this.minTemp = minTemp;
		this.status = status;
		
		this.windSpeed = windSpeed;
		this.windDirection = windDirection;
		
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
	
	// status
	public String getStatus() {
		return status;
	}

	protected void setStatus(String status) {
		this.status = status;
	}
	
	// wind speed
	public String getWindSpeed() {
		return windSpeed;
	}

	protected void setWindSpeed(String windSpeed) {
		this.windSpeed = windSpeed;
	}

	// wind direction
	public String getWindDirection() {
		return windDirection;
	}

	protected void setWindDirection(String windDirection) {
		this.windDirection = windDirection;
	}
	
	// print neatly
	@Override
	public String toString(){
		return "<" + date + ">\n" + 
					"temp -> " + "max: " + maxTemp + " - min: " + minTemp + " - " + status + "\n" + 
					"wind -> " + windDirection + " " + windSpeed;
	}

}
