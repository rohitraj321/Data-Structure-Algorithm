import java.util.Scanner;
public class Questions17 
{
    public static void main(String[] args) 
    {
        // WAJP to print and count all the factors of a number.

        Scanner s=new Scanner(System.in);
         System.out.println("Enter the Number : ");
         int num=s.nextInt();
         int factor=1;
         int count=0;
         while(factor<=num)
         {
            if(num%factor==0)
            {
                System.out.println(factor);
                count++;
            }
            factor++;
         }

         System.out.println("Total number of Factors are : "+count);
    }
}
