import java.util.Scanner;
public class Questions7 
{
  public static void main(String[] args) 
  {
    
    //WAP to check whether the given character is an upper case alphabet or not.

    Scanner s=new Scanner(System.in);
    System.out.println("Enter the Character : ");
    char c=s.next().charAt(0);

    String result = (c >= 'A' && c<='Z')?" Uppercase" : "Lowercase";

    System.out.println(c +" is in "+result);






  }
    
}
