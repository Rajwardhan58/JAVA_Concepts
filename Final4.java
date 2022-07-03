import java.lang.*;

final class Base
{
    public void Fun()
    {
        System.out.println("Inside base fun");
    }
}

class Derived 
{
    public Base bobj=new Base();        //composition

    public void Gun()
    {
        System.out.println("Inside Derived gun");
    }
}

class Final4
{
    public static void main(String args[])
    {
        Derived dobj=new Derived();
        dobj.bobj.Fun();
        dobj.Gun();
    }
}