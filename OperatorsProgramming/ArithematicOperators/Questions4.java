public class Questions4
{
    public static void main(String[] args) 
    {
      // For the given three numbers. Swap 1st into 2nd,2nd into 3rd and 3rd into 1st number.
      // a. With using fourth variable
      // b. Without using fourth variable

      int a=10; int b=20; int c=30;

      //a. with using 4th variable
/*       
       int temp;
      System.out.println("Before Swapping "+"\n a= "+a+" b= "+b +" c= "+c);
      temp=a;
      a=c;
      c=b;
      b=temp;
      System.out.println("After Swapping"+"\n a= "+a+" b= "+b +" c= "+c);
*/
      //b. Without using fourth variable
        System.out.println("Before Swapping "+"\n a= "+a+" b= "+b +" c= "+c);
      a=a+b+c;
      b=a-(b+c);
      c=a-(b+c);
      a=a-(b+c);
        System.out.println("After Swapping"+"\n a= "+a+" b= "+b +" c= "+c);


    }
}
