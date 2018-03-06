import java.util.Scanner;
import java.util.Random;

public class Third {
    static void TryAgain(int number){
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to try again? Type 'yes' if you do");
        String yn = scan.nextLine();
        if(yn.equals("yes")) Game(number);
        }

    static void Game(int number){
        Scanner scan = new Scanner(System.in);
        System.out.println("Guess the number: ");
        int ans = scan.nextInt();
        if (ans != number){
            if (ans < number){
                System.out.println("Correct number is greater than your answer");
            } else{
                System.out.println("Correct number is lesser than your answer");
            }
        } else{
            System.out.println("You guessed correctly!");
            System.exit(0);
        }
        TryAgain(number);
    }
    public static void main(String[] args){
        final int max = 101;
        Random rand = new Random();
        int number = rand.nextInt(max);
        System.out.println(number);
        Game(number);
    }
}
