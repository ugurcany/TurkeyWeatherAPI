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
		System.out.println("Weather-now: " + city.weatherNow() );
		System.out.println("Humidity-now: " + city.humidityNow() );
		System.out.println("Pressure-now: " + city.pressureNow() );
		System.out.println("Visibility-now: " + city.visibilityNow() );
		
		System.out.println("Weather-today-high: " + city.weatherTodayHigh() );
		System.out.println("Weather-today-low: " + city.weatherTodayLow() );
		System.out.println("Weather-tomorrow-high: " + city.weatherTomorrowHigh() );
		System.out.println("Weather-tomorrow-low: " + city.weatherTomorrowLow() );
		
		System.out.println("Elevation: " + city.elevation() );
		System.out.println("Latitude: " + city.latitude() );
		System.out.println("Longitude: " + city.longitude() );
		System.out.println("Sunrise: " + city.sunrise() );
		System.out.println("Sunset: " + city.sunset() );

	}

}
