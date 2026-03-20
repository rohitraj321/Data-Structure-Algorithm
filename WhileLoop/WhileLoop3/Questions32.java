import java.util.Scanner;
public class Questions32 
{
    public static void main(String[] args) 
    {
        // WAJP to take binary input and print its decimal representation.
            //  i/p: 10100 and  o/p: 20

             Scanner s=new Scanner(System.in);
            System.out.println("Enter the binary Number : ");
            int binary=s.nextInt();
            int temp=binary;

            double decimal=0;
            int n=0;
            while(binary>0)
            {
                int bit=binary%10;
                decimal=decimal+bit*Math.pow(2,n);

                binary=binary/10;
                n++;
            }

            System.out.println("Decimal Representation of "+temp+" is : "+decimal);
    }
}
