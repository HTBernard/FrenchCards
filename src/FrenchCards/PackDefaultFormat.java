package src.CardsPack;

import src.CardsPack.CardsFormat.*;
import src.CardsPack.CardsFormat.Value.*;

import java.util.ArrayList;
import java.util.List;

public abstract class PackDefaultFormat {

    protected static List<Card> default52Cards() {
        ArrayList<Card> cardsList = new ArrayList<>();
        try {
            for (SIGN sign : SIGN.values()) {
                    cardsList.add(new Card(sign, HEAD.KING));
                cardsList.add(new Card(sign, HEAD.QUEEN));
                cardsList.add(new Card(sign, HEAD.JACK));
                for(NUMBER number : NUMBER.values()) {
                    cardsList.add(new Card(sign, number));
                }
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

        return cardsList;
    }

    public static List<Card> default54Cards() {
        ArrayList<Card> cardsList = new ArrayList<>(default52Cards());
        try {
            cardsList.add(new Card(COLOR.BLACK, SPECIAL.JOKER));
            cardsList.add(new Card(COLOR.RED, SPECIAL.JOKER));
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

        return cardsList;
    }

    public static List<Card> default78Cards() {
        ArrayList<Card> cardsList = new ArrayList<>(default52Cards());
        try {
            for (SIGN sign : SIGN.values()) {
                cardsList.add(new Card(sign, HEAD.KNIGHT));
            }
            for(Value value : TRUMP.values()) {
                cardsList.add(new Card(value));
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

        return cardsList;
    }
}
