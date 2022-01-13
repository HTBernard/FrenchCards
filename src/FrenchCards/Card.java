package src.CardsPack;

import src.CardsPack.CardsFormat.*;
import src.CardsPack.CardsFormat.Value.Value;

public class Card {
    private COLOR color;
    private SIGN sign;
    private Value value;

    public Card(SIGN sign, Value value) throws InstantiationException {
        if(sign instanceof SIGN) {
            this.sign = sign;
            this.value = new Card(value).value;
            this.color = sign.getColor();
        }
    }

    public Card(COLOR color, Value value) throws InstantiationException {
        if(color instanceof COLOR) {
            this.color = color;
            this.value = new Card(value).value;
            this.sign = null;
        }
    }

    public Card(Value value) throws InstantiationException {
        if(value instanceof Value) {
            this.color = null;
            this.value = value;
            this.sign = null;
        } else {
            throw new InstantiationException("The value can't be null");
        }
    }

    @Override
    public String toString() {
        String valueStr = value.getLabel();
        String colorStr = "";
        if(color instanceof COLOR) {
            colorStr = " (" + color.label + ")";
        }
        char signChr = ' ';
        if(sign instanceof SIGN) {
            signChr = sign.label;
        }
        return valueStr + (" ".repeat(3 - valueStr.length())) + signChr + colorStr;
    }
}
