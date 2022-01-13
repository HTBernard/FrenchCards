package src.CardsPack.CardsFormat.Value;

public enum NUMBER implements Value {
    ONE("1"),
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    HEIGHT("8"),
    NINE("9"),
    TEN("10");

    public final String label;

    NUMBER(String label) {
        this.label = label;
    }

    @Override
    public String getLabel() {
        return label;
    }
}
