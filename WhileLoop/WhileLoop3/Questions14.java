import java.util.Scanner;

public class Questions14 
{
    public static void main(String[] args) 
    {
        // WAJP to take a user input and print each digit of the number from left to right
       // (With Reversing it)  Input: N=43705; and Output:43705

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt();
        int n=num;
        int rev=0;

        while(n>0)
        {
            int rem=n%10;
             rev=rev*10+rem;
             n=n/10;
        }

        while(rev>0)
        {
            int digit=rev%10;
            System.out.println(digit);
            rev=rev/10;
        }
    }
}
