import java.util.Scanner;
public class Questions18 
{
    public static void main(String[] args) 
    {
        // WAJP to print the smallest of four numbers.

        Scanner s=new Scanner(System.in);
        System.out.println("ENter the Four Number ");
        
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int d=s.nextInt();

        int result = (a<b && a<c && a<d)? a :
                     (b<c && b<d)? b : 
                     (c<d)? c : d ;

                     System.out.println("Smallest of 4 number is  "+result);
    }
}
