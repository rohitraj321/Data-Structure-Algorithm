import java.util.Scanner;

public class Questions11 
{
    public static void main(String[] args) 
    {
        // WAJP to take a user input and count the odd digits of the number.
        // Input: N=42765; and  Output: 2

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num=s.nextInt();
        int count=0;

        while(num>0)
        {
            int rem=num%10;
            if(rem%2==1)
                count++;

            num=num/10;
        }
        System.out.println("Count of Odd digits of the Number : "+count);
    }
}
