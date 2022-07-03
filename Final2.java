import java.lang.*;
import java.util.*;

class Base
{
    public final int i;

    public Base()
    {
        i=11;
    }

    public void Fun1()
    {
        System.out.println("Inside base fun1");
    }
    public final void Fun2()
    {
         System.out.println("Inside base final fun2");
    }
}

class Derived extends Base
{
    public int j;
    public int k;

    public Derived(int j,int k)
    {
        this.j=j;
        this.k=k;
    }
    public void Fun1()
    {
        System.out.println(super.i);
        System.out.println("Inside Derived fun1");
    }
    /*public void Fun2()
    {
        System.out.println("Inside Derived fun2");
    }*/
}

class Final2
{
    public static void main(String arr[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the first value");
        int iValue1=sobj.nextInt();

        System.out.println("Enter the second number");
        int iValue2=sobj.nextInt();

        Base bobj=new Derived(iValue1,iValue2);     //upcasting
        bobj.Fun1();
        bobj.Fun2();
        //dobj.Fun2();
    }
}