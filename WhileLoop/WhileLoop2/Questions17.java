public class Questions17 
{
    public static void main(String[] args) 
    {
        // WAJP to print the sum of below series:
          // 1/1^3  + 1/2^3 + 1/3^3 .... upto 100

          int num=1;
          double sum=0;

          while(num<=100)
          {
            sum = sum + 1.0/(num*num*num);   //  sum= sum+  1.0/Math.pow(num,3)

            num++;
          }

          System.out.println("Sum of Series : "+sum);

    }
}
