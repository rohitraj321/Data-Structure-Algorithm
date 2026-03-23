import java.util.Scanner;
public class Questions6 
{
    public static void main(String[] args) 
    {
        // WAP to take three sides of a triangle and 
        // print it is equilateral, isosceles or scalene triangle or not using if else statement.

        Scanner s=new Scanner(System.in);
        System.out.println("Enter first side : ");
        int x=s.nextInt();
        System.out.println("Enter second side ");
        int y=s.nextInt();
        System.out.println("Enter third side : ");
        int z=s.nextInt();

        if(x+y>z && y+z>x && z+x>y)
        {
            if(x==y && y==z)
                System.out.println("Triangle is Equilateral ");
            else if(x==y || y==z || x==z)
                System.out.println("Triangle is Isosceles ");
            else if(x!=y && y!=z && z!=x)
                System.out.println("Triangle is Scalene ");
    
        }
         else
            System.out.println("Triangle is not Valid ");
    }
}
