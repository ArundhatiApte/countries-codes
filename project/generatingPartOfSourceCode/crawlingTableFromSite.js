"use strict";

// url: https://www.iban.com/country-codes

const extractCountryAlpha2CodeToNumericCode = function(document) {
  const table = document.querySelector("#myTable"),
        rows = table.querySelectorAll("tr"),
        countOfRows = rows.length;

  let row,
      cellWithAlpha2Code,
      cellWithNumericCode,
      alpha2Code,
      numericCode;

  const countryAlpha2CodeToNumericCode = Object.create(null);

  for (let index = 1; index < countOfRows; index += 1) {
    row = rows[index];
    cellWithAlpha2Code = row.querySelector("td:nth-child(2)");
    cellWithNumericCode = row.querySelector("td:nth-child(4)");

    alpha2Code = cellWithAlpha2Code.innerText.trim();
    if (!alpha2Code) {
      continue;
    }
    numericCode = parseInt(cellWithNumericCode.innerText);
    countryAlpha2CodeToNumericCode[alpha2Code] = numericCode;
  }
  return countryAlpha2CodeToNumericCode;
};

console.log(JSON.stringify(
  extractCountryAlpha2CodeToNumericCode(document),
  null,
  2
));
