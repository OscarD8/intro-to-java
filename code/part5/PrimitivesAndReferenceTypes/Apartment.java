package code.part5.PrimitivesAndReferenceTypes;

public class Apartment
{
    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compare) {
        return this.squares > compare.squares;
    }
    public int priceDifference(Apartment compared) {
        if (this.getAbsoluteValue() > compared.getAbsoluteValue()) {
            return this.getAbsoluteValue() - compared.getAbsoluteValue();
        }
        return compared.getAbsoluteValue() - this.getAbsoluteValue();
    }
    public boolean moreExpensiveThan (Apartment compare) {
        return this.getAbsoluteValue() > compare.getAbsoluteValue();
    }
    public int getAbsoluteValue() {
        return this.pricePerSquare * this.squares;
    }
    public int getPricePerSquare() {
        return this.pricePerSquare;
    }
}

