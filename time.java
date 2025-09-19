import java.util.Scanner;

public class TemperatureConverter {
    private static long startTime;
    private static long endTime;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Temperature Converter");
        System.out.println("Enter temperature value: ");
        double temperature = scanner.nextDouble();
        
        System.out.println("Enter the conversion type (1: Celsius to Fahrenheit, 2: Fahrenheit to Celsius): ");
        int choice = scanner.nextInt();
        
        startTimer();
        
        if (choice == 1) {
            double fahrenheit = celsiusToFahrenheit(temperature);
            System.out.println(temperature + " Celsius is " + fahrenheit + " Fahrenheit");
        } else if (choice == 2) {
            double celsius = fahrenheitToCelsius(temperature);
            System.out.println(temperature + " Fahrenheit is " + celsius + " Celsius");
        } else {
            System.out.println("Invalid choice!");
        }
        
        stopTimer();
        printElapsedTime();
    }

    // Convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    // Start the timer
    public static void startTimer() {
        startTime = System.currentTimeMillis();
    }

    // Stop the timer
    public static void stopTimer() {
        endTime = System.currentTimeMillis();
    }

    // Print elapsed time
    public static void printElapsedTime() {
        long elapsedTime = endTime - startTime;
        System.out.println("Time taken for conversion: " + elapsedTime + " milliseconds");
    }
}
