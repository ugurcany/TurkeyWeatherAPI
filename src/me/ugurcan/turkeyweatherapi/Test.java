package me.ugurcan.turkeyweatherapi;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		TurkeyWeatherAPI turkeyWeather = new TurkeyWeatherAPI();
		
		// list cities of Turkey
		ArrayList<String> cities = turkeyWeather.listCities();
		System.out.println("Cities of Turkey");
		for (String city : cities)
			System.out.println( city );
		
		System.out.println();
		
		// input should be one of the cities listed by the code above
		// (in the same format as listed, no Turkish char allowed)
		String inputCity = cities.get(23);
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
		
		System.out.println("Sunrise: " + city.sunrise() );
		System.out.println("Sunset: " + city.sunset() );

	}

}
