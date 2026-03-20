import java.util.Scanner;
public class Questions38 
{
    public static void main(String[] args) 
    {
        // Factorial Trailing Zeroes
           // Example 1:  Input: n = 3  and Output: 0
               // Explanation: 3! = 6, no trailing zero.
           // Example 2: Input: n = 5 and Output: 1
               // Explanation: 5! = 120, one trailing zero.

            Scanner s=new Scanner(System.in);
          System.out.println("Enter the  Number : ");
          int num=s.nextInt();
          int temp=num;

          int count=0;
          while(num>=5)
          {
            count=count+num/5;

            num=num/5;
          }

          System.out.println("Number of Factorial Trailing Zeroes of "+temp +" is : "+count);
    }
}
