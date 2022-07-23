package iso.test;

import org.scalatest.Assertions.assert;
import org.scalatest.funsuite.AnyFunSuite;

import iso.countriesCodes.CountriesEntries;
import iso.countriesCodes.CountryEntry;

final class CountriesCodesTestSuite extends AnyFunSuite {
  test("getting entries") {
    class Entry(ce: CountryEntry, string2CharCodeInUpperCase: String, numCode: Char) {
      val countryEntry = ce;
      val string2CharCode = string2CharCodeInUpperCase;
      val numericCode = numCode;
    }

    val entryAboutCountyTo2CharCodeAndNumericCode = Array(
      new Entry(CountriesEntries.AF, "AF", 4),
      new Entry(CountriesEntries.IN , "IN", 356),
      new Entry(CountriesEntries.CN , "CN", 156),
      new Entry(CountriesEntries.ZW , "ZW", 716)
    );

    def checkGettingEntryByString2CharCode(ce: CountryEntry, string2CharCode: String, numericCode: Char): Unit = {
      val entry = CountriesEntries.getEntryBy2CharCode(string2CharCode);
      assert(entry == ce);
      val numCode = entry.getNumericCode();
      assert(numCode == numericCode);
      assert(numCode == ce.getNumericCode());
    }

    def checkGettingEntryByNumericCode(ce: CountryEntry, string2CharCode: String, numericCode: Char): Unit = {
      val entry = CountriesEntries.getEntryByNumericCode(numericCode);
      assert(entry.eq(ce));
      val charCode = entry.get2CharCode();
      assert(charCode == string2CharCode);
      assert(charCode == ce.get2CharCode());
    }

    for (entry <- entryAboutCountyTo2CharCodeAndNumericCode) {
      val countryEntry = entry.countryEntry;
      val string2CharCode = entry.string2CharCode;
      val numericCode = entry.numericCode;

      checkGettingEntryByString2CharCode(countryEntry, string2CharCode, numericCode);
      checkGettingEntryByNumericCode(countryEntry, string2CharCode, numericCode);
    }
  }
}
