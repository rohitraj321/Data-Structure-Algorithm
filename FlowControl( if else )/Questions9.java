import java.util.Scanner;
public class Questions9 
{
    public static void main(String[] args) 
    {
        // WAP to take total shopping price and provide  discounted price as per below condition
            // 40% discount if price>=10000
            // 30% discount if price>=6000
            // 20% discount if price>=3000
            // 8% discount if price>=1

            Scanner s=new Scanner(System.in);
            System.out.println("Enter Total Shopping Price : ");
            double price=s.nextInt();
            double discount=0;

            if(price>=10000)
                discount=0.40;
            else if(price>=6000)
                discount=0.30;
            else if(price>=3000)
                discount=0.20;
            else
                discount=0.08;

            double discountprice=price*discount;
            double finalprice=price-discountprice;

            System.out.println("Discounted Amount : "+discountprice);
            System.out.println("Final Price : "+finalprice);

    }
}
