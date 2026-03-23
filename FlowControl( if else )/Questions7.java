import java.util.Scanner;
public class Questions7 
{
    public static void main(String[] args) 
    {
        // WAP to check the given year is a Leap year or NOT.
        
         Scanner s=new Scanner(System.in);
         System.out.println("Enter the year : ");
         int year=s.nextInt();

         if((year%100 !=0 && year%4==0) || (year%400==0))
         {
            System.out.println(year+ " is Leap Year ");
         }
         else
            System.out.println(year +" is Not Leap Year ");
    }
}
