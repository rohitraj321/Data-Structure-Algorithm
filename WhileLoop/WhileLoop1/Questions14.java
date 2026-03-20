public class Questions14 
{
    public static void main(String[] args) 
    {
       //WAJP to print and count all the numbers from 1 to 100 which are perfect cube.
       
       int num=1;
       int count=0;
       while(num*num*num<=100)
       {
        System.out.println(num +" = "+num*num*num);
        count++;
        num++;
       }

       System.out.println("Count is : "+count);

    }
}
