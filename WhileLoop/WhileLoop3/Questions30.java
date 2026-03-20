import java.util.Scanner;
public class Questions30 
{
    public static void main(String[] args) 
    {
        // WAJP to take user input and count the number 
            // of 0’s bits and 1’s bits in that number.

            Scanner s=new Scanner(System.in);
            System.out.println("Enter the Number : ");
            int num=s.nextInt();

            int count0=0;
            int count1=0;
            while(num>0)
            {
                int bit=num%2;
                if(bit==1)
                    count1++;
                else
                    count0++;

                num=num/2;
            }

            System.out.println("Number of 0 bit : "+count0);
            System.out.println("Number of 1 bit : "+count1);
    }
}
