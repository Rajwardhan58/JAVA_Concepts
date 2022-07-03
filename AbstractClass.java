import java.lang.*;

abstract class Base
{
    public void fun1()
    {
        System.out.println("Inside Base fun1");
    }
    public void fun2()
    {
        System.out.println("Inside Base fun2");
    }
    public abstract void fun3();             //Abstract 
}

class Derived extends Base
{
     public void fun3()
    {
        System.out.println("Inside derived fun3");
    }
    public void fun4()
    {
        System.out.println("Inside Derived fun4");
    }
}

class AbstractClass
{
    public static void main(String args[])
    {
        Derived dobj=new Derived();
        dobj.fun1();
        dobj.fun2();
        dobj.fun3();
        dobj.fun4();
    }
}