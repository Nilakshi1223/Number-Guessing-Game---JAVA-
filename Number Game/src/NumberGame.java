import java.util.Scanner;

public class NumberGame {

    Scanner sc = new Scanner(System.in);
    int min = 1;   //minimum value of the number range
    int max = 100;   //maximum value of the number range

    int score=0;
    public void guessRounds (){

        System.out.println("\nNumber range is 1 to 100!");
        System.out.println("You have 3 chances in one round \n");
        char playAgain = 'Y';

        while ( playAgain == 'Y'){

            int randomNumber =  (int) Math.round(Math.random()*(max-min)+5);  // to change the random number
            for ( int i=1 ; i <=3; i++){
                System.out.print("Enter your guess : ");
                int guessNumber = sc.nextInt();  // request the guess number from the user

                if (randomNumber == guessNumber) {
                    System.out.println("Your guess number is correct!");
                    score++;  // if the guess number is correct, then add 1 to the score
                    break;
                } else if (randomNumber>guessNumber){
                    System.out.println("Your guess number is too low!");
                }else {
                    System.out.println("Your guess number is too high!");
                }
            }

            System.out.println("The correct number : " + randomNumber);
            System.out.print("Would you like to play again (Y/N) : ");
            playAgain = sc.next().toUpperCase().charAt(0);  // request the permission to play the game again
            System.out.println("\n");

        }
        System.out.println("Your final score is: " + score);  // Display final score

    }

    public static void main(String[] args) {

        NumberGame numberGameObj = new NumberGame();

        numberGameObj.guessRounds();

    }
}
