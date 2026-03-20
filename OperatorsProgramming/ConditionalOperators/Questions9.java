import java.util.Scanner;
public class Questions9 
{
    public static void main(String[] args) 
    {
        
        //WAP to check whether the given character is an alphabet or not.
        Scanner s=new Scanner(System.in);

        System.out.println("Enter the character : ");
        char c= s.next().charAt(0);

        String result = (c>='A' && c<='Z')||(c>='a' && c<='z')? " Alphabet " : "Not Alphabet";

        System.out.println(c +" is an " + result);

    }
}
