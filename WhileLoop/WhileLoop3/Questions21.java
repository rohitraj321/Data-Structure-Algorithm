import java.util.Scanner;

public class Questions21 
{
    public static void main(String[] args) 
    {
        // Add Digit
      //Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

      Scanner s=new Scanner(System.in);
      System.out.println("Enter the number : ");
      int num=s.nextInt();

      while(num>9)
      {
        int sum=0;
        while(num>0)
        {
            sum=sum+num%10;
             num=num/10;
        }
                 num=sum;
       
      }

      System.out.println("Add digit repeated untill one digit  : "+num);
    }
}
