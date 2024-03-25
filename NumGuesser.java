import java.util.Random;
import java.util.Scanner;

public class NumGuesser {

    int correctNum;
    int plyGuess;
    int noOfGuesses = 2;

    Scanner sc = new Scanner(System.in);
    Random rn = new Random();

    void startGame(){
        System.out.println("Guesses Left: " + (noOfGuesses+1));
        correctNum = rn.nextInt(9)+1;


        while (noOfGuesses >= 0){
            System.out.print("Guess a Number Between 1 to 10: ");
            plyGuess = sc.nextInt();
            noOfGuesses--;

            if(correctNum == plyGuess){
                System.out.println("Correct");
                wannaTryAgain();
            }else if(correctNum < plyGuess){
                System.out.println("Too High, try guessing lower number");
            } else if (correctNum > plyGuess) {
                System.out.println("Too Low, try guessing higher number");
            }
        }


        if(noOfGuesses >= 0){
            System.out.println("You are out of guesses");
            wannaTryAgain();
        }
    }

    void wannaTryAgain(){
        int ch = 0;
        System.out.println("Do You Want To Play Again ?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        ch = sc.nextInt();
        if(ch == 1){
            noOfGuesses = 2;
            startGame();
        } else if (ch == 0) {
            System.out.println("Exiting Game...");
            System.exit(0);
        }
    }
}
