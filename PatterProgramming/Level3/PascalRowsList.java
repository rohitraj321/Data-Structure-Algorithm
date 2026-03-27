import java.util.*;
public class PascalRowsList 
{
    public static void main(String[] args) 
    {
      
       System.out.println(pascalrow(4));
    }

    public static List<Integer> pascalrow(int n)
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
