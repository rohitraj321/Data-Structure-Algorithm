import java.util.Scanner;
public class Questions18 
{
   public static void main(String[] args) 
   {
      //WAJP to take a user input and print the sum of each odd digits of the number.
         // Input: N=42763; and Output: 10

         Scanner s=new Scanner(System.in);
         System.out.println("Enter the Number : ");
         int num=s.nextInt();
         int sum=0;
         while(num>0)
         {
            int rem=num%10;
            if(rem%2==1)
                sum=sum+rem;

            num=num/10;
         }
         System.out.println("Sum of each odd digit is : "+sum);

   } 
}
