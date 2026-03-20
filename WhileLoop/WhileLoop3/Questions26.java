import java.util.Scanner;
public class Questions26 
{
    public static void main(String[] args) 
    {
        //WAJP to take a String input and check whether the given String is a palindrome String or not.
           // Palindrome String: if String is same from both side
                //Input: String s1=“madam”; and Output: madam is a Palindrome String

         Scanner s=new Scanner(System.in);
           System.out.println("Enter the String : ");
             String str=s.nextLine();

             
             int start=0;
             int end=str.length()-1;
             while(start<end)
             {
                 if(str.charAt(start) != str.charAt(end))
                 {
                     System.out.println(str+" is not Plaindrome ");
                       return;
                 }
                 start++;
                 end--;

             }
             System.out.println(str +" is Palindrome ");

            //  if(isPalindrome(str))
            //     System.out.println(str +" is Palindrome ");
            // else
            //     System.out.println(str +" is not Palindrome ");

            
    }

    // public static boolean isPalindrome(String str )
    // {
    //      int start=0;
    //          int end=str.length()-1;
    //          while(start<end)
    //          {
    //              if(str.charAt(start) != str.charAt(end))
    //                  return false;

    //              start++;
    //              end--;

    //          }
    //          return true;
    // }
}
