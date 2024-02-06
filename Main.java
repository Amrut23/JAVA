import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Input input = new Input();
        Scanner scn = new Scanner(System.in);

        boolean exit = false;

        while (!exit) {
            System.out.println("Choose an option:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Array Operation");
            System.out.println("6. Exit");

            int choice = scn.nextInt();

            switch (choice) {
                case 1:
                    performBinaryOperation(calculator, input, '+');
                    break;

                case 2:
                    performBinaryOperation(calculator, input, '-');
                    break;

                case 3:
                    performBinaryOperation(calculator, input, '*');
                    break;

                case 4:
                    performBinaryOperation(calculator, input, '/');
                    break;

                case 5:
                    performArrayOperation(calculator, input);
                    break;

                case 6:
                    exit = true;
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }

        scn.close(); // Close the scanner when you are done using it.
    }

    private static void performBinaryOperation(Calculator calculator, Input input, char operator) {
        double[] numbers = input.inputNumbers();
        double firstNumber = numbers[0];
        double secondNumber = numbers[1];

        switch (operator) {
            case '+':
                System.out.println("The Addition of " + firstNumber + " and " + secondNumber + " is " + calculator.addition(firstNumber, secondNumber));
                break;

            case '-':
                System.out.println("The Subtraction of " + firstNumber + " and " + secondNumber + " is " + calculator.subtraction(firstNumber, secondNumber));
                break;

            case '*':
                System.out.println("The Multiplication of " + firstNumber + " and " + secondNumber + " is " + calculator.multiplication(firstNumber, secondNumber));
                break;

            case '/':
                System.out.println("The Division of " + firstNumber + " and " + secondNumber + " is " + calculator.division(firstNumber, secondNumber));
                break;

            default:
                System.out.println("Invalid operation");
                break;
        }
    }

    private static void performArrayOperation(Calculator calculator, Input input) {
        double[] arr = input.getArrayInput();

        System.out.println("Choose an array operation:");
        System.out.println("1. Variance");
        System.out.println("2. Standard Deviation");
        System.out.println("3. Average");

        Scanner scn = new Scanner(System.in);
        int arrayOperationChoice = scn.nextInt();

        switch (arrayOperationChoice) {
            case 1:
                System.out.println("Variance: " + calculator.varianceOfArray(arr));
                break;

            case 2:
                System.out.println("Standard Deviation: " + calculator.standardDeviationOfArray(arr));
                break;

            case 3:
                System.out.println("Average: " + calculator.calculateMean(arr));
                break;

            default:
                System.out.println("Invalid array operation");
                break;
        }
    }
}
