import java.util.Scanner;

public class Questions17 
{
    public static void main(String[] args) 
    {
    //WAJP to take a user input and print the sum of each even digits of the number.
           // Input: N=42765;  and Output: 12

           Scanner s=new Scanner(System.in);
           System.out.println("Enter the Number : ");
           int num=s.nextInt();
           int sum=0;
           
           while(num>0)
           {
            int rem=num%10;
            if(rem%2==0)
                sum=sum+rem;

            num=num/10;
           }
           System.out.println("Sum of The each even digit is : "+sum);
    }
}
