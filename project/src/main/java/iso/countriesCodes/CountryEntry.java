package iso.countriesCodes;

public final class CountryEntry {
  protected CountryEntry(String string2CharCode, char numericCode) {
    this._string2CharCode = string2CharCode;
    this._numericCode = numericCode;
  }

  protected final String _string2CharCode;
  protected final char _numericCode;

  public String get2CharCode() {
    return this._string2CharCode;
  }

  public char getNumericCode() {
    return this._numericCode;
  }
}
