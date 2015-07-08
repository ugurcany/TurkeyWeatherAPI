## TurkeyWeatherAPI

An API to the current weather and 5-day forecast data for the cities and districts of Turkey.
Weather data is retrieved from the website of *Turkish State Meteorological Service*.

**How to use:**
```java
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
System.out.println("Elevation: " + location.getElevation() );
System.out.println("Latitude: " + location.getLatitude() );
System.out.println("Longitude: " + location.getLongitude() );
System.out.println("Sunrise: " + location.getSunrise() );
System.out.println("Sunset: " + location.getSunset() );

System.out.println();

System.out.println("Weather-now:\n" + location.getWeatherNow() );

System.out.println();

System.out.println("Weather-next-days:");
ArrayList<Weather> weatherNextDays = location.getWeatherNextDays();
for (int i=0; i<weatherNextDays.size(); i++)
	System.out.println( weatherNextDays.get(i) );
```

**Output:**
```
Cities of Turkey: [ADANA, ADIYAMAN, AFYONKARAHISAR, AGRI, AKSARAY, AMASYA, ANKARA, ANTALYA, ARDAHAN, ARTVIN, AYDIN, BALIKESIR, BARTIN, BATMAN, BAYBURT, BILECIK, BINGOL, BITLIS, BOLU, BURDUR, BURSA, CANAKKALE, CANKIRI, CORUM, DENIZLI, DIYARBAKIR, DUZCE, EDIRNE, ELAZIG, ERZINCAN, ERZURUM, ESKISEHIR, GAZIANTEP, GIRESUN, GUMUSHANE, HAKKARI, HATAY, IGDIR, ISPARTA, ISTANBUL, IZMIR, K.MARAS, KARABUK, KARAMAN, KARS, KASTAMONU, KAYSERI, KIRIKKALE, KIRKLARELI, KIRSEHIR, KILIS, KOCAELI, KONYA, KUTAHYA, MALATYA, MANISA, MARDIN, MERSIN, MUGLA, MUS, NEVSEHIR, NIGDE, ORDU, OSMANIYE, RIZE, SAKARYA, SAMSUN, SIIRT, SINOP, SIVAS, SANLIURFA, SIRNAK, TEKIRDAG, TOKAT, TRABZON, TUNCELI, USAK, VAN, YALOVA, YOZGAT, ZONGULDAK]

Districts of IZMIR: [ALIAGA, BALCOVA, BAYINDIR, BAYRAKLI, BERGAMA, BEYDAG, BORNOVA, BOZDAG_KAYAK, BUCA, CESME, CIGLI, DIKILI, FOCA, GAZIEMIR, GUZELBAHCE, KARABAGLAR, KARABURUN, KARSIYAKA, KEMALPASA, KINIK, KIRAZ, KONAK, MENDERES, MENEMEN, NARLIDERE, ODEMIS, SEFERIHISAR, SELCUK, TIRE, TORBALI, URLA]

Location: CESME
Elevation: 8 m.
Latitude: 38° 18' K
Longitude: 26° 22' D
Sunrise: 05:58
Sunset: 20:41

Weather-now:
<8 Temmuz Çarşamba 19:23>
temp -> 28,4°C - AÇIK
humidity -> %52
pressure -> 1007,5 hPa
visibility -> 20 km
wind -> Kuzeybatıdan 2 km/sa

Weather-next-days:
<9 Temmuz Perşembe>
temp -> max: 30°C - min: 23°C - SICAK
humidity -> max: %65 - min: %54
wind -> Kuzeyden 11 km/sa
<10 Temmuz Cuma>
temp -> max: 31°C - min: 23°C - SICAK
humidity -> max: %71 - min: %51
wind -> Kuzeyden 17 km/sa
<11 Temmuz Cumartesi>
temp -> max: 30°C - min: 24°C - SICAK
humidity -> max: %68 - min: %54
wind -> Kuzeyden 25 km/sa
<12 Temmuz Pazar>
temp -> max: 30°C - min: 24°C - SICAK
humidity -> max: %62 - min: %42
wind -> Kuzeyden 26 km/sa
<13 Temmuz Pazartesi>
temp -> max: 31°C - min: 23°C - SICAK
humidity -> max: %57 - min: %41
wind -> Kuzeyden 23 km/sa
```

*Data source:*
* *http://www.mgm.gov.tr/*
