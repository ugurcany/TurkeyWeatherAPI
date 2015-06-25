## TurkeyWeatherAPI - Weather API for the cities of Turkey

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
String inputCity = cities.get(0);
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
```

**Output:**
```
Cities of Turkey: [ADANA, ADIYAMAN, AFYONKARAHISAR, AGRI, AKSARAY, AMASYA, ANKARA, ANTALYA, ARDAHAN, ARTVIN, AYDIN, BALIKESIR, BARTIN, BATMAN, BAYBURT, BILECIK, BINGOL, BITLIS, BOLU, BURDUR, BURSA, CANAKKALE, CANKIRI, CORUM, DENIZLI, DIYARBAKIR, DUZCE, EDIRNE, ELAZIG, ERZINCAN, ERZURUM, ESKISEHIR, GAZIANTEP, GIRESUN, GUMUSHANE, HAKKARI, HATAY, IGDIR, ISPARTA, ISTANBUL, IZMIR, K.MARAS, KARABUK, KARAMAN, KARS, KASTAMONU, KAYSERI, KIRIKKALE, KIRKLARELI, KIRSEHIR, KILIS, KOCAELI, KONYA, KUTAHYA, MALATYA, MANISA, MARDIN, MERSIN, MUGLA, MUS, NEVSEHIR, NIGDE, ORDU, OSMANIYE, RIZE, SAKARYA, SAMSUN, SIIRT, SINOP, SIVAS, SANLIURFA, SIRNAK, TEKIRDAG, TOKAT, TRABZON, TUNCELI, USAK, VAN, YALOVA, YOZGAT, ZONGULDAK]

City: ADANA
Weather-now: 23,1°C
Humidity-now: %88
Pressure-now: 1005,4 hPa
Visibility-now: 10 km
Weather-today-high: 31°C
Weather-today-low: 21°C
Weather-tomorrow-high: 30°C
Weather-tomorrow-low: 22°C
Sunrise: 05:21
Sunset: 20:02
```
