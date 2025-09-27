package intro_pt1.part5.PrimitivesAndReferenceTypes;

public class Main
{
    public static void main(String[] args) {

            // HealthStation
//        Person ethan = new Person("Ethan", 1, 110, 7);
//        Person peter = new Person("Peter", 33, 176, 85);
//        HealthStation scaryHospital = new HealthStation();
//        System.out.println(ethan.getName() + " weight: " + scaryHospital.weigh(ethan) + " kilos");
//        System.out.println(peter.getName() + " weight: " + scaryHospital.weigh(peter) + " kilos");
//        System.out.println();
//        System.out.println(scaryHospital.weigh(ethan));
//        scaryHospital.feed(ethan);
//        System.out.println(scaryHospital.weigh(ethan));
//        scaryHospital.weigh(ethan);
//        System.out.println("Weighing count: " + scaryHospital.getWeighingsCount());

            // PaymentCard
        PaymentTerminal unicafeExactum = new PaymentTerminal();
        System.out.println(unicafeExactum);

        PaymentCard annesCard = new PaymentCard(2);

        System.out.println("amount of money on the card is " + annesCard.getBalance() + " euros");

        boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        unicafeExactum.addMoneyToCard(annesCard, 100);

        wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        System.out.println("amount of money on the card is " + annesCard.getBalance() + " euros");

        System.out.println(unicafeExactum);



        SimpleDate date5 = new SimpleDate(30, 9, 1999);
        Person theGirlWhoLivedComeToDie = new Person("theGirlWhoLivedComeToDie", date5);
        System.out.println(theGirlWhoLivedComeToDie.getName() + ", " + theGirlWhoLivedComeToDie.getBirthday());
        System.out.println();

        Pet leroy = new Pet("Leroy", "labrador");
        Person jeff = new Person("Jeff", leroy);
        System.out.println(jeff);

        SimpleDate s1 = new SimpleDate(22,11,1998);
        SimpleDate s2 = new SimpleDate(10, 11, 1997);
        SimpleDate s3 = new SimpleDate(30, 11, 1999);

        System.out.println(s1.before(s2));
        System.out.println(s2.before(s1));
        System.out.println(s3.before(s1));
        System.out.println();


        Apartment manhattanStudioApt = new Apartment(1, 16, 5500);
        Apartment atlantaTwoBedroomApt = new Apartment(2, 38, 4200);
        Apartment bangorThreeBedroomApt = new Apartment(3, 78, 2500);

        System.out.println(manhattanStudioApt.largerThan(atlantaTwoBedroomApt));       // false
        System.out.println(bangorThreeBedroomApt.largerThan(atlantaTwoBedroomApt));  // true
        System.out.println();

        System.out.println(manhattanStudioApt.priceDifference(atlantaTwoBedroomApt));  //71600
        System.out.println(bangorThreeBedroomApt.priceDifference(atlantaTwoBedroomApt));   //35400

        System.out.println();
        System.out.println(manhattanStudioApt.moreExpensiveThan(atlantaTwoBedroomApt));  // false
        System.out.println(bangorThreeBedroomApt.moreExpensiveThan(atlantaTwoBedroomApt));   // true
        System.out.println();


        Song jackSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);
        Song anotherSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);
        System.out.println();

        if (jackSparrow.isEqual(anotherSparrow)) {
            System.out.println("Songs are equal.");
        }

        if (jackSparrow.equals("Another object")) {
            System.out.println("Strange things are afoot.");
        }
        System.out.println();

        SimpleDate date = new SimpleDate(24, 3, 2017);
        SimpleDate date2 = new SimpleDate(23, 7, 2017);

        Person leo = new Person("Leo", date, 62, 9);
        Person lily = new Person("Lily", date2, 65, 8);
        Person chilly = new Person("Leo", date2, 62, 9);


        if (leo.isEqual(lily)) {
            System.out.println("Is this quite correct?");
        }
        if (leo.getBirthday().equals(lily.getBirthday())) {
            System.out.println("GET IN THE BIN");
        } else {
            System.out.println("AGAIN IN THE BIN");
        }

        Person leoWithDifferentWeight = new Person("Leo", date, 62, 10);

        if (leo.isEqual(leoWithDifferentWeight)) {
            System.out.println("Is this quite correct?");
        }
        System.out.println();

        SimpleDate dateCheck = new SimpleDate(1, 12, 2024);

        SimpleDate futureDate = dateCheck.afterNumberOfDays(0);
//        int week = 1;
//        while (week <= 7) {
//            System.out.println("Friday after " + week + " week, is " + futureDate);
//            futureDate = futureDate.afterNumberOfDays(7);
//            week += 1;
//        }
        System.out.println("The date after 790 days from the examined Friday is " + dateCheck.afterNumberOfDays(790));
        System.out.println();

        Money a = new Money(10, 0);
        Money b = new Money(3, 50);

        Money c = a.minus(b);

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 3.50e
        System.out.println(c);  // 6.50e

        c = c.minus(a);       // NB: a new Money object is created, and is placed "at the end of the strand connected to c"
                                //  the old 6.5 euros at the end of the strand disappears and the Java garbage collector takes care of it


        System.out.println(a);  // 10.00e
        System.out.println(b);  // 3.50e
        System.out.println(c);  // 0.00e
    }
}
