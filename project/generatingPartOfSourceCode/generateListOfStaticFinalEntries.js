"use strict";

const fs = require("fs");

const country2CharCodeToNumericCode = require("./country2CharCodeToNumericCode");
const nameOfFileWithResult = "staticEntries.java";

const writePartOfSourceCode = (function() {
  const writePartOfSourceCode = function(countryString2CharCodeToNumericCode, pathToFile) {
    return new Promise(function(resolve, reject) {
      const writableStream = fs.createWriteStream(pathToFile);

      writableStream.on("finish", resolve);
      writableStream.on("error", reject);
      writePartOfSourceCodeToStream(writableStream, country2CharCodeToNumericCode);
    });
  };

  const writePartOfSourceCodeToStream = function(writableStream, country2CharCodeToNumericCode) {
    writeStaticFinalEntries(writableStream, country2CharCodeToNumericCode);
    writableStream.write("\n");
    writePrivateArrayOfEntries(writableStream, country2CharCodeToNumericCode);
  };

  const writeStaticFinalEntries = (function() {
    const writeStaticFinalEntries = function(writableStream, country2CharCodeToNumericCode) {
      for (const [char2CodeInUpperCase, numericCode] of Object.entries(country2CharCodeToNumericCode)) {
        writeStaticFinalCountryEntryToStream(writableStream, char2CodeInUpperCase, numericCode);
      }
    };

    const writeStaticFinalCountryEntryToStream = function(writableStream, char2CodeInUpperCase, numericCode) {
      writableStream.write("  public static final CountryEntry ");
      writableStream.write(char2CodeInUpperCase);
      writableStream.write(" = new CountryEntry(\"");
      writableStream.write(char2CodeInUpperCase);
      writableStream.write("\", (char) ");
      writableStream.write(numericCode.toString());
      writableStream.write(");\n");
    };

    return writeStaticFinalEntries;
  })();

  const writePrivateArrayOfEntries = (function() {
    const writePrivateArrayOfEntries = function(writableStream, country2CharCodeToNumericCode) {
      writableStream.write("  private static CountryEntry[] _entriesAboutCountries = new CountryEntry[] {\n");
      for (const char2CodeInUpperCase of Object.keys(country2CharCodeToNumericCode)) {
        writeEntryInArrayLn(writableStream, char2CodeInUpperCase);
      }
      writableStream.write("  };");
    };

    const writeEntryInArrayLn = function(writableStream, char2CodeInUpperCase) {
      writableStream.write("    ");
      writableStream.write(char2CodeInUpperCase);
      writableStream.write(",\n");
    };

    return writePrivateArrayOfEntries;
  })();

  return writePartOfSourceCode;
})();

writePartOfSourceCode(country2CharCodeToNumericCode, nameOfFileWithResult);
