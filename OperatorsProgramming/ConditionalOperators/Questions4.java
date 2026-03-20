import java.util.Scanner;

public class Questions4 
{
    public static void main(String[] args) 
    {
        //For given numbers x and y. check whether y is a factor of x or not.

        Scanner s=new Scanner(System.in);

        System.out.println("Enter x = ");
        int x=s.nextInt();
        System.out.println("Enter y = ");
        int y=s.nextInt();

        String result = x%y==0? "y is factor of x " : "y is not factor of x ";

        System.out.println(result);

    }
}
