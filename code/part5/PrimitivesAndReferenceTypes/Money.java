package code.part5.PrimitivesAndReferenceTypes;

public class Money
{
    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money addition) {
        Money newMoney = new Money(addition.euros + this.euros, addition.cents + this.cents);

        return newMoney;
    }
// a.lessThan(b) is that true
    public boolean lessThan(Money compared) {
        return this.euros + this.cents < compared.euros + compared.cents;
    }
// a calls be to minus so a decrease b
    public Money minus(Money decreaser) {
        int reducedEuro;
        int reducedCents;

        if (decreaser.cents > this.cents) {
            reducedEuro = (this.euros - 1) - decreaser.euros;
            reducedCents = this.cents + 100 - decreaser.cents;
        } else {
            reducedEuro = this.euros - decreaser.euros;
            reducedCents = this.cents - decreaser.cents;
        }
        if (reducedEuro >= 0) {
            return new Money(reducedEuro, reducedCents);
        }
        else return new Money(0, 0);
    }

    public int getEuros() {
        return euros;
    }

    public int getCents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
}
