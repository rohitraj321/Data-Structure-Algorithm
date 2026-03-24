public class Questions8 
{
    public static void main(String[] args) 
    {
        // WAJP to print sum of squares of all odd numbers from 1 to 100.

        int num=1;
        int sum=0;

        while(num<=100)
        {
            if(num%2==1)
                sum=sum+num*num;

            num++;

        }
        System.out.println("Sum of squares of all odd numbers from 1 to 100 : "+sum);

    }
}
