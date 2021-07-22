import java.util.Scanner;

public class SciCalculator {
    public static void main(String [] args) {

    Scanner input = new Scanner(System.in);
    // this is the section where i define some primary variables in the program
    int menu = 0;
    boolean gameOn = true;
    double nowResult = 0.0;
    // how many rounds the calculator has done
    int roundNum = 0;

        /* there is a while loop to ensure that the calculator continues
           as long as the user is utilizing it     */
        while (gameOn) {
        System.out.println("Current Result: " + nowResult);
        System.out.println(" ");
        System.out.println("Calculator Menu");
        System.out.println("---------------");
        System.out.println("0. Exit Program");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exponentiation");
        System.out.println("6. Logarithm");
        System.out.println("7. Display Average");
        System.out.println(" ");

        System.out.println("Enter Menu Selection: ");

        /* menuOption has to utilize scanner so that user can input
           the calculation they are interested in finding */
        int menuOption = input.nextInt();

            /* there is a switch statement for each menu option so that
               the calculator can sift through and give a different result
               for whichever option the user chose */
            switch (menuOption) {
                /* if the user chooses an option that is not within the
                    boundaries of the menu options */
                default:
                    System.out.println("Error: Invalid selection!");
                    break;
                case 0:
                    /* this is in the case that the user wants to exit
                    the program */
                    System.out.println("Thanks for using this calculator. Goodbye!");
                    System.exit(0);
                    // the program will automatically terminate
                    gameOn = false;
                    break;
                case 1:
                    // the program for addition
                    System.out.println("Enter first operand: ");
                    /* values must be double so that the calculator gives
                       exact answers */
                    double firstOperand = input.nextDouble();
                    System.out.println("Enter second operand: ");
                    double secondOperand = input.nextDouble();
                    double addition = firstOperand + secondOperand;
                    nowResult = nowResult + addition;
                    // a round is added so that the calculator updates itself
                    roundNum++;
                    break;

                case 2:
                    // the program for subtraction
                    System.out.println("Enter first operand: ");
                    double firsOperand = input.nextDouble();
                    System.out.println("Enter second operand: ");
                    double seconOperand = input.nextDouble();
                    double subtraction = firsOperand - seconOperand;
                    nowResult = nowResult + subtraction;
                    roundNum++;
                    break;

                case 3:
                    // the program for multiplication
                    System.out.println("Enter first operand: ");
                    double firOperand = input.nextDouble();
                    System.out.println("Enter second operand: ");
                    double secoOperand = input.nextDouble();
                    double multiplication = firOperand * secoOperand;
                    nowResult = nowResult + multiplication;
                    roundNum++;
                    break;

                case 4:
                    // the program for division
                    System.out.println("Enter first operand: ");
                    double fiOperand = input.nextDouble();
                    System.out.println("Enter second operand: ");
                    double secOperand = input.nextDouble();
                    double division = fiOperand / secOperand;
                    nowResult = nowResult + division;
                    roundNum++;
                    break;

                case 5:
                    // the program for exponent
                    System.out.println("Enter first operand: ");
                    double fOperand = input.nextDouble();
                    System.out.println("Enter second operand: ");
                    double seOperand = input.nextDouble();
                    double exponent = Math.pow(fOperand, seOperand);
                    nowResult = nowResult + exponent;
                    roundNum++;
                    break;

                case 6:
                    // the program to calculate logarithms
                    System.out.println("Enter first operand: ");
                    double ffOperand = input.nextDouble();
                    System.out.println("Enter second operand: ");
                    double sOperand = input.nextDouble();
                    // this is the mathematical operations for logs
                    double logarithm = Math.log(ffOperand) / Math.log(sOperand);
                    nowResult = nowResult + logarithm;
                    roundNum++;
                    break;

                case 7:
                    // calculate the average
                    // cannot be calculated if there have not been any rounds
                    if (roundNum == 0) {
                        System.out.println("Error: No calculations yet to average!");
                }
                    else {
                        System.out.println("Sum of calculations: " + nowResult);
                        System.out.println("Number of calculations: " + roundNum);
                        // program to calculate average
                        System.out.println("Average of calculations: " + String.format("%.2f, (currentResult / rounds)"));
                        break;
                    }
            }
    }
    }
    }
