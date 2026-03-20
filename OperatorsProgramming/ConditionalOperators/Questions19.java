import java.util.Scanner;
public class Questions19 
{
    public static void main(String[] args) 
    {
        // Test the Rank of a student

        Scanner s=new Scanner(System.in);

        System.out.println("Enter the Marks ");
        int marks=s.nextInt();

       String result = (marks>=75)? "Distinction " : 
                        (marks>=60)? "First Class " : 
                        (marks>=50)? "Second Class " : 
                        (marks>=35)? "Pass " : "Fail ";

                        System.out.println(marks +" = " +result);

    }
}
