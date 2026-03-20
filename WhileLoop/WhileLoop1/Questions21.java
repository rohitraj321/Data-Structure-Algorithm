import java.util.Scanner;

public class Questions21 {
     public static void main(String[] args) 
    {
        
    
        // Common factor;
    //  Given two positive integers a and b, return the number of common factors of a and b.
    // An integer x is a common factor of a and b if x divides both a and b.


             Scanner s=new Scanner(System.in);
             System.out.println("Enter a : ");
             int a=s.nextInt();
             System.out.println("Enter b: ");
             int b=s.nextInt();
             System.out.print("Common Factor are : ");
             System.out.println("\n Number of Common Factor of a and b are : "+CommonFactor(a,b));

            
    }

    public static int CommonFactor(int a , int b)
    {
        int i=1;
        int count=0;
        while((a>b?b:a)>=i)
        {
            if(a%i==0 && b%i==0)
            {
                System.out.print( i +" ,");
                count++;
            }
            i++;
        }
        return count;
    }
    
}
