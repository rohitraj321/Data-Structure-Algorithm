import java.util.*;
public class Questions266 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Number of rows : "); 
        int rows=s.nextInt();

         printpattern(rows);
    }

    public static void printpattern(int n)
    {
        int mid=n/2+1; 
        int StartSpace=n/2;
        int EndStar=5*n/2;
        int mSStar=n+2;    int mEStar=2*n-1;

        for(int i=1; i<=n; i++)
        {
                      // Section 1 
                  for(int j=1; j<=mid; j++)
                 {
                     if(j<=StartSpace)
                       System.out.print("  ");
                     else
                       System.out.print("* ");
                 }
                     // Section 2
                 for(int j=mid+1; j<=n+1; j++)
                 {
                    if(i==1 || j==n+1 && i<=mid)
                        System.out.print("@ ");
                    else
                        System.out.print("  ");
                 }  
                     //  Section 3 
                 for(int j=n+2; j<=2*n-1; j++)
                 {
                     if(i>mid && j>=mSStar  && j<=mEStar)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                 }  
                     // Section 4
                 for(int j=2*n; j<=5*n/2; j++)  
                 {
                    if(i==1 || j==2*n && i<=mid)
                        System.out.print("@ ");
                    else
                        System.out.print("  ");
                  }
                  // Section 5
                  for(int j=5*n/2+1; j<=EndStar; j++)
                  {
                    System.out.print("* ");
                  }
                 

            if(i<mid)
             {
                StartSpace--;
                EndStar++;
             }
            else  
             {
                StartSpace++;
                EndStar--;
             } 
             if(i>mid)
                {
                    mSStar++;
                    mEStar--;
                } 
             
             System.out.println();  
             
        }
    }
}
