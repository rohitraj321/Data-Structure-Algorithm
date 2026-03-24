import java.util.Scanner;

public class Questions4 
{
    public static void main(String[] args) 
    {
       // WAJP to take a user input and print each digits of the number which
     // are greater than or equals to 5 one by one.  INPUT : 43705 ; OUTPUT : 5 7

           Scanner s=new Scanner(System.in);
           System.out.println("Enter the Number : ");
           int num=s.nextInt();

           while(num>0)
           {
             int rem=num%10;
             if(rem>=5)
                System.out.println(rem);

             num=num/10;
           }

    }
}
