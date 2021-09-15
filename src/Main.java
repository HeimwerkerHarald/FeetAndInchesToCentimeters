import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert quantity of feet.");
        double userInputFeet = scanner.nextDouble();
        System.out.println("Now enter the quantity of inches to calculate.");
        double userInputInches = scanner.nextDouble();
        double centimeters = calcFeetAndInchesToCentimeter(userInputFeet, userInputInches);
        if (centimeters < 0.0) {
            System.err.println("Invalid parameters.");
            System.err.println("Please Check that your Input is valid and that you only have positive Numbers.");
        }
        calcFeetAndInchesToCentimeter(userInputInches);

    }

    public static double calcFeetAndInchesToCentimeter(double feet, double inches) {
        if ((feet < 0) || (inches < 0) || (inches > 12)) {
            return -1;
        } else {
            double centimetres = (feet * 12) * 2.54;
            centimetres += inches * 2.54;
            double meters = (centimetres / 100);
            System.out.println(feet + " feet," + inches + " inches = " + centimetres + "cm or " + meters + "m");
            return (int) centimetres;
        }
    }

    public static double calcFeetAndInchesToCentimeter(double inches) {
        if (inches < 0) {
            System.err.println("Oops something went wrong, please Contact the User Support.");
            return -1;
        } else {
            double feet = inches / 12;
            double remainingInches = (int) inches % 12;
            System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
            return calcFeetAndInchesToCentimeter(feet, remainingInches);

        }
    }
}
