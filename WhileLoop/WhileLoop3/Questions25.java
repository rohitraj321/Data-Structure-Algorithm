import java.util.Scanner;
public class Questions25 
{
    public static void main(String[] args) 
    {
        // Plaindrome Number 
        // Given an integer x, return true if x is a palindrome, and false otherwise.


        Scanner s=new Scanner(System.in);
        System.out.println("Enter x : ");
        int x=s.nextInt();
        System.out.println("Number is Palindrome : "+isPalindrome(x));
    }

    public static boolean isPalindrome(int x)
    {
        int temp=x;
        int rev=0;
        while(x>0)
        {
            int rem=x%10;
            rev=rev*10+rem;
            x=x/10;
        }
        if(temp==rev)
            return true;
        else
            return false;
    }
}
