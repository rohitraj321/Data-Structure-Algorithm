import java.util.Scanner;
public class Questions28 
{
    public static void main(String[] args) 
    {
        // WAJP to take user input and count the number of binary bits 
        //    in that number when it is represented in binary form.

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num=s.nextInt();
        int count=0;

        while(num>0)
        {
            count++;
            num=num/2;
        }

        System.out.println("Count : "+count);
    }
}
