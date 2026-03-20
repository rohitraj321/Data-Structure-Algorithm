import java.util.Scanner;
public class Questions15 
{
    public static void main(String[] args)
    {
        
        // WAJP to print all the factors of a number.
        
        Scanner s=new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int num=s.nextInt();
        int factor=1;
        while(factor<=num)
        {
           if(num%factor==0)
            System.out.println(factor);
        
            factor++;
        }
    }
}
