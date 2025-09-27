package intro_pt2.EnumsAndIterator.DeckOfCards;

import java.util.Objects;

public class Card implements Comparable<Card>
{
    private Suit suit;
    private int value;

    public Card(int value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return value == card.value && suit == card.suit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, value);
    }

    public Suit getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }



    @Override
    public int compareTo(Card compare) {
        return this.suit.ordinal() - compare.suit.ordinal();
    }

    @Override
    public String toString() {
        return switch (value) {
            case 14 -> suit + " A";
            case 13 -> suit + " K";
            case 12 -> suit + " Q";
            case 11 -> suit + " J";
            default -> suit + " " + value;
        };
    }
}
