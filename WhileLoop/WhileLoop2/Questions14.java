public class Questions14 
{
    public static void main(String[] args) 
    {
        // WAJP to print the sum of below series:
          // 1/2 + 1/4 + 1/6 + 1/8 .... upto 100

          int num=2;
          double sum=0;

          while(num<=100)
          {
             
                sum=sum+ (1.0/num);

            num=num+2;
          }

        System.out.println("Sum of Series : " +sum);

    }
}
