package intro_pt2.EnumsAndIterator.DeckOfCards;

import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card>
{
    public int compare(Card c1, Card c2) {
        return Comparator
                .comparing(Card::getSuit)
                .thenComparing(Card::getValue)
                .compare(c1, c2);
    }
}
