# Countries codes

Модуль, предоставляющий таблицу стран, их символьных и числовых кодов, описанную в стандарте ISO 3166. Лицензия: MIT.

## API

- package iso.countriesCodes
    - public class CountriesEntries
        * public static CountryEntry getEntryBy2CharCode(String s2CharInUpperCase)
        * public static CountryEntry getEntryByNumericCode(char numericCode)
        * статичные свойства-записи о странах
    - public class CountryEntry
        * public String get2CharCode()
        * public char getNumericCode()

### package iso.countriesCodes

#### public class CountriesEntries

Класс, представляющий статические методы, для получения записей о странах.

##### public static CountryEntry getEntryBy2CharCode(String code2CharInUpperCase)

Получает запись о стране по 2-ух символьному коду из заглавных букв, в случае отсутствия возвращает null.

##### public static CountryEntry getEntryByNumericCode(char numericCode)

Получает запись о стране по 16-и битному числовому коду, в случае отсутствия возвращает null.

##### статичные свойства-записи о странах

CountriesEntries содержит статичные поля, являющиеся экземплярами класса CountryEntry, названные 2-ух символьным
кодом страны. Пример:

```java
CountriesEntries.IN == CountriesEntries.getEntryBy2CharCode("IN");
```

#### public class CountryEntry

Запись о стране.

##### public String get2CharCode()

Возвращает 2-ух символьный код страны из заглавных букв.

##### public char getNumericCode()

Возвращает 16-и битный числовой код страны.

## Ссылки

- [Стандарт ISO 3166](https://www.iso.org/iso-3166-country-codes.html)
- [Таблица ISO 3166](https://www.iban.com/country-codes)
