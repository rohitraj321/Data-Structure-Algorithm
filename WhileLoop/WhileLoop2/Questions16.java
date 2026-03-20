public class Questions16 
{
    public static void main(String[] args) 
    {
        // WAJP to print the sum of below series:
          // 1/1^2  + 1/2^2 + 1/3^2 .... upto 100
          
          int num=1;
          double sum=0;

          while(num<=100)
          {
            sum = sum + (1.0/(num*num));

            num++;
          }

          System.out.println("Sum of Series : "+sum);

    }
}
