import java.util.Scanner;

public class Questions6 
{
   public static void main(String[] args) 
   {
      // Write a java program to take a user input and print the difference of 
      // biggest digit and smallest digit of the number. INP : 42375; OUT:5

      Scanner s=new Scanner(System.in);
      System.out.println("Enter the Number : ");
      int num=s.nextInt();
      int big=Integer.MIN_VALUE;
      int small=Integer.MAX_VALUE;
       
      while(num>0)
      {
        int rem=num%10;
        if(rem>big)
            big=rem;
        else if(rem<small)
            small=rem;

        num=num/10;
      }
    System.out.println("Difference between "+big+" and "+small+" is : "+(big-small));
   }
}
