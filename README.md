## TurkeyWeatherAPI - Weather forecast data for Turkey

*Data source: http://www.mgm.gov.tr/*

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
Sunrise: 05:53
Sunset: 20:42

Weather-now:
<27 Haziran Cumartesi 02:19>
temp -> 21,5°C - AÇIK
humidity -> %72
pressure -> 1007,1 hPa
visibility -> 20 km
wind -> Kuzeyden 10 km/sa

Weather-next-days:
<27 Haziran Cumartesi>
temp -> max: 27°C - min: 18°C - ÇOK BULUTLU
humidity -> max: %72 - min: %49
wind -> Kuzeybatýdan 28 km/sa
<28 Haziran Pazar>
temp -> max: 26°C - min: 18°C - PARÇALI BULUTLU
humidity -> max: %68 - min: %54
wind -> Kuzeyden 25 km/sa
<29 Haziran Pazartesi>
temp -> max: 28°C - min: 18°C - PARÇALI BULUTLU
humidity -> max: %77 - min: %52
wind -> Kuzeyden 21 km/sa
<30 Haziran Salý>
temp -> max: 28°C - min: 19°C - AZ BULUTLU
humidity -> max: %75 - min: %49
wind -> Kuzeyden 18 km/sa
<1 Temmuz Çarþamba>
temp -> max: 28°C - min: 19°C - PARÇALI BULUTLU
humidity -> max: %80 - min: %54
wind -> Kuzeyden 24 km/sa
```
