package me.ugurcan.test;

import java.util.ArrayList;

import me.ugurcan.weatherinturkey.Location;
import me.ugurcan.weatherinturkey.WeatherInTurkey;
import me.ugurcan.weatherinturkey.Weather;

public class Test {

    public static void main(String[] args) {

        WeatherInTurkey weatherInTurkey = new WeatherInTurkey();

        // list cities of Turkey
        ArrayList<String> cities = weatherInTurkey.listCities();
        System.out.println("Cities of Turkey: " + cities);

        System.out.println();

        // list districts of a city
        String ofCity = "IZMIR";
        ArrayList<String> districts = weatherInTurkey.listDistricts(ofCity);
        System.out.println("Districts of " + ofCity + ": " + districts);

        System.out.println();

        String inputLocation = "CESME";
        Location location = weatherInTurkey.getLocation(inputLocation);
        // input should be one of the cities or districts listed by the code above
        // (in the same format as listed, no Turkish char allowed)

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
