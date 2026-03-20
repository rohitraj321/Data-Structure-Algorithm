import java.util.Scanner;
public class Questions20 
{
    public static void main(String[] args) 
    {
        
    
    // kth factor;
    //You are given two positive integers n and k.
    //  A factor of an integer n is defined as an integer i where n % i == 0.
    //Consider a list of all factors of n sorted in ascending order, 
    // return the kth factor in this list or return -1 if n has less than k factors.


             Scanner s=new Scanner(System.in);
             System.out.println("Enter Number : ");
             int num=s.nextInt();
             System.out.println("Enter the kth Factor : ");
             int k=s.nextInt();

             System.out.println("Kth Factor is : "+kthFactor(num,k));

    }

    public static int kthFactor(int num , int k)
    {
        int i=1;
             int count=0;
             while(num>=i)
            {
                if(num%i==0)
                {
                    count++;
                    if(count==k)
                    {    return i;    }
                    
                }
              i++;

            }
        return -1;    
    }
}
