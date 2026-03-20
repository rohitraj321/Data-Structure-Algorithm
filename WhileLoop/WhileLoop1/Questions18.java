import java.util.Scanner;
public class Questions18 
{
    public static void main(String[] args) 
    {
        // WAJP to print a number is a prime number or not.

        Scanner s=new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int num=s.nextInt();

         if(num<=1)
          {
            System.out.println("Number is not Prime ");
            return;
          }
        int i=2;
        while(i<num)
        {
            if(num%i==0)
            {
                System.out.println("Number is not Prime ");
                return;
            }
            i++;
        }

        System.out.println("Number is Prime");



/*
        // Another method using counter

        System.out.println("Enter the Number : ");
        int num=s.nextInt();
        int i=1;
        int count=0;

        while(num>=i)
        {
           if(num%i==0)
           {
              count++;
           }
              i++;
        }

        if(count==2)
        {
        System.out.println("Number is prime ");
        }
        else
        {
            System.out.println("Number is not prime ");
        }

*/


    }
}
