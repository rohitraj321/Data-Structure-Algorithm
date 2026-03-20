import java.util.Scanner;
public class Questions34 
{
    public static void main(String[] args) 
    {
        //WAJP to take a user input and return true if any two adjacent numbers are not same.
            //  Input: N=4207065;  and Output:  true

            Scanner s=new Scanner(System.in);
            System.out.println("Enter the Number : ");
            int num=s.nextInt();

            if(isAdjacent(num))
                System.out.println("Adjacent digit are Alternate ");
            else
                 System.out.println("Adjacent digit are not Alternate ");
            


    }

    public static boolean isAdjacent(int num)
    {
         int prev=num%10;
         num=num/10;

         while(num>0)
         {
            int next=num%10;
            if(prev==next)
                return false;

            prev=next;
            num=num/10;
         }
         return true;

    }
}
