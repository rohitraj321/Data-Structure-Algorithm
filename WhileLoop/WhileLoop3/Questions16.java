import java.util.Scanner;

public class Questions16 
{
    public static void main(String[] args) 
    {
       //WAJP to take a user input and print the sum of each digit of the number.
         // Input: N=4207065; and Output: 24

         Scanner s=new Scanner(System.in);
         System.out.println("Enter the Number : ");
         int num=s.nextInt();
         int sum=0;

         while(num>0)
         {
            sum=sum+num%10;

            num=num/10;
         }
         System.out.println("Sum of each digit is : "+sum);
    }
}
