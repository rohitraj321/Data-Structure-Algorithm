import java.util.Scanner;

public class Questions13 
{
    public static void main(String[] args) 
    {
       //WAJP to take a user input and print each digit of the number from left to right
       // (Without Reversing it)  Input: N=43705; and Output:43705


         Scanner s=new Scanner(System.in);
           System.out.println("Enter the Number : ");
           int num=s.nextInt();
           String str=String.valueOf(num);

           int i=0;
           while(str.length()>i)
           {
               System.out.print(str.charAt(i) +" ");
               i++;
           }
    }
    
}
