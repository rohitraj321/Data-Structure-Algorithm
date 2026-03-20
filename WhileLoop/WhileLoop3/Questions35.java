import java.util.Scanner;
public class Questions35 
{
    public static void main(String[] args) 
    {
        //WAJP to take a user input and return true if all the digits of the number is in increasing order.
            // Input: N=5689; and Output: true

            Scanner s=new Scanner(System.in);
            System.out.println("Enter the Number : ");
            int num=s.nextInt();

            if(isIncresingOrder(num))
                System.out.println("Number is in Increasing Order ");
            else
                System.out.println("Number is not in Increasing Order ");
    }

    public static boolean isIncresingOrder(int num)
    {
        int prev=num%10;
        num=num/10;
        while(num>0)
        {
            int next=num%10;
            if(prev<=next)
                return false;

            prev=next;
            num=num/10;
        }
        return true;
    }
}
