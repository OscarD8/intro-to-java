package code.part4;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args){

        Whistle duckWhistle = new Whistle("Kvaak");
        Whistle roosterWhistle = new Whistle("Bokk");
        duckWhistle.sound();
        roosterWhistle.sound();


        Door jim = new Door();
        jim.knock();


        Product banana = new Product("Banana", 1.1, 13);
        banana.printProduct();
        System.out.println();


        DecreasingCounter counter = new DecreasingCounter(5);
        counter.printValue();
        counter.decrement();
        counter.printValue();
        counter.reset();
        counter.printValue();


        Debt mortgage = new Debt(1000, 1.2);
        mortgage.printBalance();
        mortgage.waitOneYear();
        mortgage.printBalance();
        int years = 0;
        while (years < 20){
            mortgage.waitOneYear();
            years += 1;
        }
        mortgage.printBalance();


        Song garden = new Song("The Garden", 10910);
        System.out.println(garden);
        System.out.println();


//        Film interstellar = new Film("Interstellar", 12);
//
//        Scanner reader = new Scanner(System.in);
//        System.out.println("How old are you? ");
//        int userAge = Integer.valueOf(reader.nextLine());
//
//        if (userAge >= interstellar.getAgeRating()){
//            System.out.println("You are able to watch " + interstellar.getName());
//        }
//        else {
//            System.out.println("You may not watch the film " + interstellar.getName());
//        }


        Gauge gauge = new Gauge();
        while (!gauge.full()) {
            System.out.println("Gauge is not full! Value: " + gauge.getValue());
            gauge.increase();
        }
        System.out.println("Full value! Value: " + gauge.getValue());
        gauge.decrease();
        System.out.println("Not full! Value: " + gauge.getValue());


        System.out.println();
        Multiplier multiplyByThree = new Multiplier(3);
        Multiplier multiplyByFour = new Multiplier(4);
        System.out.println("Multiply 2 by 4: " + multiplyByFour.multiply(2));
        System.out.println("Multiply 2 by 3: " + multiplyByThree.multiply(2));


        // Statistics
        System.out.println();
        Statistics statistics = new Statistics();
        statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());
        System.out.println();

        // Adding multiple user inputs - even and odd separately
//        Scanner intReader = new Scanner(System.in);
//        Statistics userNumbers = new Statistics();
//        Statistics oddNumbers = new Statistics();
//        Statistics evenNumbers = new Statistics();
//        int userInput;
//
//        System.out.println("Enter a number (-1 to quit): ");
//        while (true) {
//            userInput = Integer.valueOf(intReader.nextLine());
//
//            if (userInput == -1) {
//                break;
//            }
//            if (userInput % 2 == 0){
//                evenNumbers.addNumber(userInput);
//            } else {
//                oddNumbers.addNumber(userInput);
//            }
//
//            userNumbers.addNumber(userInput);
//        }
//        printStatistics(userNumbers.sum(), evenNumbers.sum(), oddNumbers.sum());


        // Payment Card
        PaymentCard card = new PaymentCard(10);
        System.out.println(card);
        card.addMoney(-15);
        System.out.println(card);
        System.out.println();

        PaymentCard paulCard = new PaymentCard(20);
        PaymentCard mattCard = new PaymentCard(30);

        paulCard.eatHeartily();
        mattCard.eatAffordably();
        System.out.println("Paul: The card has a balance of " + paulCard);
        System.out.println("Matt: The card has a balance of " + mattCard);

        paulCard.addMoney(20);
        mattCard.eatHeartily();
        System.out.println("Paul: The card has a balance of " + paulCard);
        System.out.println("Matt: The card has a balance of " + mattCard);

        paulCard.eatAffordably();
        paulCard.eatAffordably();
        mattCard.addMoney(50);
        System.out.println("Paul: The card has a balance of " + paulCard);
        System.out.println("Matt: The card has a balance of " + mattCard);

    }


    public static void printStatistics(int total, int even, int odd){
        System.out.println("Sum: " + total);
        System.out.println("Sum of even numbers: " + even);
        System.out.println("Sum of odd numbers: " + odd);
    }
}
