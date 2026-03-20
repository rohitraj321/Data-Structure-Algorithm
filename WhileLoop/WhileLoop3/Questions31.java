import java.util.Scanner;
public class Questions31 
{
    public static void main(String[] args) 
    {
        // WAJP to take user input and print its binary representation.
           //  i/p: 20 and o/p: 10100

            Scanner s=new Scanner(System.in);
            System.out.println("Enter the Number : ");
            int num=s.nextInt();
            int temp=num;

            String binary="";
            while(num>0)
            {
                int bit=num%2;
                binary=bit + binary;

                num=num/2;
            }

            System.out.println("Binary Represation of "+temp+" is : "+binary);

    }
    
}
