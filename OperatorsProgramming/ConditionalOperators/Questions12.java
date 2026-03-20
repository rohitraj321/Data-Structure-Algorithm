import java.util.Scanner;
public class Questions12 
{
    public static void main(String[] args) 
    {
        
        // WAP to print the smaller of two numbers.

        Scanner s=new Scanner(System.in);

        System.out.println("Enter the two Number : ");
        int a =s.nextInt();
        int b =s.nextInt();

        int result= a>b?b : a;

        System.out.println("Smallest Number is "+result);
    }
}
