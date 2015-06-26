package me.ugurcan.test;

import java.util.ArrayList;

import me.ugurcan.turkeyweatherapi.City;
import me.ugurcan.turkeyweatherapi.TurkeyWeatherAPI;

public class Test {

	public static void main(String[] args) {

		TurkeyWeatherAPI turkeyWeather = new TurkeyWeatherAPI();
		
		// list cities of Turkey
		ArrayList<String> cities = turkeyWeather.listCities();
		System.out.println("Cities of Turkey: " + cities);
		
		System.out.println();
		
		// input should be one of the cities listed by the code above
		// (in the same format as listed, no Turkish char allowed)
		String inputCity = cities.get(5);
		City city = turkeyWeather.city(inputCity);
		
		System.out.println("City: " + inputCity);
		System.out.println("Weather-now: " + city.getWeatherNow() );
		System.out.println("Humidity-now: " + city.getHumidityNow() );
		System.out.println("Pressure-now: " + city.getPressureNow() );
		System.out.println("Visibility-now: " + city.getVisibilityNow() );
		
		System.out.println("Weather-today-high: " + city.getWeatherTodayHigh() );
		System.out.println("Weather-today-low: " + city.getWeatherTodayLow() );
		System.out.println("Weather-tomorrow-high: " + city.getWeatherTomorrowHigh() );
		System.out.println("Weather-tomorrow-low: " + city.getWeatherTomorrowLow() );
		
		System.out.println("Elevation: " + city.getElevation() );
		System.out.println("Latitude: " + city.getLatitude() );
		System.out.println("Longitude: " + city.getLongitude() );
		System.out.println("Sunrise: " + city.getSunrise() );
		System.out.println("Sunset: " + city.getSunset() );

	}

}
