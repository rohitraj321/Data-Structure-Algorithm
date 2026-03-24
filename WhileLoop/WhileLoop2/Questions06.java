public class Questions6 
{
    public static void main(String[] args) 
    {
        // WAJP to print sum of squares of all even numbers from 1 to 100.

        int num=1;
        int sum=0;
        while(num<=100)
        {
            if(num%2==0)
                sum=sum+num*num;

            num++;
            
        }

        System.out.println("sum of squares of all even numbers from 1 to 100 : "+sum);
    }
}
