import java.util.Scanner;
public class Questions27 
{
    public static void main(String[] args) 
    {
        // Write a java program to take a String input and check 
        //   whether the given String is a palindrome String or not(Without reversing)


         Scanner s=new Scanner(System.in);
           System.out.println("Enter the String : ");
             String str=s.nextLine();

             String rev="";
             int end=str.length()-1;

             while(end>=0)
             {                                      
                rev= rev+ str.charAt(end);       
                end--;
             }

             if(str.equals(rev))
                System.out.println(str+" is Palindrome ");
            else
                System.out.println(str+" is not Palindrome ");
    }
}
