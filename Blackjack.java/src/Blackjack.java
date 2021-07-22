import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {

        /* this is the set code to call upon the random number generator.
           user rng throughout code to call upon the random numer generator
           and make sure that game is fair for user. */

        P1Random rng = new P1Random();
        // which game the user is on
        int num_of_Games = 0;
        // how many wins the user has
        int num_of_Wins = 0;
        // how many wins the dealer has
        int dealerWins = 0;
        // how many games are tied
        int tiedGames = 0;
        // is user still in the game?
        boolean still_in_Game = true;
        // pulls up the menu
        boolean menu = true;
        // how much value the hand has at that given point
        int handValue = 0;
        // card's value
        int value_on_Card;
        // how much value the dealer has at that given point
        int dealersHand;
        // switches between different dealing scenarios
        int dealt;

        /* defining scanner as userInput to signify that scanner's purpose
           is for user input. That way it is easy reminder for anyone
           reading this code that this is what it is striving to do. */

        Scanner userInput = new Scanner(System.in);

        /* percentage of wins has to be a double so that the numbers
           print out as decimal numbers. */

        double percentage_of_Wins = 0;

        // for loop continues as long as the user is still playing the game
        while (still_in_Game) {

            // everything the for loop restarts, the table of total games increases
            num_of_Games = num_of_Games++;
            System.out.println("START GAME # " + num_of_Games);

            // calls upon random number generator to produce the card value
            value_on_Card = rng.nextInt(13)+1;

            // run different case scenarios based on different card values
            if (value_on_Card == 1) {
                System.out.println("Your card is a ACE!");
            }
            else if (value_on_Card == 11) {
                System.out.println("Your card is a JACK!");
            }
            else if (value_on_Card == 12) {
                System.out.println("Your card is a QUEEN!");
            }
            else if (value_on_Card == 13) {
                System.out.println("Your card is a KING!");
            }
            else {
                System.out.println("Your card is a " + value_on_Card + "!");
            }
            handValue = handValue + value_on_Card;
            System.out.println("Your hand is: " + handValue);

            // game has ended; for loop ends as well
            still_in_Game = false;
        }

        while(menu) {

            // Pulls up menu so that when user has options to choose from
            System.out.println(" ");
            System.out.println("1. Get another card");
            System.out.println("2. Hold hand");
            System.out.println("3. Print statistics");
            System.out.println("4. Exit");
            System.out.println(" ");
            System.out.println("Choose an option: ");

            /* calls upon scanner to allow for user input. based on
                what the user chooses from the menu, pulls up a
                specific case from the switch dealt statement. */

            dealt = userInput.nextInt();

            switch (dealt) {
                case 1:
                    /* card value utilizes random number generator so
                        that everytime user picks this case it'll give
                        them a different number and game is fair */
                    value_on_Card = rng.nextInt(13) + 1;

                    // value of Ace is a 1
                    if (value_on_Card == 1) {
                        System.out.println("Your card is a ACE!");
                    }
                    else if (value_on_Card == 11) {
                        System.out.println("Your card is a JACK!");
                        value_on_Card = 10;
                    }
                    else if (value_on_Card == 12) {
                        System.out.println("Your card is a QUEEN!");
                        value_on_Card = 10;
                    }
                    else if (value_on_Card == 13) {
                        System.out.println("Your card is a KING!");
                        value_on_Card = 10;
                    }
                    else {
                        System.out.println("Your card is a " + value_on_Card + "!");
                    }
                    handValue = handValue + value_on_Card;
                    System.out.println("Your hand is: " + handValue);

                    /* user will win if the hand value is 21 because that is the
                       winning hand */

                    if (handValue == 21) {
                        num_of_Wins = num_of_Wins++;
                        System.out.println("BLACKJACK! You win!");
                        num_of_Games = num_of_Games++;
                        System.out.println("START GAME # " + num_of_Games);
                        value_on_Card = rng.nextInt(13)+1;
                        if (value_on_Card == 1) {
                            System.out.println("Your card is a ACE!");
                        }
                        else if (value_on_Card == 11) {
                            System.out.println("Your card is a JACK!");
                            value_on_Card = 10;
                        }
                        else if (value_on_Card == 12) {
                            System.out.println("Your card is a QUEEN!");
                            value_on_Card = 10;
                        }
                        else if (value_on_Card == 13) {
                            System.out.println("Your card is a KING!");
                            value_on_Card = 10;
                        }
                        else {
                            System.out.println("Your card is a " + value_on_Card + "!");
                        }
                        handValue = value_on_Card;
                        System.out.println("Your hand is: " + handValue);

                    }
                    // user will lose and dealer will win if the user's hand value is over 21
                    else if (handValue > 21) {
                        dealerWins = dealerWins++;
                        System.out.println("You exceeded 21! You lose.");
                        num_of_Games = num_of_Games++;
                        System.out.println("START GAME # " + (num_of_Games));
                        value_on_Card = rng.nextInt(13)+1;
                        if (value_on_Card == 1) {
                            System.out.println("Your card is a ACE!");
                        }
                        else if (value_on_Card == 11) {
                            System.out.println("Your card is a JACK!");
                            value_on_Card = 10;
                        }
                        else if (value_on_Card == 12) {
                            System.out.println("Your card is a QUEEN!");
                            value_on_Card = 10;
                        }
                        else if (value_on_Card == 13) {
                            System.out.println("Your card is a KING!");
                            value_on_Card = 10;
                        }
                        else {
                            System.out.println("Your card is a " + value_on_Card + "!");
                        }
                        handValue = value_on_Card;
                        System.out.println("Your hand is: " + handValue);
                    }
                    break;
                case 2:
                    dealersHand = rng.nextInt(11) + 16;
                    // scenario for player winning
                    if (handValue == 21) {
                        num_of_Wins = num_of_Wins++;
                        System.out.println("Dealer's hand: " + dealersHand);
                        System.out.println("Your hand is: " + handValue);
                        System.out.println("BLACKJACK! You win!");
                        num_of_Games = num_of_Games++;
                    }
                    // scenario in the case that the user scores higher than the dealer
                    else if (handValue > dealersHand) {
                        System.out.println("Dealer's hand: " + dealersHand);
                        System.out.println("Your hand is: " + handValue);
                        num_of_Wins = num_of_Wins++;
                        System.out.println("You win!");
                        num_of_Games = num_of_Games++;

                    }
                    // scenario for if the user exceeds the total score
                    else if (handValue > 21) {
                        dealerWins = dealerWins++;
                        System.out.println("Dealer's hand: " + dealersHand);
                        System.out.println("Your hand is: " + handValue);
                        System.out.println("You exceeded 21! You lose.");
                        num_of_Games = num_of_Games++;

                    }
                    // scenario for if the dealer exceeds the total score
                    else if (dealersHand > 21) {
                        num_of_Wins = num_of_Wins++;
                        System.out.println("Dealer's hand: " + dealersHand);
                        System.out.println("Your hand is: " + handValue);
                        System.out.println("You win!");
                        num_of_Games = num_of_Games++;

                    }
                    // scenario for if the dealer wins because they score exact total score
                    else if (dealersHand == 21) {
                        System.out.println("Dealer's hand: " + dealersHand);
                        System.out.println("Your hand is: " + handValue);
                        dealerWins = dealerWins++;
                        System.out.println("Dealer wins!");
                        num_of_Games = num_of_Games++;

                    }
                    // scenario for a tie between user and dealer
                    else if (handValue == dealersHand) {
                        tiedGames = tiedGames++;
                        System.out.println("Dealer's hand: " + dealersHand);
                        System.out.println("Your hand is: " + handValue);
                        System.out.println("It's a tie! No one wins!");
                        num_of_Games = num_of_Games++;

                    }
                    // in all other scenarios, dealer wins
                    else {
                        System.out.println("Dealer's hand: " + dealersHand);
                        System.out.println("Your hand is: " + handValue);
                        System.out.println("Dealer wins!");
                        num_of_Games = num_of_Games++;
                        dealerWins = dealerWins++;

                    }
                    // scenario for a new game starting
                    System.out.println("START GAME # " + (num_of_Games));
                    value_on_Card = rng.nextInt(13)+1;
                    if (value_on_Card == 1) {
                        System.out.println("Your card is a ACE!");
                    }
                    else if (value_on_Card == 11) {
                        System.out.println("Your card is a JACK!");
                        value_on_Card = 10;
                    }
                    else if (value_on_Card == 12) {
                        System.out.println("Your card is a QUEEN!");
                        value_on_Card = 10;
                    }
                    else if (value_on_Card == 13) {
                        System.out.println("Your card is a KING!");
                        value_on_Card = 10;
                    }
                    else {
                        System.out.println("Your card is a " + value_on_Card + "!");
                    }
                    handValue = value_on_Card;
                    System.out.println("Your hand is: " + handValue);
                    break;
                // this is so that user can check totals of the games thus far
                case 3:
                    System.out.println("Number of Player wins: " + num_of_Wins);
                    System.out.println("Number of Dealer wins: " + dealerWins);
                    System.out.println("Number of tie games: " + tiedGames);
                    // mathematical equation to calculate = percentage of wins
                    System.out.println("Total # of games played is: " + (num_of_Games - 1));
                    if(num_of_Wins == 0){
                        percentage_of_Wins = 0;
                    }
                    else {
                        percentage_of_Wins = (double) num_of_Wins / (num_of_Games - 1) * 100;
                    }
                    System.out.println("Percentage of Player wins: " + percentage_of_Wins + "%");
                    break;
                case 4:
                    // exit the game
                    System.exit(0);
                    break;
                default:
                    // scenario is input is invalid
                    System.out.println("Invalid input!");
                    System.out.println("Please enter an integer value between 1 and 4.");
            }
        }

    }

}

