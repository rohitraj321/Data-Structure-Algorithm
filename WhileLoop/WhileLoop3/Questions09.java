import java.util.Scanner;

public class Questions9 
{
    public static void main(String[] args) 
    {
        //WAJP to take a user input and count how many 3 has appeared in the number
          // Input: N=4373533; and Output: 4

          Scanner s=new Scanner(System.in);
          System.out.println("Enter the Number : ");
          int num=s.nextInt();
          int count=0;

          while(num>0)
          {
            int rem=num%10;
            if(rem==3)
                count++;

            num=num/10;
          }
          System.out.println("count of 3 has appeared in the number is :"+count);
    }
}
