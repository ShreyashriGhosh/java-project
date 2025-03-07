import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
class quiz
{
    static Scanner sc = new Scanner(System.in);
    static int s = 0;
    static int qindex = 0;
    static boolean ans= false;
    
    
    static String[][] questions = {
        {"Who was the first Prime Minister of India?", "A. Jawaharlal Nehru", "B. Rabindranath Tagore", "C. Mahatma Gandhi", "D. Abhinav Bindra", "A"},
        {"What is 5 + 7 ?", "A. 7", "B. 12", "C. 9", "D. 10", "B"},
        {"Which planet is known as the Red Planet?", "A. Earth", "B. Mars", "C. Jupiter", "D. Venus", "B"},
        {"Which sport is known as the King of Sports?", "A. Cricket", "B. Soccer (Football)", "C. Hockey", "D. Badminton", "B"},
        {"How many Olympic rings are there?", "A. 6", "B. 7", "C. 5", "D. 9", "C"}
    };

    public static void main(String[] args)
    {
        System.out.println("Welcome to the Quiz Game!");
        System.out.println("You have 10 seconds to answer each question...");

        for (qindex =0; qindex < questions.length; qindex++) 
        {
            displayQuestion(qindex);
        }

        
        System.out.println("\n Quiz Completed!");
        System.out.println("Your Final Score: " + s + "/" + questions.length);
    }

    public static void displayQuestion(int index) 
    {
        ans = false;
        
        System.out.println("\nQuestion " + (index + 1) + ": " + questions[index][0]);
        for (int i = 1; i <= 4; i++) 
        {
            System.out.println(questions[index][i]);
        }
        
        Timer timer = new Timer();
        timer.schedule(new TimerTask() 
        {
            @Override
            public void run() 
            {
                if (!ans) 
                {
                    System.out.println("\nTime's up! Moving to the next question.");
                    qindex++;  
                }
            }
        }, 10000);

        System.out.print("\nEnter your answer (A, B, C, or D): ");
        String answer = sc.next().toUpperCase();
        ans = true;
        timer.cancel();
        
        if (answer.equals(questions[index][5])) 
        {
            System.out.println("Correct!");
            s++;
        } 
        else
        {
            System.out.println("Wrong! The correct answer was " + questions[index][5]);
        }
    }
}
