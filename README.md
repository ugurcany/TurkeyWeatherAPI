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
```

**Output:**
```
Cities of Turkey: [ADANA, ADIYAMAN, AFYONKARAHISAR, AGRI, AKSARAY, AMASYA, ANKARA, ANTALYA, ARDAHAN, ARTVIN, AYDIN, BALIKESIR, BARTIN, BATMAN, BAYBURT, BILECIK, BINGOL, BITLIS, BOLU, BURDUR, BURSA, CANAKKALE, CANKIRI, CORUM, DENIZLI, DIYARBAKIR, DUZCE, EDIRNE, ELAZIG, ERZINCAN, ERZURUM, ESKISEHIR, GAZIANTEP, GIRESUN, GUMUSHANE, HAKKARI, HATAY, IGDIR, ISPARTA, ISTANBUL, IZMIR, K.MARAS, KARABUK, KARAMAN, KARS, KASTAMONU, KAYSERI, KIRIKKALE, KIRKLARELI, KIRSEHIR, KILIS, KOCAELI, KONYA, KUTAHYA, MALATYA, MANISA, MARDIN, MERSIN, MUGLA, MUS, NEVSEHIR, NIGDE, ORDU, OSMANIYE, RIZE, SAKARYA, SAMSUN, SIIRT, SINOP, SIVAS, SANLIURFA, SIRNAK, TEKIRDAG, TOKAT, TRABZON, TUNCELI, USAK, VAN, YALOVA, YOZGAT, ZONGULDAK]

City: AMASYA
Weather-now: 17,5°C
Humidity-now: %88
Pressure-now: 1008,7 hPa
Visibility-now: 20 km
Weather-today-high: 27°C
Weather-today-low: 16°C
Weather-tomorrow-high: 28°C
Weather-tomorrow-low: 16°C
Elevation: 412 m.
Latitude: 40° 39' K
Longitude: 35° 50' D
Sunrise: 05:07
Sunset: 20:12
```
