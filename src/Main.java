import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        //This is the main for the project and we'll call the other ones here.


        int roomChoice = 0;
        int quitChoice = 999;
        int mainForkCounter = 0;

        Scanner input = new Scanner(System.in);
        // Loop for the game to keep going until player enters 999
        do {

            System.out.println("If you want to quit at anytime please enter 999");
            quitChoice = input.nextInt();
            StartGame.displayStartGame(mainForkCounter);



            // Enter this to exit the game
        }while (quitChoice != 999);

    }
}
