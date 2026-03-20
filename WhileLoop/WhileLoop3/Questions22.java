import java.util.Scanner;
public class Questions22 
{
    public static void main(String[] args) 
    {
        // Count the digit that divides the Number
       // Given an integer num, return the number of digits in num that divide num.

         Scanner s=new Scanner(System.in);
         System.out.println("Enter the Number : ");
         int num=s.nextInt();

         int count=0;
         int temp=num;
         while(num>0)
         {
            int rem=num%10;
            if(temp%rem==0)
            {
                System.out.println(rem);
                count++;
            }
            num=num/10;
         }

         System.out.println("Count of digit that divides the Number : "+count);



 
    }
}
