import java.util.Scanner; 
public class Questions8 
{
    public static void main(String[] args) 
    {
        
        //WAP to check whether the given character is a lower case alphabet or not.

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Character : ");
        char c=s.next().charAt(0);

        String result = (c>='a' && c<='z')?"Lowercase" : "Uppercase";

        System.out.println(c +" is in "+result);



    }
}
