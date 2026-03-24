import java.util.Scanner;

public class Questions8 
{
    public static void main(String[] args) 
    {
        //WAJP to take a user input and count how many 0 digit is in number.
           // Input: N=430705; and Output: 2


        Scanner s=new Scanner(System.in);
          System.out.println("Enter the Number : ");
          int num=s.nextInt();
          int count=0;

          while(num>0)
          {
            int rem=num%10;
            if(rem==0)
                count++;

            num=num/10;
          }
          System.out.println("count of 0 digit is in number : "+count);
    }
}
