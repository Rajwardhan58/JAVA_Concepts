import java.lang.*;
import java.util.*;

class Base
{
    public int i;
    public int j;

    public Base()
    {
        this.i=11;
        this.j=21;
    }
    public Base(int i, int j)
    {
        this.i = i;
        this.j = j;
    }
    public void Function1()
    {
        System.out.println("inside base function");

    }
    public void Function2()
    {
        System.out.println("inside base function");

    }
}

class Derived extends Base
{
    public char cValue1;
    public char cValue2;

    public Derived(char cValue1,char cValue2)
    {
        super(51,101);                      //used to initialize base class of current class |  Derived::Base(51,101)
        this.cValue1=cValue1;
        this.cValue2=cValue2;
    }
    public void Function3()
    {
        System.out.println("inside Derived function");
        super.Function1();
        System.out.println(super.i);
    }
    public void Function4()
    {
        System.out.println("inside Derived function");

    }
}

class Inheritance2
{
    public static void main(String arr[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the first character");
        char cValue1=sobj.next().charAt(0);

        System.out.println("Enter the second character");
        char cValue2=sobj.next().charAt(0);

        Derived dobj=new Derived(cValue1,cValue2);
        dobj.Function1();
        dobj.Function2();
        dobj.Function3();
        dobj.Function4();
    }
}
