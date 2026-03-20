import java.util.Scanner;
public class Questions5 
{
    public static void main(String[] args) 
    {

    // WAP to check whether the three sides of a triangle is valid or not.    
          Scanner s=new Scanner(System.in);

          System.out.println("Enter three sides of Triangle : ");
          int a=s.nextInt();
          int b=s.nextInt();
          int c=s.nextInt();

          String result = (a+b>c && a+c>b && b+c>a)? " Triangle is Valid " : "Triangle is not valid ";

          System.out.println(result);
    }
    
}
