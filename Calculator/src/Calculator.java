import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {


        Scanner scnr = new Scanner(System.in);

        /* asks for user's first operand. has to be a double to
           make sure the number is exact */
        System.out.println("Enter first operand: ");
        double firstOperand = scnr.nextDouble();

        // asks for user's second operand
        System.out.println("Enter second operand: ");
        double secondOperand = scnr.nextDouble();

        // calculator menu
        System.out.println("Calculator Menu");
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        // using the two operands, creates an operation
        System.out.println("Which operation do you want to perform?");
        int operation = scnr.nextInt();

        switch (operation) {
            // addition
            case 1:
                double addition = (firstOperand + secondOperand);
                System.out.println("The result of the operation is " + addition + ". Goodbye!");
                break;
            //  subtraction
            case 2:
                double subtraction = (firstOperand - secondOperand);
                System.out.println("The result of the operation is " + subtraction + ". Goodbye!");
                break;
            //  multiplication
            case 3:
                double multiplication = (firstOperand * secondOperand);
                System.out.println("The result of the operation is " + multiplication + ". Goodbye!");
                break;
            // perform division
            case 4:
               double division = (firstOperand / secondOperand);
                System.out.println("The result of the operation is " + division + ". Goodbye!");
                break;
            default:
                System.out.println("Error: Invalid selection! Terminating program.");
        }
    }
}
