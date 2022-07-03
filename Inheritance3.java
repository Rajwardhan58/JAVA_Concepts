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

    protected void Function1()
    {
        System.out.println("Inside base class function1");
    }

    public void Function2()
    {
        System.out.println("Inside base class function2");
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

    protected void Function3()
    {
        System.out.println("Inside derived class function3");
    }

    public void Function4()
    {
        System.out.println("Inside derived class function4");
    }
}

class DerivedX extends Derived
{
    public int x;
    public int y;

    public DerivedX(int x,int y)
    {
        super(11,21);
        this.x=x;
        this.y=y;
    }

    public void Function5()
    {
        System.out.println("Inside derivedx class function5");
    }

    public void Function6()
    {
        System.out.println("Inside derivedx class function6");
    }
}


class Inheritance3
{
    public static void main(String arr[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the first number");
        int i=sobj.nextInt();

        System.out.println("Enter the second number");
        int j=sobj.nextInt();

        DerivedX dobj=new DerivedX(i,j);
        dobj.Function1();
        dobj.Function2();
        dobj.Function3();
        dobj.Function4();
        dobj.Function5();
        dobj.Function6();

    }
}