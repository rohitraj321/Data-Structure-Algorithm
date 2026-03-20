public class Questions27 
{
    public static void main(String[] args) 
    {
        int x=5, y=7, z=3;
        int result=(x>y) ? (x>z? x:z) : (y>z ? y:z);
        System.out.println(result);
    }
}
