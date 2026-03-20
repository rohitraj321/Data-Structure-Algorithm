public class Questions11 
{
    public static void main(String[] args) 
    {
        // WAJP to print the sum of below series:
         //    1 ∗ 2^2 + 2+3^2 + 3*4^2 +... ... upto 100 
         
         int num=1;
         int sum=0;

         while(num<=100)
         {
            sum=sum+num*(num+1)*(num+1);

            num++;
         }

         System.out.println("Sum of Series : "+sum);
          
        
    }
}
