package by.kobyzau.tg.bot.pbot.tg.sticker;

import by.kobyzau.tg.bot.pbot.util.CollectionUtil;
import by.kobyzau.tg.bot.pbot.util.StringUtil;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;

public enum StickerType {
  COVID(
      "CAACAgIAAxkBAAIFe160P3RkZPrbeEviA4MPRJ-ayO0HAALtAQACVp29ChFLItZKWIpNGQQ",
      "CAACAgIAAxkBAAIFel60P2qjxpsx4b1-eA_GKAMp4KHkAAKoAAPkoM4HGX3fqOpZy1UZBA",
      "CAACAgIAAxkBAAIFeV60P2BM3b8eRjXeZH6CkvEcsnixAALIAQACVp29Ch5kbWu8BAS4GQQ",
      "CAACAgIAAxkBAAIFeF60P1xybXPOjQ-CljwuUnpFbT4iAALzAQACVp29CqoniIxoJUGPGQQ"),
  LOVE(
      "CAACAgIAAxkBAAICp15FNOPbCaclP-TfRBp8oSjPXlCAAAJsAAOWn4wOgCt-cSkIBlEYBA",
      "CAACAgIAAxkBAAICqF5FNXXx247rW2QUWxnL8uLNoEivAAIEAQACVp29Ct4E0XpmZvdsGAQ",
      "CAACAgIAAxkBAAICqV5FNX2v1MyMzRVrHVTxtF0LXwJ9AAITAAOvxlEaWm7uRWmjo3MYBA",
      "CAACAgIAAxkBAAICql5FNYzBOYDf36SuEK3ih1PeI7kUAAIjAAP3AsgPlczTTWG9fUcYBA"),
  LOL(
      "CAADAgADXgADUomRI_5xpNU-Z9mEFgQ",
      "CAADAgADmwMAAs-71A75gkZ93Rv-ixYE",
      "CAADAgADWAADUomRI32OzA4HOEuGFgQ",
      "CAADAgADIwADO2AkFGvbSvJGWstYFgQ",
      "CAADAgADYgADlp-MDgsNmImrEBX6FgQ",
      "CAADAgADAQADwDZPExguczCrPy1RFgQ"),
  COOL(
      "CAACAgIAAxkBAAIDGl5dWaspavqraICMt9i_vB-LDjtfAAJEAAOyglUgIu1BSIIMRJAYBA",
      "CAACAgIAAxkBAAIDGV5dWZ0IxU4kk5G2sfw40xfO9gwRAAInAAOyglUgDBYt5z5c5wkYBA",
      "CAACAgIAAxkBAAIDGF5dWZrZ5mnRySHxKXOViFgUS2KaAAI0AAOyglUgxWfTP59qRvEYBA",
      "CAADAgADCwADO2AkFMPPOZh4z_kHFgQ",
      "CAADAgADrQkAAnlc4gnGTO4AAVwKVRoWBA",
      "CAADAgAD6AIAArVx2gZSDa62VYCCWxYE",
      "CAADAgADJQADDbbSGYR9-DFmyxk_FgQ",
      "CAADAgADRgADUomRI_j-5eQK1QodFgQ",
      "CAADAgADBAADO2AkFLOr61RvleGrFgQ",
      "CAADAgADIAADlp-MDqz9QTP0qm_5FgQ",
      "CAADAgADowADMNSdEWmtlTFeBowaFgQ"),
  PIDOR(
      "CAACAgIAAxkBAAIDG15dYJKeTQ7B_cBQpDhzMhymtDKmAAKXAAPkoM4H7oUgYJJCasoYBA",
      "CAACAgIAAxkBAAIDHF5dYJNkBAIdn91wpz6tjyHaiMsgAAKfAAPkoM4Hcgov_iX58osYBA",
      "CAADAgADIgoAAlOx9wOADyaiQm0-qhYE",
      "CAACAgIAAxkBAAIGf19WWCfq_leSOgmEwH1HpPlm6EOeAAKPdAEAAWOLRgwqe9qGci9BrBsE",
      "CAADAgADaQMAAqdw6ghUIfn07qi3lhYE",
      "CAACAgIAAxkBAAIIgl9bOmXiaWUvFsdrPAvC2aiEowS8AAIXAAMq7r0SWFc0o2QsLcwbBA",
      "CAADAgADmwUAAlOx9wNCvw--ehyldxYE",
      "CAACAgIAAxkBAAIGgF9WWDVq4V9m3YqUKJcdZlCVudUZAAIcAAORaAwAAY0VMcNXmyMJGwQ",
      "CAADAgADnwUAAlOx9wOcWUVVk-EOiRYE",
      "CAADAgADoQUAAlOx9wMCmfXNSE716xYE",
      "CAADAgADpQUAAlOx9wOvbMIJtsAWphYE",
      "CAADAgADyT0AAlOx9wM-BQmopQzCdxYE",
      "CAACAgIAAxkBAAIIg19bOmVttE5NNRrcXnqfE-wI8Q1BAAIfAAMq7r0STr0soSPG8_4bBA",
      "CAACAgIAAxkBAAIIhF9bOmU96l2M_ximOZ7mwxS7josMAAIiAAMq7r0SP_NwCWjyVUIbBA",
      "CAACAgIAAxkBAAIIhV9bOmX17JZKPEWIpsw_2xs_-GugAAIqAAMq7r0SrzpV8bT3ZXMbBA",
      "CAACAgIAAxkBAAIIhl9bOmVYWP3pjjiprbVuvM746uN8AAIrAAMq7r0SX4YY4ODKMtgbBA",
      "CAADAgAD2nUBAAFji0YMUciy5pFv82EWBA"),
  LOOKING_PIDOR(
      "CAACAgIAAxkBAAIIh19bOvHnZOBHTKOXJ4BqKjPHEzFZAAIYAAMq7r0SNv28PCtEzgEbBA",
      "CAACAgIAAxkBAAIIiF9bOvOGUvKmWdLzS111zes2NZ3hAAIaAAMq7r0SDqKF5ZduBPEbBA",
      "CAACAgIAAxkBAAIIil9bOvXMGNtjVMiwN6xTQqD4o4-EAAIcAAMq7r0Sr6Sv9vZ8vZIbBA",
      "CAACAgIAAxkBAAIIi19bOvru29gpZO6o59H_Qb1fwjLJAAIgAAMq7r0SBH2IWBmxUJUbBA",
      "CAACAgIAAxkBAAIIjF9bOvtzsrAQb3A1qRXc7Ogqu8OEAAIhAAMq7r0SoVvQWOUTwU4bBA",
      "CAACAgIAAxkBAAIIjV9bOwL3UQX7695D4FNfq-TnhkYcAAIlAAMq7r0S89aZX54COhMbBA",
      "CAACAgIAAxkBAAIIjl9bOwQ2JaK-MQNlnOkfsXhrK3SmAAInAAMq7r0SkF78m_BqSI0bBA",
      "CAACAgIAAxkBAAIIj19bOwp2jLWwmr8AAY9adGRdCVqBaQACKQADKu69En2y-P08aKt0GwQ",
      "CAACAgIAAxkBAAIIkF9bOw2r-4EESQzM8xcn7nbjeVo8AAItAAMq7r0SzxS5zLu6prgbBA",
      "CAACAgIAAxkBAAIIkV9bOxUt39fID2XOjc0yTY2gS9LwAAI2AAMq7r0S5lpmxnXT3ZkbBA",
      "CAACAgIAAxkBAAIIiV9bOvUKdRL1QS3bRwAB-PVbeDZ_3wACGwADKu69EmZ3srn2eajxGwQ"),
  SAD(
      "CAADAgAD8wADVp29Cmob68TH-pb-FgQ",
      "CAADAgADJQAD9wLID_wNw-ch8MYWFgQ",
      "CAADAgADBwADr8ZRGrjX-OfHvPc0FgQ",
      "CAADAgADqQADMNSdEWpgUZQ54UcyFgQ",
      "CAADAgADogADFkJrCuweM-Hw5ackFgQ"),

  //CUSTOM SET
  PIDOR_NIKITA(
      "CAADAgADBQADp93mGonETsrNE4M4FgQ",
      "CAADAgADEgADp93mGon5848AAcyTLhYE",
      "CAADAgADDQADp93mGlNI0S4T_0GhFgQ",
      "CAADAgADFAADp93mGh3XvflzFuCAFgQ",
      "CAADAgADDwADp93mGibAn5zHhuALFgQ"),
  PIDOR_VOVA(
      "CAADAgADGAADp93mGp_EsqroNzAEFgQ",
      "CAADAgADHQADp93mGic67L2qXP_4FgQ",
      "CAADAgADEAADp93mGs7SGfpzkfi1FgQ",
      "CAADAgADDAADp93mGvIp7FRyqZUYFgQ"),
  PIDOR_FIL(
      "CAACAgIAAxkBAAIDK15damHE45FauYyEWrHQmDe9GXDPAAIqAAOn3eYaA3lSbxduG6EYBA",
      "CAADAgADHwADp93mGtLxP6hBlPdWFgQ",
      "CAADAgADGQADp93mGlsd0PiAymYVFgQ",
      "CAACAgIAAxkBAAIGfl9WV-shrHU9uUe-03SjrTrNaKMoAAIrAAOn3eYa7ysIXg65KMAbBA",
      "CAADAgADFwADp93mGhAG4L2ch2I_FgQ"),
  PIDOR_SANYA("CAADAgADAwADp93mGhKYjMXwcFNVFgQ", "CAADAgADEwADp93mGilg--ljJ5LFFgQ"),
  PIDOR_ARTYR(
      "CAADAgADIAADp93mGhEsb_aYoD2BFgQ",
      "CAADAgADBAADp93mGhOSvNb5xVyEFgQ",
      "CAADAgADCgADp93mGhRO6QbIvW_zFgQ"),
  PIDOR_MAX(
      "CAADAgADCAADp93mGkkyFqHiRk8PFgQ",
      "CAADAgADEQADp93mGtHW4fWzs3F7FgQ",
      "CAADAgADCQADp93mGvVD_YWe0JX8FgQ"),
  PIDOR_SHOHAN(
      "CAADAgADDgADp93mGip7wUAAARh-xxYE",
      "CAADAgADFQADp93mGurrGAJjwOMFFgQ",
      "CAADAgADGgADp93mGiz4dfL9tXrkFgQ"),
  PIDOR_DIMKA("CAACAgIAAxkBAAIDKl5damDFOwSx9CN9xl_ejqDkUn4ZAAIpAAOn3eYaDF5f97J_N-sYBA"),
  PIDOR_SERGEY_JOB(
      "CAACAgIAAxkBAAIDJl5dYtdRPjiK-J5YbcPazaHJeByNAAInAAOn3eYaT7nK4IkocmoYBA",
      "CAACAgIAAxkBAAIJOF4sdctVLCNXiHc85nPjGj1xvU6XAAImAAOn3eYa-r5Pl9UMrB4YBA",
      "CAACAgIAAxkBAAIJOV4sdcy_B1CoQLwE9JiMD_XL0GHWAAIlAAOn3eYaafcaVNvCSqIYBA",
      "CAACAgIAAxkBAAIJOl4sdczmvJo86BXrjid-bTJWqJ6GAAIkAAOn3eYavxlmLUdHgtEYBA");

  private final List<String> stickers;

  StickerType(String... stickers) {
    this.stickers = Arrays.asList(stickers);
  }

  public List<String> getStickers() {
    return stickers;
  }

  public String getRandom() {
    return CollectionUtil.getRandomValue(getStickers());
  }

  private boolean isPidor() {
    return name().startsWith("PIDOR_");
  }

  public static Optional<StickerType> parseSticker(String name) {
    final String stickerName = StringUtil.trim(name).toUpperCase();
    return EnumSet.allOf(StickerType.class).stream()
        .filter(s -> s.name().equals(stickerName))
        .findFirst();
  }

  public static Optional<StickerType> getPidorSticker(String name) {
    return parseSticker(name).filter(StickerType::isPidor);
  }
}
