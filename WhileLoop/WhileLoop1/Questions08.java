//package WhileLoop.WhileLoop1;

public class Questions8 
{
    public static void main(String[] args) 
    {
        //WAJP to print and count all the numbers from 1 to 100 which are divisible by 7 or ends with 7.
         
        int num=1;
        int count=0;

        while(num<=100)
        {
            if(num%7==0 || num%10==7)
            {
                System.out.println(num);
                count++;
            }
            num++;
        }

        System.out.println("Count = "+count);
    }
}
