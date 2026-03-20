import java.util.Scanner;

public class Questions20 
{
    public static void main(String[] args) 
    {
        // product sum diiference 
        // Given an integer number n, 
        // return the difference between the product of its digits and the sum of its digits.

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num=s.nextInt();
        int product=1;
        int sum=0;
        while(num>0)
        {
            int rem=num%10;
            product=product*rem;
            sum=sum+rem;

            num=num/10;
        }
        System.out.println("Product : "+product);
        System.out.println("Sum : "+sum);
        System.out.println("Diffrence of Product and sum is : "+(product-sum));
    }
}
