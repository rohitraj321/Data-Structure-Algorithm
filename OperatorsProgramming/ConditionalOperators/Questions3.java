import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;
public class Questions3 
{
    public static void main(String[] args) 
    {
        //WAP to check and print the given number is divisible by both 3 and 5 or only by 3, only by 5 or None.

        Scanner s=new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int n=s.nextInt();

        String result = n%5==0 && n%3==0? "Number is divisible by 3 and 5 both ": 
                        n%3==0? "Number is divisible by 3 only " :
                        n%5==0? "Number is divisible by 5 only " :
                        "Divisible by None ";


                        System.out.println(n +" is : "+result);
    }
}
