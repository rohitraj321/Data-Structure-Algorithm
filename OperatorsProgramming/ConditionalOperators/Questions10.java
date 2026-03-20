import java.util.Scanner;
public class Questions10 
{
    public static void main(String[] args) 
    {
        
     // Given a character, check if it's uppercase, lowercase, digit or special character.

         Scanner s=new Scanner(System.in);
         System.out.println("Enter the character : ");
         char c = s.next().charAt(0);

         String result = (c>='A' && c<='Z')? "Uppercase " : 
                         (c>='a' && c<='z')? "Lowercase " : 
                         (c>='0' && c<='9')? "Digits " : "Special Character ";

                         System.out.println(c +" is an " +result);


    }
}
