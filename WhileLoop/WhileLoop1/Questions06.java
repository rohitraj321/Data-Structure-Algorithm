//package WhileLoop.WhileLoop1;

public class Questions6 
{
     //static int count=0;
    public static void main(String[] args) 
    {
        //WAJP to print and count all the numbers from 1 to 100 which are divisible by 7.

        int num=1;
        int count=0;
       
        while(num<=100)
        {
            if(num%7==0){
                System.out.println(num);
            count++;
        }
            num++;
    } 
        System.out.println("Count = "+count);
    }
}
