import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        System.out.println("Some examples follow of factorial recursion ");
        System.out.println("Iterative of 12: " + iterative(12));
        System.out.println("PureRecursive of 12: " + pureRecursive(12));
        System.out.println("TailRecursive of 12: " + tailRecursive(12));
        System.out.println("Iterative of 5: " + iterative(5));
        System.out.println("PureRecursive of 5: " + pureRecursive(5));
        System.out.println("TailRecursive of 5: " + tailRecursive(5));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a number to be recursed. ");
        int input = scanner.nextInt();

        try {
            System.out.println("Iterative of " + input + " : " + iterative(input));
        }

        catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("PureRecursive of " + input + " : " + pureRecursive(input));
        }

        catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("TailRecursive of " + input + " : " + tailRecursive(input));
        }

        catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }

    public static Long pureRecursive(int n) throws IllegalArgumentException {
        if (n <= 0) {
        return (long) 1;
        //throw new IllegalArgumentException("Bad input. n must be greater than 0");
            }
        return (long) n * pureRecursive(n-1);
    }

    public static Long tailRecursive(int n) {
        return (long) tail(n,1);
    }

    private static Long tail(int n, int result) throws IllegalArgumentException {
        if (n <= 0) {
        return (long) result;
    //throw new IllegalArgumentException("Bad input. n must be greater than 0");
        }

    //tail recursive means recursive call is last thing executed by the function
    return (long) tail(n-1, n * result);
    }

    public static Long iterative(int n) throws IllegalArgumentException {
        long factorial = 1;
        if(n <= 0) {
            throw new IllegalArgumentException("Bad input. n must be greater than 0");
        }

        for(int i = 1; i <= n; i++) {
            factorial = factorial * i;
    }

        return factorial;

    }


    }