import java.util.Scanner;
import java.lang.Math;

public class NumericConversion {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        String decimal;

        System.out.println("Decoding Menu");
        System.out.println("-------------");
        System.out.println("1. Decode hexadecimal");
        System.out.println("2. Decode binary");
        System.out.println("3. Convert binary to hexadecimal");
        System.out.println("4. Quit");
        System.out.println("Please enter an option: ");
        int option = scnr.nextInt();

        boolean menu = true;
        while (menu = true) {
            if (option == 1) {
                System.out.println("Please enter the numeric string to convert: ");
                String convert = scnr.next();
                long result = hexStringDecode(convert);
                System.out.println(result);
            } else if (option == 2) {
                System.out.println("Please enter the numeric string to convert: ");
                String convert = scnr.next();
                short result = binaryStringDecode(convert);
                System.out.println(result);
            } else if (option == 3) {
                System.out.println("Please enter the numeric string to convert: ");
                String convert = scnr.next();
                String result = binaryToHex(convert);
                System.out.println(result);
            } else if (option == 4) {
                System.out.println("Goodbye!");
                return;
            }
        }

    }


    // decode hex and return value
    public static long hexStringDecode(String hex) {
        // loop through entire string to decode each character
        hex = hex.toLowerCase();
        String intro = hex.substring(0,2);
        if (hex.substring(0,2).equals("0x")) {
            hex = hex.substring(2);
        }
        long result = 0;
        int exponent = hex.length() - 1;
        for (int i = 0; i < hex.length(); i++) {
            char character = hex.charAt(i);
            short digit = hexCharDecode(character);
            result += digit * Math.pow(16, exponent);
            // decrease exponent until 1's place
            exponent--;
        }
        return result;
    }

    // decode single hex digit and return value
        public static short hexCharDecode(char digit) {
            short result = 0;
            if (digit == 'a' || digit == 'A') {
                result = 10;
            } else if (digit == 'b' || digit == 'B') {
                result = 11;
            } else if (digit == 'c' || digit == 'C') {
                result = 12;
            } else if (digit == 'd' || digit == 'D') {
                result = 13;
            } else if (digit == 'e' || digit == 'E') {
                result = 14;
            } else if (digit == 'f' || digit == 'F') {
                result = 15;
            } else {
                result = (short) (digit - 48);
            }
            return result;
        }

        // decode binary and return value
        public static short binaryStringDecode(String binary) {
            char character;
            int exponent = binary.length() - 1;
            short result = 0;
            int digit = 0;
            for (int i = 0; i < binary.length(); i++)
            {
                character = binary.charAt(i);
                if(character == '0')
                    digit = 0;
                else if (character == '1')
                    digit = 1;
                result += digit * Math.pow(2,exponent);

                exponent--;
            }
            return result;
        }

        // decode binary, re encode as hex and return hex
        public static String binaryToHex (String binary) {
            String result = "";
            if (binary.substring(0,2).equals("0b")) {
                binary = binary.substring(2);
            }


            for(int i = 0; i < binary.length(); i += 4)
            {
                short temp = binaryStringDecode(binary.substring(i, i+4));

                if (temp == 10)
                    result += 'A';
                else if(temp == 11)
                    result += 'B';
                else if(temp == 12)
                    result += 'C';
                else if(temp == 13)
                    result += 'D';
                else if(temp == 14)
                    result += 'E';
                else if(temp == 15)
                    result += 'F';
                else
                {
                    result += temp;
                }
            }
            return result;
        }
}


