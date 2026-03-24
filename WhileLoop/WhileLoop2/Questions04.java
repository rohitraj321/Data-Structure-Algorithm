
public class Questions4 
{
     public static void main(String[] args) 
    {
        // WAJP to print sum of squares of all natural numbers from 1 to 100.

        int num=1;
        int sum=0;
        while(num<=100)
        {
            sum=sum+num*num;

             num++;
        }
        System.out.println("Sum of Square of all natural number from 1 to 100 are : "+sum);
       
    }
}
