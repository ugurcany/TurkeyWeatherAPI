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

        // list districts of a city
        String ofCity = "IZMIR";
        ArrayList<String> districts = weatherInTurkey.listDistricts(ofCity);
        System.out.println("Districts of " + ofCity + ": " + districts);

        System.out.println();

        String inputLocation = "CESME";
        Location location = weatherInTurkey.getLocation(inputLocation);
        // input should be one of the cities or districts listed by the code above
        // (in the same format as listed, no Turkish char allowed)

        System.out.println(location); // print location info
        location.printWeather(); // print weather data

    }

}
