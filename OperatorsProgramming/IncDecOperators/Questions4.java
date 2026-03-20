//package OperatorsProgramming.IncDecOperators;

public class Questions4 
{
    public static void main(String args[])
    {
        int a=12;
        int b=a++;
        b++;
        int c=a++ + --b;
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("c: "+c);
    }
}
