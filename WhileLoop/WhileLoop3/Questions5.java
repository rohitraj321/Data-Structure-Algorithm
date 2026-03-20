import java.util.Scanner;

public class Questions5 
{
   public static void main(String[] args)
   {
      // WAJP to take a user input and print the biggest digit of the number.
         // INPUT : 43705 ; OUTPUT : 7

         Scanner s=new Scanner(System.in);
         System.out.println("Enter the Number : ");
         int num=s.nextInt();
         int big=Integer.MIN_VALUE;

         while(num>0)
         {
            int rem=num%10;
            if(rem>big)
                big=rem;

            num=num/10;
         }
         System.out.println("Biggest Digit of the Number is : "+big);
   }
}
