import java.util.Scanner;
public class Questions33 
{
    public static void main(String[] args) 
    {
     
        // Binary Number with Alternating Bits
        // Given a positive integer, check whether it has alternating bits: namely, if two adjacent bits will always have different values.

         Scanner s=new Scanner(System.in);
            System.out.println("Enter the binary Number : ");
            int binary=s.nextInt();

            int prev=binary%10;
            binary=binary/10;
            while(binary>0)
            {
                int next=binary%10;
                if(prev==next)
                {
                    System.out.println("Adjacent Bit are not Alternate  ");
                    return;
                }
                prev=next;
                binary=binary/10;

            }

            System.out.println("Adjacent Bits are Alternate ");
    }
}
