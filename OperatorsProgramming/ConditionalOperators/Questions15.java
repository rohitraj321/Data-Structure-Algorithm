import java.util.Scanner;
public class Questions15 
{
   public static void main(String[] args) 
   {
     
    // print second largest of three distinct numbers using ternary operator only.

    Scanner s=new Scanner(System.in);

    System.out.println("Enter the three number ");
    int a=s.nextInt();
    int b= s.nextInt();
    int c=s.nextInt();

    int biggest = (a>b && a>c)? a: (b>c)?b:c;

    int smallest = (a<b && a<c)? a : (b<c)? b : c ;

    int SecondLargest= (a+b+c) - biggest - smallest;
    System.out.println("Second Largest Number is "+SecondLargest);





   }
    
}
