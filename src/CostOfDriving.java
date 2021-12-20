import java.util.Scanner;

public class CostOfDriving {
    public static void main(String[] args) {
        double distance;
        double miles_gallon;
        double price_gallon;
        double cost_of_driving;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the drive distance: ");
        distance = userInput.nextDouble();
        System.out.println("Enter the miles per gallon: ");
        miles_gallon = userInput.nextDouble();
        System.out.println("Enter the price per gallon: ");
        price_gallon = userInput.nextDouble();

        cost_of_driving = distance/miles_gallon * price_gallon;

        System.out.println("The cost of driving is: " + cost_of_driving + "$");

    }
}
