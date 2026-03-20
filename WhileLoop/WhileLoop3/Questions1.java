import java.util.Scanner;

public class Questions1 
{
    public static void main(String[] args) 
    {
        //WAJP to take a user input and print each digits of the number one by one from right to left.

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num=s.nextInt();
        while(num>0)
        {
            int rem=num%10;
            System.out.println(rem);

            num=num/10;
        }


    }
}
