import java.util.Scanner;
public class Questions8 
{
    public static void main(String[] args) 
    {
        // WAP to take CP and SP and print %Profit or % Loss in the transaction.

        Scanner s=new Scanner(System.in);
        System.out.println("Enter CP : ");
        double CP=s.nextInt();
        System.out.println("Enter SP : ");
        double SP=s.nextInt();

        double Loss=CP-SP;
        double Profit=SP-CP;

        double LossPer=(Loss/CP)*100;
        double ProfitPer=(Profit/CP)*100;

        if(SP>CP)
            System.out.println("Profit Percent = "+ProfitPer);
        else if(CP>SP)
            System.out.println("Loss Percent = "+LossPer);

        else
            System.out.println("No Profit No Loss");

    }
}
