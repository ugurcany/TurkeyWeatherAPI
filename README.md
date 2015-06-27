## TurkeyWeatherAPI - Weather data for the cities of Turkey

*Data source: http://www.mgm.gov.tr/*

**How to use:**
```java
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
```

**Output:**
```
Cities of Turkey: [ADANA, ADIYAMAN, AFYONKARAHISAR, AGRI, AKSARAY, AMASYA, ANKARA, ANTALYA, ARDAHAN, ARTVIN, AYDIN, BALIKESIR, BARTIN, BATMAN, BAYBURT, BILECIK, BINGOL, BITLIS, BOLU, BURDUR, BURSA, CANAKKALE, CANKIRI, CORUM, DENIZLI, DIYARBAKIR, DUZCE, EDIRNE, ELAZIG, ERZINCAN, ERZURUM, ESKISEHIR, GAZIANTEP, GIRESUN, GUMUSHANE, HAKKARI, HATAY, IGDIR, ISPARTA, ISTANBUL, IZMIR, K.MARAS, KARABUK, KARAMAN, KARS, KASTAMONU, KAYSERI, KIRIKKALE, KIRKLARELI, KIRSEHIR, KILIS, KOCAELI, KONYA, KUTAHYA, MALATYA, MANISA, MARDIN, MERSIN, MUGLA, MUS, NEVSEHIR, NIGDE, ORDU, OSMANIYE, RIZE, SAKARYA, SAMSUN, SIIRT, SINOP, SIVAS, SANLIURFA, SIRNAK, TEKIRDAG, TOKAT, TRABZON, TUNCELI, USAK, VAN, YALOVA, YOZGAT, ZONGULDAK]

City: ANKARA
Weather-now:
27 Haziran Cumartesi 02:50 -> temp: 15,1°C - humidity: %76 - pressure: 1010,8 hPa - visibility: 10 km

Weather-next-days:
27 Haziran Cumartesi -> max: 24°C - min: 12°C
28 Haziran Pazar -> max: 20°C - min: 13°C
29 Haziran Pazartesi -> max: 23°C - min: 10°C
30 Haziran Salý -> max: 25°C - min: 11°C
1 Temmuz Çarþamba -> max: 26°C - min: 12°C

Elevation: 879 m.
Latitude: 39° 59' K
Longitude: 32° 41' D
Sunrise: 05:22
Sunset: 20:22
```
