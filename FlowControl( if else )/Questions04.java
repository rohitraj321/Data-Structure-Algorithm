import java.util.Scanner;
public class Questions4 
{
    public static void main(String[] args) 
    {
        // WAP to take three angles of a triangle from user and 
        // print triangle is valid or not using if else statement.

        Scanner s=new Scanner(System.in);
        System.out.println("Enter first angle : ");
        int x=s.nextInt();
        System.out.println("Enter second angle : ");
        int y=s.nextInt();
        System.out.println("Enter third angle : ");
        int z=s.nextInt();

        if(x+y+z==180 && x>0 && y>0 && z>0)
            System.out.println("Triangle is Valid ");
        else
            System.out.println("Triangle is not Valid ");
    }
}
