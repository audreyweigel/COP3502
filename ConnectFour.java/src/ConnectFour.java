import java.util.Scanner;

public class ConnectFour {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        // player 1 is x
        char firstPlayer = 'x';
        // player 2 is o
        char secondPlayer = 'o';
        boolean gameDone = false;
        int numGames = 0;

        // intro message
        System.out.print("What would you like the height of the board to be? ");
        int boardHeight = scnr.nextInt();
        System.out.print("What would you like the length of the board to be? ");
        int boardLength = scnr.nextInt();

        // initializing board game
        char boardGame[][] = new char[boardHeight][boardLength];
        initializeBoard(boardGame);
        printBoard(boardGame);

        System.out.println("Player 1: x");
        System.out.println("Player 2: o");
        // first row is 0
        int secondRow = 0;
        int firstRow = 0;

        // in a loop as long as no one was won/lost the game
        while (true) {
            System.out.println("Player 1: Which column would you like to choose?");
            int columnDecision = scnr.nextInt();

            // error message
            if (columnDecision < 0 || columnDecision >= boardHeight) {
                System.out.println("Please enter choice between 0 and " + (boardHeight - 1));
            }

            // inserting chip based on user input
            firstRow = insertChip(boardGame, columnDecision, firstPlayer);
            printBoard(boardGame);
            gameDone = checkIfWinner(boardGame, columnDecision, firstRow, firstPlayer);
            if (gameDone) {
                System.out.println("Player 1 won the game!");
                numGames = numGames + 1;
                break;
            }
            System.out.println("Player 2: Which column would you like to choose?");
            columnDecision = scnr.nextInt();
            secondRow = insertChip(boardGame, columnDecision, secondPlayer);
            printBoard(boardGame);

            // seeing who is the winner of the game
            gameDone = checkIfWinner(boardGame, columnDecision, secondRow, secondPlayer);
            if (gameDone) {
                System.out.println("Player 2 won the game!");
                numGames = numGames + 1;
                break;
            }
            if (numGames == boardHeight * boardLength) {
                System.out.println("Draw. Nobody wins.");
                break;
            }

        }

    }

    // method to print the board
    public static void printBoard(char[][] array) {
        for (int h = array.length - 1; h >= 0; h--) {
            for (int l = 0; l < array[h].length; l++) {
                System.out.print(array[h][l] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }

    // method that sets each spot in the array to "-"
    public static void initializeBoard(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = '-';
            }
        }
    }


    // method to insert the user's selected chip into the spot
    public static int insertChip(char[][] array, int col, char chipType) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][col] == '-') {
                    array[i][col] = chipType;
                    return i;
                }
            }
        }
        return -1;
    }


    // method to check who is the winner
    public static boolean checkIfWinner(char[][] array, int col, int row, char chipType) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i][col] == chipType) {
                count = count + 1;
                if (count == 4) {
                    return true;
                }
            } else {
                count = 0;
            }
        }
        count = 0;

        for (int j = 0; j < array[0].length; j++) {
            if (array[row][j] == chipType) {
                count = count + 1;
                if (count == 4) {
                    return true;
                }
            } else {
                count = 0;
            }
        }
        return false;
    }
}
