import java.util.*;
public class LeetCodePascalTriangleList 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter rows : ");
        int rows=s.nextInt();
        System.out.println(pascalTriangle(rows));

    }

    public static List<List<Integer>> pascalTriangle(int n)
    {
        List<List<Integer>> pascal=new ArrayList<>();
          for(int i=1; i<=n; i++)
          {
             pascal.add(pascalRow(i));
          }
          return pascal;
    }

    public static List<Integer> pascalRow(int n)
    {
        List<Integer> l=new ArrayList<>();
        int comb=1;
        l.add(comb);
        for(int i=0; i<n; i++)
        {
            comb=comb*(n-i)/(i+1);
            l.add(comb);
        }
        return l;
    }
}
