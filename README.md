## TurkeyWeatherAPI - Weather API for the cities of Turkey in Java

How to use:
```java
TurkeyWeatherAPI turkeyWeather = new TurkeyWeatherAPI();

// list cities of Turkey
ArrayList<String> cities = turkeyWeather.listCities();
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
```

Output:
```
Cities of Turkey
ADANA
ADIYAMAN
AFYONKARAHISAR
AGRI
AKSARAY
AMASYA
ANKARA
ANTALYA
ARDAHAN
ARTVIN
AYDIN
BALIKESIR
BARTIN
BATMAN
BAYBURT
BILECIK
BINGOL
BITLIS
BOLU
BURDUR
BURSA
CANAKKALE
CANKIRI
CORUM
DENIZLI
DIYARBAKIR
DUZCE
EDIRNE
ELAZIG
ERZINCAN
ERZURUM
ESKISEHIR
GAZIANTEP
GIRESUN
GUMUSHANE
HAKKARI
HATAY
IGDIR
ISPARTA
ISTANBUL
IZMIR
K.MARAS
KARABUK
KARAMAN
KARS
KASTAMONU
KAYSERI
KIRIKKALE
KIRKLARELI
KIRSEHIR
KILIS
KOCAELI
KONYA
KUTAHYA
MALATYA
MANISA
MARDIN
MERSIN
MUGLA
MUS
NEVSEHIR
NIGDE
ORDU
OSMANIYE
RIZE
SAKARYA
SAMSUN
SIIRT
SINOP
SIVAS
SANLIURFA
SIRNAK
TEKIRDAG
TOKAT
TRABZON
TUNCELI
USAK
VAN
YALOVA
YOZGAT
ZONGULDAK

City: CORUM
Weather-now: 14,7°C
Humidity-now: %99
Pressure-now: 1012,3 hPa
Visibility-now: 20 km
Weather-today-high: 23°C
Weather-today-low: 12°C
Weather-tomorrow-high: 25°C
Weather-tomorrow-low: 12°C
Sunrise: 05:11
Sunset: 20:15
```
