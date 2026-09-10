import java.util.Scanner;

// Step 1: Other method which have only calculations method
class MathOperations {
    public double add(double a, double b) {
        return a + b;
    }
    public double subtract(double a, double b) {
        return a - b;
    }
    public double multiply(double a, double b) {
        return a * b;
    }
    public double divide(double a, double b) {
        return a / b;
    }
}

// Step 2: Main class where project Run
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create MathOperations class (OOP Concept)
        MathOperations math = new MathOperations();

        boolean keepRunning = true; // for control loop

        System.out.println("=====================================");
        System.out.println("   Welcome to Java Calculator App    ");
        System.out.println("=====================================");

        // This code run till keepRunning 'true'
        while (keepRunning) {
            System.out.println("\nMain Menu:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit ");
            System.out.print("\nEnter your choice (1-5): ");

            int choice = scanner.nextInt();

            // If user want to Exit
            if (choice == 5) {
                System.out.println("Calculator closing. Goodbye!");
                keepRunning = false;
                continue; // Loop ke end me bhej dega, aur loop band ho jayega
            }

            // If user choose the wrong option
            if (choice < 1 || choice > 5) {
                System.out.println("Invalid choice!");
                continue;
            }

            // Valid choice hone par numbers input lena
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            System.out.println("-------------------------------------");

            // User ki choice ke hisaab se math object ke methods call karna
            switch (choice) {
                case 1:
                    System.out.println("Result: " + math.add(num1, num2));
                    break;
                case 2:
                    System.out.println("Result: " + math.subtract(num1, num2));
                    break;
                case 3:
                    System.out.println("Result: " + math.multiply(num1, num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("Result: " + math.divide(num1, num2));
                    } else {
                        System.out.println("Error: Zero (0) se divide nahi kar sakte!");
                    }
                    break;
            }
            System.out.println("-------------------------------------");
        }

        scanner.close();
    }
}
