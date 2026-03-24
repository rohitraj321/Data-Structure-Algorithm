import java.util.Scanner;
public class Questions2 
{
    public static void main(String[] args) 
    {
        // WAP to print all are equal if all have same value or
        // print biggest value of three numbers using if else statement.

        Scanner s=new Scanner(System.in);
        System.out.println("Enter x : ");
        int x=s.nextInt();
        System.out.println("Enter y : ");
        int y=s.nextInt();
        System.out.println("Enter the z : ");
        int z=s.nextInt();

        if(x==y && y==z)
        {
              System.out.println("All are equal "+x);
              return;
        }
        if(x>y && x>z)
        {
            System.out.println("Biggest value of three numbers : "+x);
        }
        else if(y>x && y>z)
        {
            System.out.println("Biggest value of three numbers : "+y);
        }
        else
            System.out.println("Biggest value of three numbers : "+z);
    }
}
