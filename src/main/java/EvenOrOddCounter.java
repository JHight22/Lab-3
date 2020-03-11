
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jared
 */
public class EvenOrOddCounter {

    public static void main(String[] args) {

        Random randomNumber = new Random();
        int randomNumberGenerated;
        int numberOfEvenNumbers = 0;
        int numberOfOddNumbers = 0;

        for (int i = 1; i <= 100; i++) {
            randomNumberGenerated = randomNumber.nextInt();
            if (isEven(randomNumberGenerated)) {
                numberOfEvenNumbers += 1;
            } else {
                numberOfOddNumbers += 1;
            }
        }

        System.out.println("The number of even numbers generated: " + numberOfEvenNumbers);
        System.out.println("The number of odd numbers generated: " + numberOfOddNumbers);
    }

    public static boolean isEven(int evenOrOddDetermination) {
        if ((evenOrOddDetermination % 2) == 0) {
            return true;
        } else {
            return false;
        }

    }
}
