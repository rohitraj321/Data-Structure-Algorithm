public class Questions9 
{
    public static void main(String[] args) 
    {
 // WAJP to print and count all the numbers from 1 to 1000 which are divisible by 7 and also ends with 7.
       
         int num=1;
         int count=0;
         while(num<=1000)
         {
            if(num%7==0 && num%10==7)
            {
                System.out.println(num);
                count++;
            }
            num++;
         }

          System.out.println("Count : "+count);


    }
}
