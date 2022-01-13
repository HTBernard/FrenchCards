package src.CardsPack.CardsFormat.Value;

public enum HEAD implements Value {
    KING("R"),
    QUEEN("D"),
    JACK("V"),
    KNIGHT("C");

    public final String label;

    HEAD(String label) {
        this.label = label;
    }

    @Override
    public String getLabel() {
        return label;
    }
}