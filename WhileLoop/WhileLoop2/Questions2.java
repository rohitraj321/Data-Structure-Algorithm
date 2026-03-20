
public class Questions2 
{
    public static void main(String[] args) 
    {
        // WAJP to print sum of all Even numbers from 1 to 100.
        int num=1;
        int sum=0;
        while(num<=100)
        {
            if(num%2==0)
            {
                sum=sum+num;
            }
            num++;
        }

        System.out.println("Sum of Even Number from 1to 100 are : "+sum);


    }
}
