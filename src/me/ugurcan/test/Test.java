package me.ugurcan.test;

import java.util.ArrayList;

import me.ugurcan.turkeyweatherapi.Location;
import me.ugurcan.turkeyweatherapi.TurkeyWeatherAPI;
import me.ugurcan.turkeyweatherapi.Weather;

public class Test {

    public static void main(String[] args) {

        TurkeyWeatherAPI turkeyWeather = new TurkeyWeatherAPI();

        // list cities of Turkey
        ArrayList<String> cities = turkeyWeather.listCities();
        System.out.println("Cities of Turkey: " + cities);

        System.out.println();

        // list districts of a city
        String ofCity = "IZMIR";
        ArrayList<String> districts = turkeyWeather.listDistricts(ofCity);
        System.out.println("Districts of " + ofCity + ": " + districts);

        System.out.println();

        // input should be one of the cities or districts listed by the code above
        // (in the same format as listed, no Turkish char allowed)
        String inputLocation = "CESME";
        Location location = turkeyWeather.getLocation(inputLocation);

        System.out.println("Location: " + inputLocation);
        System.out.println("Elevation: " + location.getElevation());
        System.out.println("Latitude: " + location.getLatitude());
        System.out.println("Longitude: " + location.getLongitude());
        System.out.println("Sunrise: " + location.getSunrise());
        System.out.println("Sunset: " + location.getSunset());

        System.out.println();

        System.out.println("Weather-now:\n" + location.getWeatherNow());

        System.out.println();

        System.out.println("Weather-next-days:");
        ArrayList<Weather> weatherNextDays = location.getWeatherNextDays();
        for (int i = 0; i < weatherNextDays.size(); i++)
            System.out.println(weatherNextDays.get(i));

    }

}
