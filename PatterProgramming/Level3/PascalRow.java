import java.util.*;
public class PascalRow 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Rows : ");
        int row=s.nextInt();
        pascalRow(row);
    }

    public static void pascalRow(int n)
    {
       int comb=1;
       System.out.print(comb+" ");
       
       for(int i=0; i<n; i++)
       {
          comb=comb*(n-i)/(i+1);

          System.out.print(comb +" ");
       }
    }
}
