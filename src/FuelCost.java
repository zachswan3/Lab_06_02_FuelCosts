import java.util.Scanner;

public class FuelCost {
    public static void main(String[] args) {
        //Write a program that asks the user to input
        //•	The number of gallons of gas in the tank
        //•	The fuel efficiency in miles per gallon
        //•	The price of gas per gallon
        //Then print the cost per 100 miles and how far the car can go with the gas in the tank.  Again, check for valid
        // input and exit with an error msg if you do not have it. Testing: here just use some reasonable values that
        // you can inspect the calculations and determine they are correct.  Be sure to check of integer calculations
        // truncating the results.

        double  price = 0;
        double  gallons = 0;
        double fuelEfficiency = 0;
        Scanner scanner = new Scanner(System.in);
        double  per100Miles = 0;
        double  distance = 0;
        String trash;

        System.out.println("Please enter the number of gallons in your tank.");
        if (scanner.hasNextDouble()){
            gallons = scanner.nextDouble();
            scanner.nextLine();
        }
        else {
            trash = scanner.nextLine();
            System.out.println("The value you have entered is invalid, please try again. " + trash);
            System.exit(0);
        }

        System.out.println("Please enter your fuel efficiency in miles per gallon.");
        if (scanner.hasNextDouble()){
            fuelEfficiency = scanner.nextDouble();
            scanner.nextLine();
        }
        else {
            trash = scanner.nextLine();
            System.out.println("The value you have entered is invalid, please try again. " + trash);
            System.exit(0);
        }

        System.out.println("Please enter the cost of gas per gallon.");
        if (scanner.hasNextDouble()) {
            price = scanner.nextDouble();
            scanner.nextLine();
        }
        else {
            trash = scanner.nextLine();
            System.out.println("The value you have entered is invalid, please try again. " + trash);
            System.exit(0);
        }
        per100Miles = 100/gallons * price;
        System.out.println("Your cost per 100 miles is " + per100Miles);

        distance = gallons * fuelEfficiency;
        System.out.println("You can travel " + distance + " miles.");

    }
}
