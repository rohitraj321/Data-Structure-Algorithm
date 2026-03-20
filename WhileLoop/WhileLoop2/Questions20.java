import java.util.Scanner;


public class Questions20 
{
    public static void main(String[] args) 
    {
        // WAJP to accept two numbers from user and print power of a to b.
         //  i/p: 6 3  and  o/p: 6 to power 3 is: 216

         Scanner s=new Scanner(System.in);

         System.out.println("Enter base : ");
         int base =s.nextInt();
         System.out.println("Enter exponent : ");     
          int exponent =s.nextInt();

         // double Power = Math.pow(base,exponent);

          int i=0;
          double Power=1;
          while(i<exponent)
          {
            Power=Power*base;

            i++;
          }
          System.out.println(base +" to Power "+exponent+" is : "+Power);

        



    }
}
