public class Questions11 
{
    public static void main(String[] args) 
    {
        // WAJP to print and count all the numbers from 1 to 100 which are perfect square.

            int num=1;
            int count=0;

            while(num*num<=100)
            {
                System.out.println(num*num);
                count++;
                num++;
            }

            System.out.println("Count : "+count);
    }
}
