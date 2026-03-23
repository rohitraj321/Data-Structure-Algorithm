import java.util.Scanner;
public class Questions40 
{
    public static void main(String[] args) 
    {
        // Power of Three or not 

          Scanner s=new Scanner(System.in);
          System.out.println("Enter the Number : ");
          int num=s.nextInt();
          int n=num;

          System.out.println("Enter the d : ");
          int d=s.nextInt();   // d=2;

          if(num<=0)
          {  System.out.println(n+" is not Power of "+d);
            return;
          }

          while(num>1)
          {
            if(num%d!=0)
           {
             System.out.println(n+" is not Power of "+d);
             return;
           }
            num=num/d;
          }

          System.out.println(n+" is  Power of "+d);
    }
}