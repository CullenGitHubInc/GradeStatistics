import java.util.Scanner;

public class GradeStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] grades = new double[10];
        double sum = 0.0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        System.out.println("Enter 10 grades:");

        // Loop to read 10 grades
        for (int i = 0; i < 10; i++) {
            while (true) {
                System.out.print("Enter grade " + (i + 1) + ": ");
                
                if (scanner.hasNextDouble()) { // Check for valid input
                    grades[i] = scanner.nextDouble();
                    sum += grades[i]; // Add to sum

                    // Update max and min
                    if (grades[i] > max) {
                        max = grades[i];
                    }
                    if (grades[i] < min) {
                        min = grades[i];
                    }
                    
                    break; // Exit loop if valid input
                } else {
                    System.out.println("Invalid input. Please enter a valid floating-point number.");
                    scanner.next();

                }
            }
        }

        // Calculate and print statistics
        double average = sum / 10;

        System.out.printf("Average grade: %.2f%n", average);
        System.out.printf("Maximum grade: %.2f%n", max);
        System.out.printf("Minimum grade: %.2f%n", min);

        scanner.close(); // Close the scanner
    }
}
