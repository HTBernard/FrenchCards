package src.CardsPack.CardsFormat.Value;

public enum TRUMP implements Value {
    FOOL("*"),
    ONE("1"),
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    HEIGHT("8"),
    NINE("9"),
    TEN("10"),
    ELEVEN("11"),
    TWELVE("12"),
    THIRTEEN("13"),
    FOURTEEN("14"),
    FIFTEEN("15"),
    SIXTEEN("16"),
    SEVENTEEN("17"),
    HEIGHTEN("18"),
    NINETEEN("19"),
    TWENTY("20"),
    TWENTY_ONE("21");

    public final String label;

    TRUMP(String label) {
        this.label = label;
    }

    @Override
    public String getLabel() {
        return label;
    }
}
