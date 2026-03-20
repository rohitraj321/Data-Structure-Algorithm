public class Questions13 
{
    public static void main(String[] args) 
    {
        //WAJP to print all the numbers from 1 to 100 which are perfect cube.

        int n=1;
        while(n*n*n<=100)
        {
            System.out.println(n +" = " +n*n*n);
            n++;
        }

    }
}
