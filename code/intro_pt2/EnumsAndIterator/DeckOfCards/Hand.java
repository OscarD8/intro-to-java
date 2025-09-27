package intro_pt2.EnumsAndIterator.DeckOfCards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Hand implements Comparable<Hand>
{
    private List<Card> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }


    public void add(Card card) {
       if (!hand.contains(card)) {
           hand.add(card);
       }
    }

    public void print() {
        hand.forEach(System.out::println);
    }

    public void sort() {
        Collections.sort(hand);
    }

    public void sort(Comparator<Card> comparator) {
        hand.sort(comparator);
    }

    public void sortBySuit() {
        hand.sort(new BySuitInValueOrder());
    }

    public List<Card> getHand() {
        return hand;
    }

    public int compareTo(Hand compare) {
        int handSum = hand.stream()
                .mapToInt(Card::getValue)
                .reduce(0, (Integer::sum));

        int compareSum = compare.hand.stream()
                .mapToInt(Card::getValue)
                .reduce(0, (Integer::sum));

        return handSum - compareSum;
    }
}
