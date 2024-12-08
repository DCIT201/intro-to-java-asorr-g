//Import the Scanner class for user input
import java.util.Scanner;

public class TemperatureConverter{
    public static void main(String[] args) {

        //Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        //Display the program title and options to the user
        System.out.println("Temperature Converter");
        System.out.print("Choose an option: ");
        System.out.print("1.Convert Celsius to Fahrenheit ");
        System.out.print("2.Convert Fahrenheit to Celsius");

        //Read the choice of the user
        int choice = scanner.nextInt();

        if (choice == 1) {

            //Prompt the user to enter the temperature in Celsius and perform conversion
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.printf("%.2f", fahrenheit);}
        else if (choice == 2) {

            //Prompt the user to enter the temperature in Fahrenheit and perform conversion
            System.out.print("Enter temperature in Fahrenheit ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9;

            //Display the result
            System.out.printf("%.2f", celsius);
        }
        else {
            System.out.println("Invalid option. Please select one or two");

        }

        //close the scanner to prevent resource leaks
scanner.close();
    }
}

