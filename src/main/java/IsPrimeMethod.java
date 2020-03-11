
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jared
 */
public class IsPrimeMethod {

    public static void main(String[] args) {

        System.out.println("Please enter a whole number");

        Scanner keyboard = new Scanner(System.in);

        int outputToConsole = isPrime(keyboard.nextInt());

    }
/**
 * 
 * @param booleanValueToDisplay calculating whether the whole number entered by the user is a prime number or not
 * @return the boolean value (true or false) of the whole number entered by the user
 */
    public static int isPrime(int booleanValueToDisplay) {

        for (int i = 2; i <= booleanValueToDisplay / 2; ++i) {
            if (booleanValueToDisplay % i != 1) {
                System.out.println("False, that is not a prime number");
            } else {
                System.out.println("True, that is a prime number");
            }
            break;
        }
        return booleanValueToDisplay;
    }
}
