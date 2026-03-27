import java.util.*;
public class Questions262 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the rows : ");
        int rows=s.nextInt();
        pascalTriangle(rows);
        
    }

    public static void pascalTriangle(int n)
    {
        int space=n-1;
        for(int i=0; i<n; i++)
        {
            for(int j=1; j<=space; j++)
                System.out.print("   ");

            pascalrow(i);
            space--;
            System.out.println();
        }

    }

    public static void pascalrow(int n)
    {
        int comb=1;
        System.out.printf("%6d",comb);
        for(int i=0; i<n; i++)
        {
            comb=comb*(n-i)/(i+1);

            System.out.printf("%6d",comb);
        }
    }
}
