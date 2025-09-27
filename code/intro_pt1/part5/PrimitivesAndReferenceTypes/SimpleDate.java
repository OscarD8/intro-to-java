package intro_pt1.part5.PrimitivesAndReferenceTypes;

public class SimpleDate
{
    private int day;
    private int month;
    private int year;

    public SimpleDate() {
        this(1, 1, 1);
    }
    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }
    public boolean before(SimpleDate compared) {
        // first compare years
        if (this.year < compared.year) {
            return true;
        }

        if (this.year > compared.year) {
            return false;
        }

        // years are same, compare months
        if (this.month < compared.month) {
            return true;
        }

        if (this.month > compared.month) {
            return false;
        }

        // years and months are same, compare days
        return this.day < compared.day;
    }
    public void advance(int howManyDays) {
        if (!(this.day + howManyDays > 30)) {
            this.day += howManyDays;
        } else {
            this.day = this.day + howManyDays - 30;
            if (!(this.month + 1 > 12)) {
                this.month += 1;
            } else {
                this.month = 1;
                this.year += 1;
            }
        }
    }
    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate futureDate = new SimpleDate(this.day, this.month, this.year);

        int monthIncrease = this.month + Math.floorDiv(days + this.day, 30);
        int yearIncrease = Math.floorDiv(monthIncrease, 12);
        if (!(futureDate.day + days > 30)) {
            futureDate.day += days;
        }
        else {
            futureDate.day = (days + this.day) % 30;

            if (!(monthIncrease > 12)) {
                futureDate.month = monthIncrease;
            } else {
                futureDate.month = monthIncrease % 12;
                futureDate.year += yearIncrease;
            }
        }

        return futureDate;
    }
    public boolean equals(Object compared) {
        // if the variables are located in the same position, they are equal
        if (this == compared) {
            return true;
        }

        // if the type of the compared object is not SimpleDate, the objects are not equal
        if (!(compared instanceof SimpleDate comparedSimpleDate)) {
            return false;
        }

        // convert the Object type compared object
        // into a SimpleDate type object called comparedSimpleDate

        // if the values of the object variables are the same, the objects are equal
        return this.day == comparedSimpleDate.day &&
                this.month == comparedSimpleDate.month &&
                this.year == comparedSimpleDate.year;

        // otherwise the objects are not equal
    }


    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
}
