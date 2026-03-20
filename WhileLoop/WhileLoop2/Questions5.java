
public class Questions5 
{
    public static void main(String[] args) 
    {
        // WAJP to print sum of cubes of all natural numbers from 1 to 100.
          int num=1;
        int sum=0;
        while(num<=100)
        {
            sum=sum+num*num*num;

             num++;
        }
        System.out.println("Sum of Cube of all natural number from 1 to 100 are : "+sum);
    }
}
