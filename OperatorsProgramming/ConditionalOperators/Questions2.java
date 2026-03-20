import java.util.Scanner;
public class Questions2 {
    public static void main(String[] args) 
    {
        //WAP to check and print the given +ve number is a three digit number or not.

        Scanner s=new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int n=s.nextInt();

       String result = n>=100 && n<=999 ? "Three digit Number " : "Not Three Digit Number ";
       System.out.println(n +" is : " + result);
    }
    
}
