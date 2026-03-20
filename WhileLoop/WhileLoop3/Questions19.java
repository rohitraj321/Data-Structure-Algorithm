import java.util.Scanner;

public class Questions19 
{
    public static void main(String[] args) 
    {
      //WAJP to take a user input and print the sum of each digits of the number which are less than or equals to 5.
          // Input: N=42765; and Output: 11

          Scanner s=new Scanner(System.in);
          System.out.println("Enter the Number : ");
          int num=s.nextInt();
          int sum=0;

          while(num>0)
          {
            int rem=num%10;
              if(rem<=5)
                sum=sum+rem;

              num=num/10;
          }

          System.out.println("Sum of each digits of the number which are less than or equals to 5 : "+sum);

    }
}
