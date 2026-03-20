import java.util.Scanner;
public class Questions1 {
    public static void main(String args[])
    {
        //WAP to check and print the given number is an even number or not.

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n=s.nextInt();
        String result = n%2==0?"Even":"Odd";
        System.out.println(n +" is : "+result);
    }
    
}
