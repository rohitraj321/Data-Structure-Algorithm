import java.util.Scanner;
public class Questions29 
{
    public static void main(String[] args) 
    {
        // Number of 1 bits
        // Given a positive integer n, write a function that returns the number of set bits in its binary representation (also known as the Hamming weight).



        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num=s.nextInt();
        int count=0;

        while(num>0)
        {
            int bit=num%2;
            if(bit==1)
                count++;

            num=num/2;
        }

        System.out.println("Number of 1 bits  : "+count);

    }
}
