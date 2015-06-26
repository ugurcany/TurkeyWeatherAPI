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
	
	private String elevation;
	private String latitude;
	private String longitude;
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
		
		this.elevation = "N/A";
		this.latitude = "N/A";
		this.longitude = "N/A";
		this.sunrise = "N/A";
		this.sunset = "N/A";
		
	}

	// weather-now
	public String getWeatherNow(){
		return weatherNow;
	}

	protected void setWeatherNow(String weatherNow) {
		this.weatherNow = weatherNow;
	}

	// humidity-now
	public String getHumidityNow() {
		return humidityNow;
	}

	protected void setHumidityNow(String humidityNow) {
		this.humidityNow = humidityNow;
	}
	
	// pressure-now
	public String getPressureNow() {
		return pressureNow;
	}

	protected void setPressureNow(String pressureNow) {
		this.pressureNow = pressureNow;
	}
	
	// visibility-now
	public String getVisibilityNow() {
		return visibilityNow;
	}

	protected void setVisibilityNow(String visibilityNow) {
		this.visibilityNow = visibilityNow;
	}
	
	// weather-today-high
	public String getWeatherTodayHigh() {
		return weatherTodayHigh;
	}

	protected void setWeatherTodayHigh(String weatherTodayHigh) {
		this.weatherTodayHigh = weatherTodayHigh;
	}

	// weather-today-low
	public String getWeatherTodayLow() {
		return weatherTodayLow;
	}

	protected void setWeatherTodayLow(String weatherTodayLow) {
		this.weatherTodayLow = weatherTodayLow;
	}
	
	// weather-tomorrow-high
	public String getWeatherTomorrowHigh() {
		return weatherTomorrowHigh;
	}

	protected void setWeatherTomorrowHigh(String weatherTomorrowHigh) {
		this.weatherTomorrowHigh = weatherTomorrowHigh;
	}

	// weather-tomorrow-low
	public String getWeatherTomorrowLow() {
		return weatherTomorrowLow;
	}

	protected void setWeatherTomorrowLow(String weatherTomorrowLow) {
		this.weatherTomorrowLow = weatherTomorrowLow;
	}
	
	// elevation
	public String getElevation() {
		return elevation;
	}

	protected void setElevation(String elevation) {
		this.elevation = elevation;
	}
	
	// latitude
	public String getLatitude() {
		return latitude;
	}

	protected void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	// longitude
	public String getLongitude() {
		return longitude;
	}

	protected void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	// sunrise
	public String getSunrise() {
		return sunrise;
	}

	protected void setSunrise(String sunrise) {
		this.sunrise = sunrise;
	}

	// sunset
	public String getSunset() {
		return sunset;
	}

	protected void setSunset(String sunset) {
		this.sunset = sunset;
	}
	
}
