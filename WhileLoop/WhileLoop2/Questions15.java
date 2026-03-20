public class Questions15 
{
    public static void main(String[] args) 
    {
        // WAJP to print the sum of below series:
          // 1/3 + 1/5 + 1/7 ... upto 100

          int num=1;
          double sum=0;

          while(num<=100)
          {
            sum=sum+(1.0/num);

            num=num+2;
          }

          System.out.println("Sum of Series : "+sum);

    }
}
