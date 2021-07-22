import com.sun.media.sound.SF2InstrumentRegion;

public class Cowsay {
    private String name;
    private String image;

    private static void listCows(Cow[] cows) {
        System.out.print("Cows available:");

        // causes a for loop through array of cows
        for (Cow cow : cows) {
            System.out.print(" " + cow.getName());
        }
        System.out.println(" ");
    }

    private static Cow findCows(String name, Cow[] cows) {
        Cow cow = null;

        for (Cow cow_ : cows) {
            // when they have asked for a cow and it has been found
            if (cow_.getName().equals(name)) {
                cow = cow_;
                break;
            }
        }
        return cow;
    }

    public static void main(String[] args) {
        Cow[] cows_ = HeiferGenerator.getCows();

        // user is attempting to list cows
        if (args[0].equals("-l")) {
            listCows(cows_);
            System.out.println(" ");
        }
        else if (args[0].equals("-n")) {

            if (findCows(args[1], cows_) == null) {
                // searching for specific cow
                System.out.println("Could not find " + args[1] + " cow!");
                System.out.println(" ");
            } else {
                System.out.println(" ");
                for (int i = 2; i < args.length; i++) {
                    System.out.print(args[i] + " ");
                }
                System.out.println("HLELLO");
                if (findCows(args[1], cows_).getName().equals("dragon")) {
                    System.out.println("\n" + (findCows(args[1], cows_)).getImage() + " \n This dragon can breathe fire.");


                }
                else {
                    System.out.println("\n" + (findCows(args[1], cows_)).getImage() + " \n This dragon cannot breathe fire.");
                }
                System.out.println("\n" + (findCows(args[1], cows_)).getImage() + " ");

                System.out.println(findCows(args[1], cows_).getName());
                if ((findCows(args[1], cows_)).getName().equals("dragon")) {
                    System.out.println("This dragon can breathe fire. \n");
                }

                else {
                    System.out.println("This dragon cannot breathe fire. \n");
                }
            }
        }

        else {
                System.out.println(" ");
                for (String string : args) {
                    // prints string
                    System.out.print(string + " ");
                }
                System.out.print("\n" + (cows_[0]).getImage() + "\n");

        }
        }
    }
