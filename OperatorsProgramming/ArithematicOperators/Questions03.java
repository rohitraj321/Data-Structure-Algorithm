public class Questions3 {
    public static void main(String args[])
    {  
         // WAP to swap two numbers.
         // With using a third variable
         // Without using third variable

         int a=10;
         int b=20;
         System.out.println("Before Swaping a= "+a + " and b= "+b);

         //using 3rd variable
        //  int temp;
        //  temp=a;
        //  a=b;
        //  b=temp;
        // System.out.println("After Swaping a= "+a +" and b= "+b);


         //without using 3rd variable
         a=a^b;
         b=a^b;
         a=a^b;
         System.out.println("After Swaping a= "+a +" and b= "+b);
         
        

    }
    
}
