package me.ugurcan.test;

import java.util.ArrayList;

import me.ugurcan.turkeyweatherapi.City;
import me.ugurcan.turkeyweatherapi.TurkeyWeatherAPI;
import me.ugurcan.turkeyweatherapi.Weather;

public class Test {

	public static void main(String[] args) {

		TurkeyWeatherAPI turkeyWeather = new TurkeyWeatherAPI();
		
		// list cities of Turkey
		ArrayList<String> cities = turkeyWeather.listCities();
		System.out.println("Cities of Turkey: " + cities);
		
		System.out.println();
		
		// input should be one of the cities listed by the code above
		// (in the same format as listed, no Turkish char allowed)
		String inputCity = "ANKARA";
		City city = turkeyWeather.getCity(inputCity);
		
		System.out.println("City: " + inputCity);
		System.out.println("Weather-now:\n" + city.getWeatherNow() );
		
		System.out.println();
		
		System.out.println("Weather-next-days:");
		ArrayList<Weather> weatherNextDays = city.getWeatherNextDays();
		for (int i=0; i<weatherNextDays.size(); i++)
			System.out.println( weatherNextDays.get(i) );
		
		System.out.println();
		
		System.out.println("Elevation: " + city.getElevation() );
		System.out.println("Latitude: " + city.getLatitude() );
		System.out.println("Longitude: " + city.getLongitude() );
		System.out.println("Sunrise: " + city.getSunrise() );
		System.out.println("Sunset: " + city.getSunset() );

	}

}
