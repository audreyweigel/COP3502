import java.util.Scanner;
import java.util.LinkedList;

public class PakuriProgram {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        boolean menu = true;
        int speciesNum = 0;
        int options = 0;
        int maxCapacity = 0;
        String newSpecies;
        Pakudex newPakudex;

        // display welcome message
        System.out.println("Welcome to Pakudex: Tracker Extraordinaire!");

        boolean noError = true;
        do {
            try {
                System.out.print("Enter max capacity of the Pakudex: ");
                maxCapacity = scnr.nextInt();
                if (maxCapacity < 0) {
                    throw new Exception();
                }
                break;
            }
            catch (Exception e) {
                System.out.println("Please enter a valid size.");
                scnr.nextLine();
                scnr.reset();
            }
        } while (noError);


        System.out.println("The Pakudex can hold " + maxCapacity + " species of Pakuri.");
        System.out.println(" ");

        newPakudex = new Pakudex(maxCapacity);

        while (menu == true) {
            // display the menu
            System.out.println("Pakudex Main Menu");
            System.out.println("-----------------");
            System.out.println("1. List Pakuri");
            System.out.println("2. Show Pakuri");
            System.out.println("3. Add Pakuri");
            System.out.println("4. Evolve Pakuri");
            System.out.println("5. Sort Pakuri");
            System.out.println("6. Exit");
            System.out.println(" ");

            try {
                System.out.print("What would you like to do? ");
                options = scnr.nextInt();
            }
            catch (Exception t){
                System.out.println("Unrecognized menu selection!");
                System.out.println("");
                scnr.nextLine();
                continue;
            }


            switch (options) {
                case 1:
                    // created a list
                    // if there are no items yet
                    if (newPakudex.getSize() == 0) {
                        System.out.println("No Pakuri in Pakudex yet!");
                        System.out.println("");
                    }
                    else {
                        String[] namesofPakuri = newPakudex.getSpeciesArray();
                        // print out list step by step
                        System.out.println("Pakuri In Pakudex:");
                        for (int i = 0; i < namesofPakuri.length; i++){
                            System.out.print((i+1) + ". ");
                            System.out.println(namesofPakuri[i]);
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    // check to see if there is pakuri
                    {
                    System.out.print("Enter the name of the species to display: ");
                    newSpecies = scnr.next();

                    int[] newSpeciesStats;
                    newSpeciesStats = newPakudex.getStats(newSpecies);

                    if (newSpeciesStats == null) {
                      System.out.println("Error: No such Pakuri!");
                      System.out.println("");
                      break;
                    }

                    else if (newSpeciesStats != null) {
                        System.out.println("");
                        System.out.println("Species: " + newSpecies);
                        System.out.println("Attack: " + newSpeciesStats[0]);
                        System.out.println("Defense: " + newSpeciesStats[1]);
                        System.out.println("Speed: " + newSpeciesStats[2]);
                        System.out.println("");
                    }


                    }
                    break;
                case 3:
                    // if you have not reached limit
                    int sizeofPakudex = newPakudex.getSize();

                    if (sizeofPakudex < maxCapacity) {
                        System.out.print("Enter the name of the species to add: ");
                        newSpecies = scnr.next();
                        boolean speciesChecker = newPakudex.addPakuri(newSpecies);
                        if (speciesChecker) {
                        System.out.println("Pakuri species " + newSpecies + " successfully added!");
                        System.out.println("");
                        }

                        else {
                        System.out.println("Error: Pakudex already contains contains this species!");
                        }
                    }
                    else {
                        System.out.println("Error: Pakudex is full!");
                        System.out.println("");
                    }
                    break;
                case 4:
                    System.out.print("Enter the name of the species to evolve: ");
                    // double check if pakuri exists
                    newSpecies = scnr.next();

                    if (newPakudex.evolveSpecies(newSpecies)) {
                    System.out.println(newSpecies + " has evolved!");
                    }

                    else {
                    System.out.println("Error: No such Pakuri!");
                    }

                    break;
                case 5:
                    // organize based on name
                    newPakudex.sortPakuri();
                    System.out.println("Pakuri have been sorted!");
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("Thanks for using Pakudex! Bye!");
                    menu = false;
                    break;
                default:
                    System.out.println("Unrecognized menu selection!");
                    System.out.println("");
                    break;
            }

        }
    }
}
