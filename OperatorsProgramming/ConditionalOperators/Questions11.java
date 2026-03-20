import java.util.Scanner;
public class Questions11 
{
    public static void main(String[] args) 
    {
        
        // WAP to print the bigger of two numbers.

        Scanner s= new Scanner(System.in);
        System.out.println("Enter the two Number : ");
        int a =s.nextInt();
        int b =s.nextInt();

        int result= a>b?a : b;

        System.out.println("Bigger Number is "+result);


    }
}
