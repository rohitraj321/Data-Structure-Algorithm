import java.util.Scanner;
public class Questions3 
{
    public static void main(String[] args) 
    {
        // WAP to take a character input and print it is alphabet or not 
        // using if else statement.

        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Character : ");
        char c=s.next().charAt(0);

        if((c>='A' || c<='Z' )|| (c>='a' || c<='z'))
        {
            System.out.println(c+" : is Alphabet ");
        }
    }
}
