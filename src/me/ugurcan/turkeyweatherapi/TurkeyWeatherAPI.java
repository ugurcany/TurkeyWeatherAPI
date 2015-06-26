package me.ugurcan.turkeyweatherapi;

import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class TurkeyWeatherAPI {
	
	public TurkeyWeatherAPI(){
		
		
	}
	
	public ArrayList<String> listCities(){
		
		ArrayList<String> cities = new ArrayList<String>();
		
		try{
			
			Document doc = Jsoup.connect("http://www.mgm.gov.tr/tahmin/il-ve-ilceler.aspx").get();
			
			Elements elements = doc.getElementById("divSecim520Il").select("li");
			
			for(Element element : elements){
				int startIndex = element.toString().indexOf("m=") + 2;
				int endIndex = element.toString().indexOf("#");
				
				String city = element.toString().substring(startIndex, endIndex);
				
				cities.add(city);
			}
			
		}catch(Exception ex){
			cities.clear();
		}
		
		if(cities.isEmpty())
			System.out.println("Error!");
		
		return cities;
		
	}
	
	public City city(String inputCity){
		
		City city = new City();
			
		try{
			
			Document doc = Jsoup.connect("http://www.mgm.gov.tr/tahmin/il-ve-ilceler.aspx?m=" + inputCity).get();
			
			// weather-now
			Element element = doc.getElementById("divSonDurum").select("tr").get(1);
			String weatherNow = element.select("td").get(1).text();
			city.setWeatherNow(weatherNow);
			// humidity-now
			String humidityNow = element.select("td").get(2).text();
			city.setHumidityNow(humidityNow);
			// pressure-now
			String pressureNow = element.select("td").get(4).text();
			city.setPressureNow(pressureNow);
			// visibility-now
			String visibilityNow = element.select("td").get(5).text();
			city.setVisibilityNow(visibilityNow);
			
			// weather-next-days
			for(int i=1; i<=5; i++){
				element = doc.getElementById("cp_sayfa_thmGun" + i);
				String date = element.text();
				
				element = doc.getElementById("cp_sayfa_thmMax" + i);
				String maxTemp = element.text() + "\u00B0" + "C";
				
				element = doc.getElementById("cp_sayfa_thmMin" + i);
				String minTemp = element.text() + "\u00B0" + "C";

				city.addWeatherNextDays(new Weather(date, maxTemp, minTemp));
			}
			
			// elevation
			element = doc.getElementById("cp_sayfa_pMerkezYuksekligi");
			String elevation = element.text().substring(element.text().indexOf(" ") + 2);
			city.setElevation(elevation);
			
			// latitude
			element = doc.getElementById("cp_sayfa_pMerkezEnlem");
			String latitude = element.text().substring(element.text().indexOf(" ") + 2);
			city.setLatitude(latitude);
			
			// longitude
			element = doc.getElementById("cp_sayfa_pMerkezBoylam");
			String longitude = element.text().substring(element.text().indexOf(" ") + 2);
			city.setLongitude(longitude);
			
			// sunrise
			element = doc.getElementById("cp_sayfa_pMerkezGD");
			String sunrise = element.text().substring(element.text().lastIndexOf(" ") + 2);
			city.setSunrise(sunrise);
			
			// sunset
			element = doc.getElementById("cp_sayfa_pMerkezGB");
			String sunset = element.text().substring(element.text().lastIndexOf(" ") + 2);
			city.setSunset(sunset);
			
		}catch(Exception ex){
			//ex.printStackTrace();
			city = new City();
		}
		
		return city;
		
	}
	

}
