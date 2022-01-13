package src.CardsPack.CardsFormat;

import src.CardsPack.Card;

public enum SIGN {
    DIAMOND('♦'),
    SPADE('♠'),
    HEART('♥'),
    CLUB('♣');

    public final char label;

    SIGN(char label) {
        this.label = label;
    }

    public COLOR getColor() {
        switch (this) {
            case DIAMOND :
            case HEART:
                return COLOR.RED;
            case CLUB:
            case SPADE:
                return COLOR.BLACK;
        }
        return null;
    }
}
