package iso.countriesCodes;

public final class CountriesEntries {
  private CountriesEntries() {}

  public static CountryEntry getEntryBy2CharCode(String code2CharInUpperCase) {
    for (CountryEntry countryEntry: _entriesAboutCountries) {
      if (countryEntry._string2CharCode.equals(code2CharInUpperCase)) {
        return countryEntry;
      }
    }
    return null;
  }

  public static CountryEntry getEntryByNumericCode(char numericCode) {
    for (CountryEntry countryEntry: _entriesAboutCountries) {
      if (countryEntry._numericCode == numericCode) {
        return countryEntry;
      }
    }
    return null;
  }

  public static final CountryEntry AF = new CountryEntry("AF", (char) 4);
  public static final CountryEntry AX = new CountryEntry("AX", (char) 248);
  public static final CountryEntry AL = new CountryEntry("AL", (char) 8);
  public static final CountryEntry DZ = new CountryEntry("DZ", (char) 12);
  public static final CountryEntry AS = new CountryEntry("AS", (char) 16);
  public static final CountryEntry AD = new CountryEntry("AD", (char) 20);
  public static final CountryEntry AO = new CountryEntry("AO", (char) 24);
  public static final CountryEntry AI = new CountryEntry("AI", (char) 660);
  public static final CountryEntry AQ = new CountryEntry("AQ", (char) 10);
  public static final CountryEntry AG = new CountryEntry("AG", (char) 28);
  public static final CountryEntry AR = new CountryEntry("AR", (char) 32);
  public static final CountryEntry AM = new CountryEntry("AM", (char) 51);
  public static final CountryEntry AW = new CountryEntry("AW", (char) 533);
  public static final CountryEntry AU = new CountryEntry("AU", (char) 36);
  public static final CountryEntry AT = new CountryEntry("AT", (char) 40);
  public static final CountryEntry AZ = new CountryEntry("AZ", (char) 31);
  public static final CountryEntry BS = new CountryEntry("BS", (char) 44);
  public static final CountryEntry BH = new CountryEntry("BH", (char) 48);
  public static final CountryEntry BD = new CountryEntry("BD", (char) 50);
  public static final CountryEntry BB = new CountryEntry("BB", (char) 52);
  public static final CountryEntry BY = new CountryEntry("BY", (char) 112);
  public static final CountryEntry BE = new CountryEntry("BE", (char) 56);
  public static final CountryEntry BZ = new CountryEntry("BZ", (char) 84);
  public static final CountryEntry BJ = new CountryEntry("BJ", (char) 204);
  public static final CountryEntry BM = new CountryEntry("BM", (char) 60);
  public static final CountryEntry BT = new CountryEntry("BT", (char) 64);
  public static final CountryEntry BO = new CountryEntry("BO", (char) 68);
  public static final CountryEntry BQ = new CountryEntry("BQ", (char) 535);
  public static final CountryEntry BA = new CountryEntry("BA", (char) 70);
  public static final CountryEntry BW = new CountryEntry("BW", (char) 72);
  public static final CountryEntry BV = new CountryEntry("BV", (char) 74);
  public static final CountryEntry BR = new CountryEntry("BR", (char) 76);
  public static final CountryEntry IO = new CountryEntry("IO", (char) 86);
  public static final CountryEntry BN = new CountryEntry("BN", (char) 96);
  public static final CountryEntry BG = new CountryEntry("BG", (char) 100);
  public static final CountryEntry BF = new CountryEntry("BF", (char) 854);
  public static final CountryEntry BI = new CountryEntry("BI", (char) 108);
  public static final CountryEntry CV = new CountryEntry("CV", (char) 132);
  public static final CountryEntry KH = new CountryEntry("KH", (char) 116);
  public static final CountryEntry CM = new CountryEntry("CM", (char) 120);
  public static final CountryEntry CA = new CountryEntry("CA", (char) 124);
  public static final CountryEntry KY = new CountryEntry("KY", (char) 136);
  public static final CountryEntry CF = new CountryEntry("CF", (char) 140);
  public static final CountryEntry TD = new CountryEntry("TD", (char) 148);
  public static final CountryEntry CL = new CountryEntry("CL", (char) 152);
  public static final CountryEntry CN = new CountryEntry("CN", (char) 156);
  public static final CountryEntry CX = new CountryEntry("CX", (char) 162);
  public static final CountryEntry CC = new CountryEntry("CC", (char) 166);
  public static final CountryEntry CO = new CountryEntry("CO", (char) 170);
  public static final CountryEntry KM = new CountryEntry("KM", (char) 174);
  public static final CountryEntry CD = new CountryEntry("CD", (char) 180);
  public static final CountryEntry CG = new CountryEntry("CG", (char) 178);
  public static final CountryEntry CK = new CountryEntry("CK", (char) 184);
  public static final CountryEntry CR = new CountryEntry("CR", (char) 188);
  public static final CountryEntry CI = new CountryEntry("CI", (char) 384);
  public static final CountryEntry HR = new CountryEntry("HR", (char) 191);
  public static final CountryEntry CU = new CountryEntry("CU", (char) 192);
  public static final CountryEntry CW = new CountryEntry("CW", (char) 531);
  public static final CountryEntry CY = new CountryEntry("CY", (char) 196);
  public static final CountryEntry CZ = new CountryEntry("CZ", (char) 203);
  public static final CountryEntry DK = new CountryEntry("DK", (char) 208);
  public static final CountryEntry DJ = new CountryEntry("DJ", (char) 262);
  public static final CountryEntry DM = new CountryEntry("DM", (char) 212);
  public static final CountryEntry DO = new CountryEntry("DO", (char) 214);
  public static final CountryEntry EC = new CountryEntry("EC", (char) 218);
  public static final CountryEntry EG = new CountryEntry("EG", (char) 818);
  public static final CountryEntry SV = new CountryEntry("SV", (char) 222);
  public static final CountryEntry GQ = new CountryEntry("GQ", (char) 226);
  public static final CountryEntry ER = new CountryEntry("ER", (char) 232);
  public static final CountryEntry EE = new CountryEntry("EE", (char) 233);
  public static final CountryEntry SZ = new CountryEntry("SZ", (char) 748);
  public static final CountryEntry ET = new CountryEntry("ET", (char) 231);
  public static final CountryEntry FK = new CountryEntry("FK", (char) 238);
  public static final CountryEntry FO = new CountryEntry("FO", (char) 234);
  public static final CountryEntry FJ = new CountryEntry("FJ", (char) 242);
  public static final CountryEntry FI = new CountryEntry("FI", (char) 246);
  public static final CountryEntry FR = new CountryEntry("FR", (char) 250);
  public static final CountryEntry GF = new CountryEntry("GF", (char) 254);
  public static final CountryEntry PF = new CountryEntry("PF", (char) 258);
  public static final CountryEntry TF = new CountryEntry("TF", (char) 260);
  public static final CountryEntry GA = new CountryEntry("GA", (char) 266);
  public static final CountryEntry GM = new CountryEntry("GM", (char) 270);
  public static final CountryEntry GE = new CountryEntry("GE", (char) 268);
  public static final CountryEntry DE = new CountryEntry("DE", (char) 276);
  public static final CountryEntry GH = new CountryEntry("GH", (char) 288);
  public static final CountryEntry GI = new CountryEntry("GI", (char) 292);
  public static final CountryEntry GR = new CountryEntry("GR", (char) 300);
  public static final CountryEntry GL = new CountryEntry("GL", (char) 304);
  public static final CountryEntry GD = new CountryEntry("GD", (char) 308);
  public static final CountryEntry GP = new CountryEntry("GP", (char) 312);
  public static final CountryEntry GU = new CountryEntry("GU", (char) 316);
  public static final CountryEntry GT = new CountryEntry("GT", (char) 320);
  public static final CountryEntry GG = new CountryEntry("GG", (char) 831);
  public static final CountryEntry GN = new CountryEntry("GN", (char) 324);
  public static final CountryEntry GW = new CountryEntry("GW", (char) 624);
  public static final CountryEntry GY = new CountryEntry("GY", (char) 328);
  public static final CountryEntry HT = new CountryEntry("HT", (char) 332);
  public static final CountryEntry HM = new CountryEntry("HM", (char) 334);
  public static final CountryEntry VA = new CountryEntry("VA", (char) 336);
  public static final CountryEntry HN = new CountryEntry("HN", (char) 340);
  public static final CountryEntry HK = new CountryEntry("HK", (char) 344);
  public static final CountryEntry HU = new CountryEntry("HU", (char) 348);
  public static final CountryEntry IS = new CountryEntry("IS", (char) 352);
  public static final CountryEntry IN = new CountryEntry("IN", (char) 356);
  public static final CountryEntry ID = new CountryEntry("ID", (char) 360);
  public static final CountryEntry IR = new CountryEntry("IR", (char) 364);
  public static final CountryEntry IQ = new CountryEntry("IQ", (char) 368);
  public static final CountryEntry IE = new CountryEntry("IE", (char) 372);
  public static final CountryEntry IM = new CountryEntry("IM", (char) 833);
  public static final CountryEntry IL = new CountryEntry("IL", (char) 376);
  public static final CountryEntry IT = new CountryEntry("IT", (char) 380);
  public static final CountryEntry JM = new CountryEntry("JM", (char) 388);
  public static final CountryEntry JP = new CountryEntry("JP", (char) 392);
  public static final CountryEntry JE = new CountryEntry("JE", (char) 832);
  public static final CountryEntry JO = new CountryEntry("JO", (char) 400);
  public static final CountryEntry KZ = new CountryEntry("KZ", (char) 398);
  public static final CountryEntry KE = new CountryEntry("KE", (char) 404);
  public static final CountryEntry KI = new CountryEntry("KI", (char) 296);
  public static final CountryEntry KP = new CountryEntry("KP", (char) 408);
  public static final CountryEntry KR = new CountryEntry("KR", (char) 410);
  public static final CountryEntry KW = new CountryEntry("KW", (char) 414);
  public static final CountryEntry KG = new CountryEntry("KG", (char) 417);
  public static final CountryEntry LA = new CountryEntry("LA", (char) 418);
  public static final CountryEntry LV = new CountryEntry("LV", (char) 428);
  public static final CountryEntry LB = new CountryEntry("LB", (char) 422);
  public static final CountryEntry LS = new CountryEntry("LS", (char) 426);
  public static final CountryEntry LR = new CountryEntry("LR", (char) 430);
  public static final CountryEntry LY = new CountryEntry("LY", (char) 434);
  public static final CountryEntry LI = new CountryEntry("LI", (char) 438);
  public static final CountryEntry LT = new CountryEntry("LT", (char) 440);
  public static final CountryEntry LU = new CountryEntry("LU", (char) 442);
  public static final CountryEntry MO = new CountryEntry("MO", (char) 446);
  public static final CountryEntry MK = new CountryEntry("MK", (char) 807);
  public static final CountryEntry MG = new CountryEntry("MG", (char) 450);
  public static final CountryEntry MW = new CountryEntry("MW", (char) 454);
  public static final CountryEntry MY = new CountryEntry("MY", (char) 458);
  public static final CountryEntry MV = new CountryEntry("MV", (char) 462);
  public static final CountryEntry ML = new CountryEntry("ML", (char) 466);
  public static final CountryEntry MT = new CountryEntry("MT", (char) 470);
  public static final CountryEntry MH = new CountryEntry("MH", (char) 584);
  public static final CountryEntry MQ = new CountryEntry("MQ", (char) 474);
  public static final CountryEntry MR = new CountryEntry("MR", (char) 478);
  public static final CountryEntry MU = new CountryEntry("MU", (char) 480);
  public static final CountryEntry YT = new CountryEntry("YT", (char) 175);
  public static final CountryEntry MX = new CountryEntry("MX", (char) 484);
  public static final CountryEntry FM = new CountryEntry("FM", (char) 583);
  public static final CountryEntry MD = new CountryEntry("MD", (char) 498);
  public static final CountryEntry MC = new CountryEntry("MC", (char) 492);
  public static final CountryEntry MN = new CountryEntry("MN", (char) 496);
  public static final CountryEntry ME = new CountryEntry("ME", (char) 499);
  public static final CountryEntry MS = new CountryEntry("MS", (char) 500);
  public static final CountryEntry MA = new CountryEntry("MA", (char) 504);
  public static final CountryEntry MZ = new CountryEntry("MZ", (char) 508);
  public static final CountryEntry MM = new CountryEntry("MM", (char) 104);
  public static final CountryEntry NA = new CountryEntry("NA", (char) 516);
  public static final CountryEntry NR = new CountryEntry("NR", (char) 520);
  public static final CountryEntry NP = new CountryEntry("NP", (char) 524);
  public static final CountryEntry NL = new CountryEntry("NL", (char) 528);
  public static final CountryEntry NC = new CountryEntry("NC", (char) 540);
  public static final CountryEntry NZ = new CountryEntry("NZ", (char) 554);
  public static final CountryEntry NI = new CountryEntry("NI", (char) 558);
  public static final CountryEntry NE = new CountryEntry("NE", (char) 562);
  public static final CountryEntry NG = new CountryEntry("NG", (char) 566);
  public static final CountryEntry NU = new CountryEntry("NU", (char) 570);
  public static final CountryEntry NF = new CountryEntry("NF", (char) 574);
  public static final CountryEntry MP = new CountryEntry("MP", (char) 580);
  public static final CountryEntry NO = new CountryEntry("NO", (char) 578);
  public static final CountryEntry OM = new CountryEntry("OM", (char) 512);
  public static final CountryEntry PK = new CountryEntry("PK", (char) 586);
  public static final CountryEntry PW = new CountryEntry("PW", (char) 585);
  public static final CountryEntry PS = new CountryEntry("PS", (char) 275);
  public static final CountryEntry PA = new CountryEntry("PA", (char) 591);
  public static final CountryEntry PG = new CountryEntry("PG", (char) 598);
  public static final CountryEntry PY = new CountryEntry("PY", (char) 600);
  public static final CountryEntry PE = new CountryEntry("PE", (char) 604);
  public static final CountryEntry PH = new CountryEntry("PH", (char) 608);
  public static final CountryEntry PN = new CountryEntry("PN", (char) 612);
  public static final CountryEntry PL = new CountryEntry("PL", (char) 616);
  public static final CountryEntry PT = new CountryEntry("PT", (char) 620);
  public static final CountryEntry PR = new CountryEntry("PR", (char) 630);
  public static final CountryEntry QA = new CountryEntry("QA", (char) 634);
  public static final CountryEntry RE = new CountryEntry("RE", (char) 638);
  public static final CountryEntry RO = new CountryEntry("RO", (char) 642);
  public static final CountryEntry RU = new CountryEntry("RU", (char) 643);
  public static final CountryEntry RW = new CountryEntry("RW", (char) 646);
  public static final CountryEntry BL = new CountryEntry("BL", (char) 652);
  public static final CountryEntry SH = new CountryEntry("SH", (char) 654);
  public static final CountryEntry KN = new CountryEntry("KN", (char) 659);
  public static final CountryEntry LC = new CountryEntry("LC", (char) 662);
  public static final CountryEntry MF = new CountryEntry("MF", (char) 663);
  public static final CountryEntry PM = new CountryEntry("PM", (char) 666);
  public static final CountryEntry VC = new CountryEntry("VC", (char) 670);
  public static final CountryEntry WS = new CountryEntry("WS", (char) 882);
  public static final CountryEntry SM = new CountryEntry("SM", (char) 674);
  public static final CountryEntry ST = new CountryEntry("ST", (char) 678);
  public static final CountryEntry SA = new CountryEntry("SA", (char) 682);
  public static final CountryEntry SN = new CountryEntry("SN", (char) 686);
  public static final CountryEntry RS = new CountryEntry("RS", (char) 688);
  public static final CountryEntry SC = new CountryEntry("SC", (char) 690);
  public static final CountryEntry SL = new CountryEntry("SL", (char) 694);
  public static final CountryEntry SG = new CountryEntry("SG", (char) 702);
  public static final CountryEntry SX = new CountryEntry("SX", (char) 534);
  public static final CountryEntry SK = new CountryEntry("SK", (char) 703);
  public static final CountryEntry SI = new CountryEntry("SI", (char) 705);
  public static final CountryEntry SB = new CountryEntry("SB", (char) 90);
  public static final CountryEntry SO = new CountryEntry("SO", (char) 706);
  public static final CountryEntry ZA = new CountryEntry("ZA", (char) 710);
  public static final CountryEntry GS = new CountryEntry("GS", (char) 239);
  public static final CountryEntry SS = new CountryEntry("SS", (char) 728);
  public static final CountryEntry ES = new CountryEntry("ES", (char) 724);
  public static final CountryEntry LK = new CountryEntry("LK", (char) 144);
  public static final CountryEntry SD = new CountryEntry("SD", (char) 729);
  public static final CountryEntry SR = new CountryEntry("SR", (char) 740);
  public static final CountryEntry SJ = new CountryEntry("SJ", (char) 744);
  public static final CountryEntry SE = new CountryEntry("SE", (char) 752);
  public static final CountryEntry CH = new CountryEntry("CH", (char) 756);
  public static final CountryEntry SY = new CountryEntry("SY", (char) 760);
  public static final CountryEntry TW = new CountryEntry("TW", (char) 158);
  public static final CountryEntry TJ = new CountryEntry("TJ", (char) 762);
  public static final CountryEntry TZ = new CountryEntry("TZ", (char) 834);
  public static final CountryEntry TH = new CountryEntry("TH", (char) 764);
  public static final CountryEntry TL = new CountryEntry("TL", (char) 626);
  public static final CountryEntry TG = new CountryEntry("TG", (char) 768);
  public static final CountryEntry TK = new CountryEntry("TK", (char) 772);
  public static final CountryEntry TO = new CountryEntry("TO", (char) 776);
  public static final CountryEntry TT = new CountryEntry("TT", (char) 780);
  public static final CountryEntry TN = new CountryEntry("TN", (char) 788);
  public static final CountryEntry TR = new CountryEntry("TR", (char) 792);
  public static final CountryEntry TM = new CountryEntry("TM", (char) 795);
  public static final CountryEntry TC = new CountryEntry("TC", (char) 796);
  public static final CountryEntry TV = new CountryEntry("TV", (char) 798);
  public static final CountryEntry UG = new CountryEntry("UG", (char) 800);
  public static final CountryEntry UA = new CountryEntry("UA", (char) 804);
  public static final CountryEntry AE = new CountryEntry("AE", (char) 784);
  public static final CountryEntry GB = new CountryEntry("GB", (char) 826);
  public static final CountryEntry UM = new CountryEntry("UM", (char) 581);
  public static final CountryEntry US = new CountryEntry("US", (char) 840);
  public static final CountryEntry UY = new CountryEntry("UY", (char) 858);
  public static final CountryEntry UZ = new CountryEntry("UZ", (char) 860);
  public static final CountryEntry VU = new CountryEntry("VU", (char) 548);
  public static final CountryEntry VE = new CountryEntry("VE", (char) 862);
  public static final CountryEntry VN = new CountryEntry("VN", (char) 704);
  public static final CountryEntry VG = new CountryEntry("VG", (char) 92);
  public static final CountryEntry VI = new CountryEntry("VI", (char) 850);
  public static final CountryEntry WF = new CountryEntry("WF", (char) 876);
  public static final CountryEntry EH = new CountryEntry("EH", (char) 732);
  public static final CountryEntry YE = new CountryEntry("YE", (char) 887);
  public static final CountryEntry ZM = new CountryEntry("ZM", (char) 894);
  public static final CountryEntry ZW = new CountryEntry("ZW", (char) 716);

  private static CountryEntry[] _entriesAboutCountries = new CountryEntry[] {
    AF,
    AX,
    AL,
    DZ,
    AS,
    AD,
    AO,
    AI,
    AQ,
    AG,
    AR,
    AM,
    AW,
    AU,
    AT,
    AZ,
    BS,
    BH,
    BD,
    BB,
    BY,
    BE,
    BZ,
    BJ,
    BM,
    BT,
    BO,
    BQ,
    BA,
    BW,
    BV,
    BR,
    IO,
    BN,
    BG,
    BF,
    BI,
    CV,
    KH,
    CM,
    CA,
    KY,
    CF,
    TD,
    CL,
    CN,
    CX,
    CC,
    CO,
    KM,
    CD,
    CG,
    CK,
    CR,
    CI,
    HR,
    CU,
    CW,
    CY,
    CZ,
    DK,
    DJ,
    DM,
    DO,
    EC,
    EG,
    SV,
    GQ,
    ER,
    EE,
    SZ,
    ET,
    FK,
    FO,
    FJ,
    FI,
    FR,
    GF,
    PF,
    TF,
    GA,
    GM,
    GE,
    DE,
    GH,
    GI,
    GR,
    GL,
    GD,
    GP,
    GU,
    GT,
    GG,
    GN,
    GW,
    GY,
    HT,
    HM,
    VA,
    HN,
    HK,
    HU,
    IS,
    IN,
    ID,
    IR,
    IQ,
    IE,
    IM,
    IL,
    IT,
    JM,
    JP,
    JE,
    JO,
    KZ,
    KE,
    KI,
    KP,
    KR,
    KW,
    KG,
    LA,
    LV,
    LB,
    LS,
    LR,
    LY,
    LI,
    LT,
    LU,
    MO,
    MK,
    MG,
    MW,
    MY,
    MV,
    ML,
    MT,
    MH,
    MQ,
    MR,
    MU,
    YT,
    MX,
    FM,
    MD,
    MC,
    MN,
    ME,
    MS,
    MA,
    MZ,
    MM,
    NA,
    NR,
    NP,
    NL,
    NC,
    NZ,
    NI,
    NE,
    NG,
    NU,
    NF,
    MP,
    NO,
    OM,
    PK,
    PW,
    PS,
    PA,
    PG,
    PY,
    PE,
    PH,
    PN,
    PL,
    PT,
    PR,
    QA,
    RE,
    RO,
    RU,
    RW,
    BL,
    SH,
    KN,
    LC,
    MF,
    PM,
    VC,
    WS,
    SM,
    ST,
    SA,
    SN,
    RS,
    SC,
    SL,
    SG,
    SX,
    SK,
    SI,
    SB,
    SO,
    ZA,
    GS,
    SS,
    ES,
    LK,
    SD,
    SR,
    SJ,
    SE,
    CH,
    SY,
    TW,
    TJ,
    TZ,
    TH,
    TL,
    TG,
    TK,
    TO,
    TT,
    TN,
    TR,
    TM,
    TC,
    TV,
    UG,
    UA,
    AE,
    GB,
    UM,
    US,
    UY,
    UZ,
    VU,
    VE,
    VN,
    VG,
    VI,
    WF,
    EH,
    YE,
    ZM,
    ZW,
  };
}
