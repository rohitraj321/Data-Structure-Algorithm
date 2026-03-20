public class Questions10 
{
    public static void main(String[] args) 
    {
        // WAJP to print the sum of below series:
     //     1 ∗ 2 + 2 ∗ 3 + 3 ∗ 4 ... ... upto 100

          int num=1;
          int sum=0;

          while(num<=100)
          {
            sum=sum+num*++num;   // sum=sum+num*(num+1);
          }

          System.out.println("sum of  series : "+sum);
    }
}
