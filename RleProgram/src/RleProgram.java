import java.util.Arrays;
import java.util.Scanner;

public class RleProgram {
    public static void main(String[] args) {

        int options;
        boolean menu = true;
        Scanner scnr = new Scanner(System.in);

        while (menu) {
            // Menu
            System.out.println("Welcome to the RLE image encoder!");
            System.out.println("Displaying Spectrum Image:");
            System.out.println(Arrays.toString(ConsoleGfx.testRainbow));
            System.out.println("RLE Menu");
            System.out.println("--------");
            System.out.println("0. Exit");
            System.out.println("1. Load File");
            System.out.println("2. Load Test Image");
            System.out.println("3. Read RLE String");
            System.out.println("4. Read RLE Hex String");
            System.out.println("5. Read Data Hex String");
            System.out.println("6. Display Image");
            System.out.println("7. Display RLE String");
            System.out.println("8. Display Hex RLE Data");
            System.out.println("9. Display Hex Flat Data");
            System.out.println("Select a Menu Option: ");
            options = scnr.nextInt();

            switch (options) {
                case 0:
                    menu = false;
                    break;
                case 1:
                    System.out.println("Enter name of file to load: ");
                    String fileName = scnr.next();
                    ConsoleGfx.loadFile(fileName);
                    System.out.println(fileName);
                    break;
                case 2:
                    System.out.println(Arrays.toString(ConsoleGfx.testImage));
                    System.out.println("Test image data loaded.");
                    break;
                case 3:
                    // reads RLE data from user in decimal notation with delimiters
                    System.out.println("Enter an RLE string to be decoded: ");
                    byte[] string = scnr.next();
                    toHexString(string);
                    break;
                case 4:
                    // reads RLE data from user in hexadecimal notation without delimiters
                    System.out.println("Enter the hex string holding RLE data: ");
                    break;
                case 5:
                    // reads raw (flat) data from the user in hexadecimal notation
                    System.out.println("Enter the hex string holding flat data: ");
                    break;
                case 6:
                    ConsoleGfx.displayImage(byte[] imageData);
                    break;
                case 7:
                    // convert current data into human-readable RLE representation
                    System.out.println("RLE representation: ");
                    break;
                case 8:
                    // convert current data into RLE hexadecimal representation
                    System.out.println("RLE hex values: ");
                    break;
                case 9:
                    // display current raw (flat) data in hexadecimal representation
                    System.out.println("Flat hex values: ");
                    break;
                default:
                    System.out.println("Error! Invalid input.");
                    break;
            }
        }
    }


    public static String toHexString(byte[] data) {
        // translates data to a hexadecimal string
        String image;
        image = toHexString(new byte[]{3, 15, 6, 4});
        return image;
    }

    public static int countRuns(byte[] flatData) {
        // returns # of runs of data in an image data set
        String countRuns(new byte[]{15, 15, 15, 4, 4, 4, 4, 4, 4});
        int runs = 0;
        return runs;
    }

    public static byte[] encodeRle(byte[] flatData) {
        // returns encoding (in RLE) of the raw data passed on
        String encodeRle(new byte[]{15, 15, 15, 4, 4, 4, 4, 4, 4});
    }

    public static int getDecodedLength(byte[] rleData) {
        //return decompressed size RLE data
        String getDecodedLength(new byte[]{3, 15, 6, 4});
    }

    public static byte[] decodeRle(byte[] rleData) {
        // returns decoded data set from RLE encoded data
        String decodeRle(new byte[]{3, 15, 6, 4});
    }

    public static byte[] stringToData(String dataString) {
        // translates string in hexadecimal format into byte data
        String stringToData("3f64");
    }

    public static String toRleString(byte[] rleData) {
        // translates RLE data into human-readable rep.
       String toRleString(new byte[] {15, 15, 6, 4});
       return "string";
    }

    public static byte[] stringToRle(String rleString) {
        // translates string in human-readable RLE format into RLE byte data
        String stringToRle ("15f:64");
    }

}
