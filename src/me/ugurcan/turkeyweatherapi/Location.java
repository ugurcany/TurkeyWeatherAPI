package me.ugurcan.turkeyweatherapi;

import java.util.ArrayList;

public class Location {

    private WeatherNow weatherNow;

    private ArrayList<Weather> weatherNextDays;

    private String elevation;
    private String latitude;
    private String longitude;
    private String sunrise;
    private String sunset;

    public Location() {

        this.weatherNow = null;

        this.weatherNextDays = new ArrayList<Weather>();

        this.elevation = "N/A";
        this.latitude = "N/A";
        this.longitude = "N/A";
        this.sunrise = "N/A";
        this.sunset = "N/A";

    }

    // weather-now
    public WeatherNow getWeatherNow() {
        return weatherNow;
    }

    protected void setWeatherNow(WeatherNow weatherNow) {
        this.weatherNow = weatherNow;
    }

    // weather-next-days
    public ArrayList<Weather> getWeatherNextDays() {
        return weatherNextDays;
    }

    protected void setWeatherNextDays(ArrayList<Weather> weatherNextDays) {
        this.weatherNextDays = weatherNextDays;
    }

    protected void addWeatherNextDays(Weather weather) {
        this.weatherNextDays.add(weather);
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
