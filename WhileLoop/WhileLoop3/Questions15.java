import java.util.Scanner;

public class Questions15 
{
    public static void main(String[] args) 
    {
       //WAJP to take a user input and print each digit ofthe number from left to right
       // (Without using any inbuilt features) Input: N=43705; and Output:43705

       Scanner s=new Scanner(System.in);
       System.out.println("Enter the Number : ");
       int num=s.nextInt();

       int divisor=1;
       int temp=num;
       while(temp>=10)
       {
        temp=temp/10;
        divisor=divisor*10;
       }

       while(divisor>0)
       {
        int digit=num/divisor;
        System.out.println(digit);

        num=num%divisor;
        divisor=divisor/10;
       }
    }
}
