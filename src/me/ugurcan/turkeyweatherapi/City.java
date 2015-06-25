package me.ugurcan.turkeyweatherapi;

public class City {
	
	private String weatherNow;
	private String humidityNow;
	private String pressureNow;
	private String visibilityNow;

	private String weatherTodayHigh;
	private String weatherTodayLow;
	private String weatherTomorrowHigh;
	private String weatherTomorrowLow;
	
	private String sunrise;
	private String sunset;

	public City(){
		
		this.weatherNow = "N/A";
		this.humidityNow = "N/A";
		this.pressureNow = "N/A";
		
		this.weatherTodayHigh = "N/A";
		this.weatherTodayLow = "N/A";
		this.weatherTomorrowHigh = "N/A";
		this.weatherTomorrowLow = "N/A";
		
		this.sunrise = "N/A";
		this.sunset = "N/A";
		
	}

	// weather-now
	public String weatherNow(){
		return weatherNow;
	}

	protected void setWeatherNow(String weatherNow) {
		this.weatherNow = weatherNow;
	}

	// humidity-now
	public String humidityNow() {
		return humidityNow;
	}

	protected void setHumidityNow(String humidityNow) {
		this.humidityNow = humidityNow;
	}
	
	// pressure-now
	public String pressureNow() {
		return pressureNow;
	}

	protected void setPressureNow(String pressureNow) {
		this.pressureNow = pressureNow;
	}
	
	// visibility-now
	public String visibilityNow() {
		return visibilityNow;
	}

	protected void setVisibilityNow(String visibilityNow) {
		this.visibilityNow = visibilityNow;
	}
	
	// weather-today-high
	public String weatherTodayHigh() {
		return weatherTodayHigh;
	}

	protected void setWeatherTodayHigh(String weatherTodayHigh) {
		this.weatherTodayHigh = weatherTodayHigh;
	}

	// weather-today-low
	public String weatherTodayLow() {
		return weatherTodayLow;
	}

	protected void setWeatherTodayLow(String weatherTodayLow) {
		this.weatherTodayLow = weatherTodayLow;
	}
	
	// weather-tomorrow-high
	public String weatherTomorrowHigh() {
		return weatherTomorrowHigh;
	}

	protected void setWeatherTomorrowHigh(String weatherTomorrowHigh) {
		this.weatherTomorrowHigh = weatherTomorrowHigh;
	}

	// weather-tomorrow-low
	public String weatherTomorrowLow() {
		return weatherTomorrowLow;
	}

	protected void setWeatherTomorrowLow(String weatherTomorrowLow) {
		this.weatherTomorrowLow = weatherTomorrowLow;
	}

	// sunrise
	public String sunrise() {
		return sunrise;
	}

	protected void setSunrise(String sunrise) {
		this.sunrise = sunrise;
	}

	// sunset
	public String sunset() {
		return sunset;
	}

	protected void setSunset(String sunset) {
		this.sunset = sunset;
	}
	
}
