import java.util.Scanner;
public class Questions24 
{
    public static void main(String[] args) 
    {
    
        //WAJP to take a user input and print whether the number is a palindrome number or not.
       //  Palindrome Number: if number and its reverse is same then it is called palindrome number.
             // Input: N=34843 AND Output: 34843 is a Palindrome Number

             Scanner s=new Scanner(System.in);
             System.out.println("Enter the Number : ");
             int num=s.nextInt();

             int temp=num;
             int rev=0;

             while(num>0)
             {
                int rem=num%10;
                rev=rev*10+rem;

                num=num/10;
             }

             if(rev==temp)
                System.out.println(temp +" is Palindrome ");
            else
                System.out.println(temp + " is not Palindrome ");

    }
}
