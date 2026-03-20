import java.util.Scanner;

public class Questions10 
{
   public static void main(String[] args)
   {
     //WAJP to take a user input and count the even digits of the number.
        // Input: N=42765; and  Output: 3

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num=s.nextInt();
        int count=0;

        while(num>0)
        {
            int rem=num%10;
            if(rem%2==0)
                count++;

            num=num/10;
        }

        System.out.println("Count of even digits of the number : "+count);

   } 
}
