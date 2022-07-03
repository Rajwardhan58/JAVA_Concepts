import java.lang.*;
import java.util.*;

class Test
{
    public int i;
    public int j;
    public static int k;

    static
    {
        k=31;
    }

    public Test()
    {
        i=1;
        j=11;
    }

    public Test(int i,int j)
    {
        this.i=i;
        this.j=j;
    }

    public static void function1()
    {
        System.out.println("Inside static function");
        System.out.println(k);                          //static function can access only static values
    }

    public void function2()
    {
        System.out.println("Inside non static function");   //non static function access static or non static values
        System.out.println(i);
        System.out.println(j);
        System.out.println(++k);
        //   function1();               it can access static function also
    }
}

class Static
{
    public static void main(String arr[])
    {
        Scanner sobj=new Scanner(System.in);
        
        System.out.println("Enter the first value");
        int i=sobj.nextInt();

        System.out.println("Enter the second value");
        int j=sobj.nextInt();

        Test tobj1=new Test(i,j);
        Test.function1();
        tobj1.function2();

    }
}