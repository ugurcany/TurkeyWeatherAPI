package me.ugurcan.turkeyweatherapi;

public class WeatherNow {
	
	private String lastUpdate;
	private String temp;
	private String humidity;
	private String pressure;
	private String visibility;

	public WeatherNow(String lastUpdate, String temp, String humidity, String pressure, String visibility) {
		
		this.lastUpdate = lastUpdate;
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		this.visibility = visibility;
		
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
	
	// print neatly
	@Override
	public String toString(){
		return lastUpdate + " -> " + "temp: " + temp + " - humidity: " + humidity + " - pressure: " + pressure + " - visibility: " + visibility ;
	}

}
