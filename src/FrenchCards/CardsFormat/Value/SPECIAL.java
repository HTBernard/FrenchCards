package src.CardsPack.CardsFormat.Value;

public enum SPECIAL implements Value {
    JOKER("J");

    public final String label;

    SPECIAL(String label) {
        this.label = label;
    }

    @Override
    public String getLabel() {
        return label;
    }
}
