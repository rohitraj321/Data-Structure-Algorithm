import java.util.Scanner;
public class Questions23 
{
    public static void main(String[] args) 
    {
        //WAJP to take a user input and reverse the number.
           // Input: N=3745; and Output: 5473

           Scanner s=new Scanner(System.in);
           System.out.println("Enter the Number : ");
           int num=s.nextInt();

           int rev=0;
           while(num>0)
           {
            int rem=num%10;
            rev=rev*10+rem;
          
            num=num/10;
           }
           System.out.println("Reversed Number is : "+rev);

    }
}
