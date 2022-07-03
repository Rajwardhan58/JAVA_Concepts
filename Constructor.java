import java.lang.*;

class Test
{
    public int i;
    public int j;

    public Test()
    {
        i=11;
        j=21;
    }


    public Test(int i,int j)
    {
        this.i=i;
        this.j=j;
    }

    public void function1()
    {
        System.out.println("Inside 1st Function");
    }

    public void function2()
    {
        System.out.println("Inside 2nd Function");
    }
}

class Constructor
{
    public static void main(String arr[])
    {
        Test tobj1=new Test();
        System.out.println(tobj1.i);
        System.out.println(tobj1.j);
        tobj1.function1();
        tobj1.function2();

        Test tobj2=new Test(51,101);
        System.out.println(tobj2.i);
        System.out.println(tobj2.j);
        tobj2.function1();
        tobj2.function2();
    }
}