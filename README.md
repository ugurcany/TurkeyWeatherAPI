# weather-in-turkey

A Java library to retrieve current weather and 5-day forecast data for the cities and districts of Turkey

Weather data is retrieved from the website of the [*Turkish State Meteorological Service*](http://www.mgm.gov.tr/).

**How to use:**
```java
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

System.out.println("Location: " + inputLocation);
System.out.println(location);
```

**Output:**
```
Cities of Turkey: [ADANA, ADIYAMAN, AFYONKARAHISAR, AGRI, AKSARAY, AMASYA, ANKARA, ANTALYA, ARDAHAN, ARTVIN, AYDIN, BALIKESIR, BARTIN, BATMAN, BAYBURT, BILECIK, BINGOL, BITLIS, BOLU, BURDUR, BURSA, CANAKKALE, CANKIRI, CORUM, DENIZLI, DIYARBAKIR, DUZCE, EDIRNE, ELAZIG, ERZINCAN, ERZURUM, ESKISEHIR, GAZIANTEP, GIRESUN, GUMUSHANE, HAKKARI, HATAY, IGDIR, ISPARTA, ISTANBUL, IZMIR, K.MARAS, KARABUK, KARAMAN, KARS, KASTAMONU, KAYSERI, KIRIKKALE, KIRKLARELI, KIRSEHIR, KILIS, KOCAELI, KONYA, KUTAHYA, MALATYA, MANISA, MARDIN, MERSIN, MUGLA, MUS, NEVSEHIR, NIGDE, ORDU, OSMANIYE, RIZE, SAKARYA, SAMSUN, SIIRT, SINOP, SIVAS, SANLIURFA, SIRNAK, TEKIRDAG, TOKAT, TRABZON, TUNCELI, USAK, VAN, YALOVA, YOZGAT, ZONGULDAK]
Districts of IZMIR: [ALIAGA, BALCOVA, BAYINDIR, BAYRAKLI, BERGAMA, BEYDAG, BORNOVA, BOZDAG_KAYAK, BUCA, CESME, CIGLI, DIKILI, FOCA, GAZIEMIR, GUZELBAHCE, KARABAGLAR, KARABURUN, KARSIYAKA, KEMALPASA, KINIK, KIRAZ, KONAK, MENDERES, MENEMEN, NARLIDERE, ODEMIS, SEFERIHISAR, SELCUK, TIRE, TORBALI, URLA]

Location: CESME
elevation -> 8 m.
latitude -> 38° 18' K
longitude -> 26° 22' D
sunrise -> 06:02
sunset -> 20:38

Weather-now:
<14 Temmuz Salı 06:41>
temp -> 22,2°C - AÇIK
humidity -> %66
pressure -> 1010 hPa
visibility -> 20 km
wind -> Kuzeybatıdan 3 km/sa

Weather-next-days:
<14 Temmuz Salı>
temp -> max: 30°C - min: 22°C - AÇIK
humidity -> max: %65 - min: %40
wind -> Kuzeyden 25 km/sa
<15 Temmuz Çarşamba>
temp -> max: 29°C - min: 22°C - AÇIK
humidity -> max: %66 - min: %49
wind -> Kuzeyden 30 km/sa
<16 Temmuz Perşembe>
temp -> max: 30°C - min: 22°C - AÇIK
humidity -> max: %60 - min: %42
wind -> Kuzeyden 33 km/sa
<17 Temmuz Cuma>
temp -> max: 31°C - min: 22°C - AÇIK
humidity -> max: %61 - min: %45
wind -> Kuzeyden 32 km/sa
<18 Temmuz Cumartesi>
temp -> max: 30°C - min: 22°C - AÇIK
humidity -> max: %67 - min: %49
wind -> Kuzeyden 30 km/sa
```
