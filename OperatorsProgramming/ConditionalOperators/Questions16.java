import java.util.Scanner;
public class Questions16 
{
    public static void main(String[] args) 
    {
        // Given three numbers, print them in sorted order (ascending)

        Scanner s=new Scanner(System.in);

        System.out.println("Enter the three number ");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();

        int biggest = (a>b && a>c)?a:(b>c)?b:c;

        int smallest = (a<b && a<c)? a : (b<c)?b:c;

        int secondLargest = (a+b+c)-biggest-smallest;

        System.out.println("Number in Ascending/Sorted Order ");
        System.out.println(smallest +"\t" +secondLargest +"\t" +biggest);
    }
}
