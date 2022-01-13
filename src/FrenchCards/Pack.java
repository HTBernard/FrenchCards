package src.CardsPack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Pack {
    private Stack<Card> stack;

    public Pack(List<Card> pack) {
        stack = new Stack<>();
        stack.addAll(pack);
    }

    public Pack() {
        stack = new Stack<>();
    }

    public int size() {
        return stack.size();
    }

    public void shuffle() {
        Collections.shuffle(stack);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Card card : stack) {
            sb.append(card.toString());
            sb.append('\n');
        }
        return sb.toString();
    }

    public List<Card> pull(int nbCards) {
        List<Card> cards = new ArrayList<>();
        for(int index = 0; index < nbCards; index++) {
            cards.add(pull());
        }
        return cards;
    }

    public Card pull() {
        return stack.pop();
    }

    public void refill(Pack trash) {
        List<Card> newDeck = trash.stack.subList(0, trash.size() - 2);
        trash.stack.removeAll(newDeck);
        stack.addAll(newDeck);
    }
}
