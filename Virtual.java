import java.lang.*;
import java.util.*;

class Base
{
    public int i;
    public int j;

    public Base(int i,int j)
    {
        this.i=i;
        this.j=j;
    }

    public void Fun1()
    {
        System.out.println("Inside Base class Fun1");
    }
    public void Fun2()
    {
        System.out.println("Inside Base class Fun2");
    }
    public void Fun3()
    {
        System.out.println("Inside Base class Fun3");
    }
}

class Derived extends Base
{
    public int a;
    public int b;

    public Derived(int a,int b)
    {
        super(11,21);
        this.a=a;
        this.b=b;
    }

    public void Fun1()
    {
        System.out.println("Inside Derived class Fun1");
    }
    public void Fun4()
    {
        System.out.println("Inside Derived class Fun4");
    }
    public void Fun3()
    {
        System.out.println("Inside Derived class Fun3");
    }
}

class Virtual
{
    public static void main(String arr[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the first number");
        int i=sobj.nextInt();

        System.out.println("Enter the second number");
        int j=sobj.nextInt();

        Base bobj=new Derived(i,j);             //upcasting
        bobj.Fun1();
        bobj.Fun2();
        bobj.Fun3();
        //bobj.Fun4();      NA

    }
}