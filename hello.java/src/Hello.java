import java.util.Scanner;

public class Hello {
    public static void main(String [] args) {

        // implement scanner to allow user input and output

        Scanner scnr = new Scanner(System.in);

        System.out.println("Hello. What is your name?");
        // reads user input as string, stops at whitespace
        String name = scnr.next();

        System.out.println("It's nice to meet you, " + name + ". How old are you?");
        // has to be string to allow written out numbers and integer numbers
        String age = scnr.next();

        System.out.println("I see that you are still quite young at only " + age + ".");


        System.out.println("Where do you live?");
        String location = scnr.next();

        System.out.println("Wow! I've always wanted to go to " + location + ". Thanks for chatting with me. Bye!");

    }
}