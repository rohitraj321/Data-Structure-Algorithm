import java.util.Scanner;

public class Questions12 
{
    public static void main(String[] args) 
    {
       //WAJP to take a user input and count all the digits of the number which are less than or equals to 5.
           // Input: N=42765; and Output: 3 

           Scanner s=new Scanner(System.in);
           System.out.println("Enter the Number : ");
           int num=s.nextInt();
           int count=0;

           while(num>0)
           {
            int rem=num%10;
            if(rem<=5)
                count++;

            num=num/10;
           }
           System.out.println("count of all the digits of the number which are less than or equals to 5 : "+count);
    }
}
