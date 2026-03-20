import java.util.Scanner;
public class Questions19 
{
    public static void main(String[] args) 
    {
        // WAJP to accept a input from user and print factorial of that number.
           //  i/p: 6  and o/p: 6!= 720

        Scanner s=new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int num=s.nextInt();
        int fact=1;
        int i=1;

        while(i<=num)
        {
            fact=fact*i;

            i++;
        }

        System.out.println("Factorial of "+num+" is : "+fact);

    }
}
