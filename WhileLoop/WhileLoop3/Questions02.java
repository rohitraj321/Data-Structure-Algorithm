import java.util.Scanner;

public class Questions2 
{
    public static void main(String[] args) 
    {
     // WAJP to take a user input and print each even digits of the number
     // one by one.  Input: N=43705;  and Output: 0 4

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num=s.nextInt();

        while(num>0)
        {
            int rem=num%10;
            if(rem%2==0)
            {
                System.out.println(rem);
            }
            num=num/10;
        }


    }
}
