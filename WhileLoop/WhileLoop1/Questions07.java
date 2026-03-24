//package WhileLoop.WhileLoop1;

public class Questions7 
{
    public static void main(String[] args) 
    {
        //WAJP to count all the numbers from 1 to 100 which are divisible by 7.

        int num=1;
        int count=0;

        while(num<=100)
        {
            if(num%7==0)
            {
                count++;
            }
            num++;
        }
        System.out.println("Count = "+count);
    }
}
