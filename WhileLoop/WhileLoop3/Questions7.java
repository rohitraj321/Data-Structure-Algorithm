import java.util.Scanner;

public class Questions7 
{
    public static void main(String[] args) 
    {
        // WAJP to take a user input and count the total digit of the number.
          // Input: N=43705; and Output: 5

          Scanner s=new Scanner(System.in);
          System.out.println("Enter the Number : ");
          int num=s.nextInt();
          int count=0;

          while(num>0)
          {
            int rem=num%10;
             count++;

             num=num/10;
          }
          System.out.println("count of total digit of the number : "+count);
    }
}
