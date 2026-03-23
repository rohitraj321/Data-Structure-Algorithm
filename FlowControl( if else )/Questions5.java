import java.util.Scanner;
public class Questions5 
{
    public static void main(String[] args) 
    {
        // WAP to take three sides of a triangle and
        //  print it is a valid triangle or not using if else statement.

        Scanner s=new Scanner(System.in);
        System.out.println("Enter first side : ");
        int x=s.nextInt();
        System.out.println("Enter second side ");
        int y=s.nextInt();
        System.out.println("Enter third side : ");
        int z=s.nextInt();

        if(x+y>z || y+z>x || x+z>y)
            System.out.println("Triangle is Valid ");
        else
            System.out.println("Triangle is not Valid ");
    }
}
