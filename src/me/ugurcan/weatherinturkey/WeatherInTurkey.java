package me.ugurcan.weatherinturkey;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;

public class WeatherInTurkey {

    public WeatherInTurkey() {

    }

    public ArrayList<String> listCities() {

        ArrayList<String> cities = new ArrayList<String>();

        try {

            Document doc = Jsoup.connect("http://www.mgm.gov.tr/tahmin/il-ve-ilceler.aspx").get();

            Elements elements = doc.getElementById("divSecim520Il").select("li");

            for (Element element : elements) {
                int startIndex = element.toString().indexOf("m=") + 2;
                int endIndex = element.toString().indexOf("#");

                String city = element.toString().substring(startIndex, endIndex);

                cities.add(city);
            }

        } catch (Exception ex) {
            cities.clear();
        }

        if (cities.isEmpty())
            cities.add("Error!");

        return cities;

    }

    public ArrayList<String> listDistricts(String ofCity) {

        ArrayList<String> districts = new ArrayList<String>();

        try {

            ArrayList<String> cities = this.listCities();
            if (!cities.contains(ofCity))
                throw new Exception();

            Document doc = Jsoup.connect("http://www.mgm.gov.tr/tahmin/il-ve-ilceler.aspx?m=" + ofCity).get();

            Elements elements = doc.getElementById("divSecim520Ilce").select("li");

            for (Element element : elements) {
                int startIndex = element.toString().indexOf("m=") + 2;
                int endIndex = element.toString().indexOf("#");

                String district = element.toString().substring(startIndex, endIndex);

                districts.add(district);
            }

        } catch (Exception ex) {
            districts.clear();
        }

        if (districts.isEmpty())
            districts.add("Error!");

        return districts;

    }

    public Location getLocation(String inputLocation) {

        Location location = new Location();

        try {

            Document doc = Jsoup.connect("http://www.mgm.gov.tr/tahmin/il-ve-ilceler.aspx?m=" + inputLocation).get();

            // weather-now
            Element element = doc.getElementById("divSonDurum").select("tr").get(1);
            String lastUpdate = element.select("td").get(0).text();
            String temp = element.select("td").get(1).text();
            String status = doc.getElementById("divSonDurum").select("tr").get(0).select("td").attr("title");
            String humidity = element.select("td").get(2).text();
            String windSpeed = element.select("td").get(3).text();
            String windDirection = element.select("td").get(3).attr("title");
            String pressure = element.select("td").get(4).text();
            String visibility = element.select("td").get(5).text();
            location.setWeatherNow(new WeatherNow(lastUpdate, temp, status, humidity, pressure, visibility, windSpeed, windDirection));

            // weather-next-days
            for (int i = 1; i <= 5; i++) {
                element = doc.getElementById("cp_sayfa_thmGun" + i);
                String date = element.text();

                element = doc.getElementById("cp_sayfa_thmMax" + i);
                String maxTemp = element.text() + "\u00B0" + "C";

                element = doc.getElementById("cp_sayfa_thmMin" + i);
                String minTemp = element.text() + "\u00B0" + "C";

                element = doc.getElementById("cp_sayfa_imgHadise" + i);
                String statuss = element.attr("alt");

                element = doc.getElementById("cp_sayfa_thmNemMax" + i);
                String maxHumidity = "%" + element.text();

                element = doc.getElementById("cp_sayfa_thmNemMin" + i);
                String minHumidity = "%" + element.text();

                element = doc.getElementById("cp_sayfa_thmRuzgarHiz" + i);
                String windSpeedd = element.text() + " km/sa";

                element = doc.getElementById("cp_sayfa_imgRyon" + i);
                String windDirectionn = element.attr("alt");

                location.addWeatherNextDays(new Weather(date, maxTemp, minTemp, statuss, maxHumidity, minHumidity, windSpeedd, windDirectionn));
            }

            // name
            String name = doc.getElementsByAttributeValueMatching("id", "sfB").select("strong").text();
            location.setName(name);

            // elevation
            element = doc.getElementById("cp_sayfa_pMerkezYuksekligi");
            String elevation = element.text().substring(element.text().indexOf(" ") + 2);
            location.setElevation(elevation);

            // latitude
            element = doc.getElementById("cp_sayfa_pMerkezEnlem");
            String latitude = element.text().substring(element.text().indexOf(" ") + 2);
            location.setLatitude(latitude);

            // longitude
            element = doc.getElementById("cp_sayfa_pMerkezBoylam");
            String longitude = element.text().substring(element.text().indexOf(" ") + 2);
            location.setLongitude(longitude);

            // sunrise
            element = doc.getElementById("cp_sayfa_pMerkezGD");
            String sunrise = element.text().substring(element.text().lastIndexOf(" ") + 2);
            location.setSunrise(sunrise);

            // sunset
            element = doc.getElementById("cp_sayfa_pMerkezGB");
            String sunset = element.text().substring(element.text().lastIndexOf(" ") + 2);
            location.setSunset(sunset);

        } catch (Exception ex) {
            //ex.printStackTrace();
            location = new Location();
        }

        return location;

    }


}
