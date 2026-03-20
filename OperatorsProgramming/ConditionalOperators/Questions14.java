import java.util.Scanner;
public class Questions14 
{
    public static void main(String[] args) 
    {
        // WAP to print the smallest of three numbers.

         Scanner s=new Scanner(System.in);

        System.out.println("Enter the three Number : ");
        int a =s.nextInt();
        int b =s.nextInt();
        int c =s.nextInt();


        int result= (a<b && a<c)?a : (b<c? b : c);

        System.out.println("Smallest of Three Number is "+result);


    }
}
