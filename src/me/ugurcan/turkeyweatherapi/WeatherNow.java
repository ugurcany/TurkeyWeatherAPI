package me.ugurcan.turkeyweatherapi;

public class WeatherNow {
	
	private String lastUpdate;
	private String temp;
	private String status;
	private String humidity;
	private String pressure;
	private String visibility;
	
	private String windSpeed;
	private String windDirection;

	public WeatherNow(String lastUpdate, String temp, String status, String humidity, String pressure, String visibility, String windSpeed, String windDirection) {
		
		this.lastUpdate = lastUpdate;
		this.temp = temp;
		this.status = status;
		this.humidity = humidity;
		this.pressure = pressure;
		this.visibility = visibility;
		
		this.windSpeed = windSpeed;
		this.windDirection = windDirection;
		
	}
	
	// last update
	public String getLastUpdate() {
		return lastUpdate;
	}

	protected void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	// temp
	public String getTemp() {
		return temp;
	}

	protected void setTemp(String temp) {
		this.temp = temp;
	}
	
	// status
	public String getStatus() {
		return status;
	}

	protected void setStatus(String status) {
		this.status = status;
	}

	// humidity
	public String getHumidity() {
		return humidity;
	}

	protected void setHumidity(String humidity) {
		this.humidity = humidity;
	}

	// pressure
	public String getPressure() {
		return pressure;
	}

	protected void setPressure(String pressure) {
		this.pressure = pressure;
	}

	// visibility
	public String getVisibility() {
		return visibility;
	}

	protected void setVisibility(String visibility) {
		this.visibility = visibility;
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
		return "<" + lastUpdate + ">\n" + 
					"temp -> " + temp + " - " + status + "\n" + 
					"humidity -> " + humidity + "\n" + 
					"pressure -> " + pressure + "\n" + 
					"visibility -> " + visibility + "\n" + 				
					"wind -> " + windDirection + " " + windSpeed;
	}

}
