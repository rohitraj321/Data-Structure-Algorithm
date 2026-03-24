import java.util.Scanner;

public class Questions6 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);

        // For a given year print true if it is a leap year or print false if it is not a leap year.

        System.out.println("Enter Year = ");
        int year=s.nextInt();

        String result = (year%100!=0 && year%4==0) || (year %400==0)? "Leap Year " : "Not Leap Year ";

        System.out.println(year +" is : "+result);
    }
}
