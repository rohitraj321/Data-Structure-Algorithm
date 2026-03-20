import java.util.Scanner;
public class Questions19 
{
    public static void main(String[] args) 
    {
        // Three Divisor
        // Given an integer n, return true if n has exactly three positive divisors. Otherwise, return false


            Scanner s=new Scanner(System.in);

            System.out.println("Enter the Number : ");
            int num=s.nextInt();
           System.out.println( isThreeDivisor(num));

            
    }

    public static boolean isThreeDivisor(int num)
    {
        int i=1;
            int count=0;

            while(num>=i)
            {
                if(num%i==0)
                {
                    count++;
                }
                i++;
            }
        
             if(count==3)
             {
                return true;
             }
            else
            {
                return false;
            }
    }
}
