import java.util.Random;
import java.util.Scanner;
public class numgame
{

    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("\nWelcome to the Number Game.\nThe System will generate a random number b/w 1-100.");
        System.out.println( "You have to guess that random number.");
        System.out.print("Enter the Number of Rounds (between 1-5) you want to play the Game : ");
        int rounds = sc.nextInt();

        for (int i = 1; i <= rounds; i++) 
        {
            System.out.println();
            System.out.println("Round " + i + " begins ...\n");

            System.out.println("Please Enter the Difficulty Level:\n1 --> Easy [There is No Limit for number of attempts]\n2 --> Hard [There is Limit for number of attempts]");
            int limit = sc.nextInt();

            switch (limit)
            {
                case 1:
                {
                    System.out.println("Opted for Easy Difficulty.\nHence, there is No Limit to number of attempts\n");

                    int randomNumber = 1 + rand.nextInt(100);
                    System.out.println("Random Number has been generated...");

                    int c= 1;
                     while (true) 
                    {
                        System.out.print("Enter you guess number " + c + ": ");
                        int guessNumber = sc.nextInt();
                        if (guessNumber > randomNumber)
                        {
                            System.out.println("The number " + guessNumber + " is too High...!");
                        } 
                        else if (guessNumber < randomNumber) 
                        {
                            System.out.println("The number " + guessNumber+ " is too Low...!");
                        } 
                        else 
                        {
                            System.out.println(
                                    "The number " + guessNumber + " is EQUAL to than Generated Number.\nCongrats it took you "
                                            + c+ " attempts.");
                            break ;
                        }
                        c++;
                    }
                    break;
                }
                case 2: 
                {
                    System.out.println("Opted for Hard Difficulty.\nHence, there is a Limit to number of attempts");
                    System.out.println( "The limit is just 5.\nIf you have guessed the number in 5 or less attempts you have won the game.\n Else you will lose the game.\n");
                    int randomNumber = 1 + rand.nextInt(100);
                    System.out.println("Random Number has been generated...");

                    int c= 1;
                     while (c <= 5)
                    {
                        System.out.println("\nNo of guesses remaining : " + (6 - c) + " .....\n");
                        System.out.print("Enter you guess number " + c + ": ");
                        int guessNumber = sc.nextInt();
                        if (guessNumber > randomNumber) 
                        {
                            System.out.println("The number " + guessNumber+ " is too High...!");
                        } 
                        else if (guessNumber < randomNumber) 
                        {
                            System.out.println("The number " + guessNumber+ " is too Low...!");
                        } 
                        else 
                        {
                            System.out.println("The number " + guessNumber + " is EQUAL to than Generated Number.\nCongrats it took you " + c + " attempts.");
                            break;
                        }
                        c++;
                    }
                    if (c > 5) 
                    {
                        System.out.println("OOPS!!! You were not able to guess the number in 5 attempts.\nThe Generated Number was "+ randomNumber + "\nBETTER LUCK NEXT TIME\n");
                    }
                    break;
                }
                default:
                {
                    System.out.println("--- WRONG INPUT ---\n Sorry!!! But this round has been wasted.");
                    break;
                }
            }

            System.out.println("ROUND " + i + " is OVER.");
        }
        System.out.println("\nAll the Rounds are over.\nThank You for Playing the Game.\nHope you enjoyed it.");
        sc.close();
    }
}