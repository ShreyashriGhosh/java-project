import java.util.Scanner;
class gradecal
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of subjects:\t");
        int nsub=sc.nextInt();
        if (nsub<=0)
        {
            System.out.println("INVALID number of subjects....");
            return;
        }
        int total=0;
        
        for(int i=1;i<=nsub;i++)
        {
            System.out.println("Enter marks obtained in subject " +i+": \t");
            int marks=sc.nextInt();
            
            if(marks <0 || marks >100)
            {
                System.out.println("INVALID marks....");
                return;
            }
            total=total+marks;
        }
        
        double avgpercentage;
        avgpercentage= (double)total / nsub;
        String grade;
        if(avgpercentage >=90)
        {
            grade="O (Outstanding)";
        }
        else if(avgpercentage >=80)
        {
            grade="E (Excellent)";
        }
        else if(avgpercentage >=70)
        {
            grade="A (Very Good)";
        }
        else if(avgpercentage >=60)
        {
            grade="B (Good)";
        }
        else if(avgpercentage >=50)
        {
            grade="C (Average)";
        }
        else if(avgpercentage >=40)
        {
            grade="D (Below Average)";
        }
        else
        {
            grade="F (Fail)";
        }
        System.out.println("Total Marks Obtained: "+total );
        System.out.println(" Average Percentage: "+avgpercentage+ "%");
        System.out.println("Grade: "+grade);
        
        sc.close();
    }
}