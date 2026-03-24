
public class Questions3 
{
    public static void main(String[] args) 
    {

        // WAJP to print sum of all Odd numbers from 1 to 100.
        int num=1;
        int sum=0;

        while(num<=100)
        {
            if(num%2==1)
            {
                sum=sum+num;
            }
            num++;
        }
        System.out.println("Sum of Odd Number from 1 to 100 are : "+sum);
    }
}
