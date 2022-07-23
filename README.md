# Countries codes

Module that provides a table of countries, their symbolic and numeric codes, described in the ISO 3166 standard.
License: MIT.

## API

- package iso.countriesCodes
    - class CountriesEntries
        * static getEntryBy2CharCode(s2CharInUpperCase: String): CountryEntry
        * static getEntryByNumericCode(numericCode: char): CountryEntry
    - class CountryEntry
        * get2CharCode(): String
        * getNumericCode(): char

### package iso.countriesCodes

#### class CountriesEntries

A class representing static methods for getting country records.

##### public static CountryEntry getEntryBy2CharCode(String code2CharInUpperCase)

Gets a record about the country by a 2-character code of capital letters, in case of absence returns null.

##### public static CountryEntry getEntryByNumericCode(char numericCode)

Gets a record about the country by a 16-bit numeric code, returns null if missing.

#### class CountryEntry

Record about the country.

##### public String get2CharCode()

Returns a 2-character country code consisting of capital letters.

##### public char getNumericCode()

Returns a 16 bit numeric country code.

## Links

- [ISO 3166 standard](https://www.iso.org/iso-3166-country-codes.html)
- [ISO 3166 table](https://www.iban.com/country-codes)
