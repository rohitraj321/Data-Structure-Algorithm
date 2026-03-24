import java.util.Scanner;
public class Questions1 
{
    public static void main(String[] args) 
    {
        // WAP to print big of two numbers using if else statement.

        Scanner s=new Scanner(System.in);
        System.out.println("Enter x : ");
        int x=s.nextInt();
        System.out.println("Enter y : ");
        int y=s.nextInt();

        if(x>y)
            System.out.println("Biggest of two Number is "+x);
        else
            System.out.println("Biggest of two Number is "+y);
    }
}
