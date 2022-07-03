import java.lang.*;
import java.util.*;

class Test
{
    
    public void Addition(int i,int j)
    {
        System.out.println(i+j);
    }
    public void Addition(int i,int j,int k)
    {
        System.out.println(i+j+k);
    }
}

class Overloading
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the first value");
        int iValue1=sobj.nextInt();
        System.out.println("Enter the second value");
        int iValue2=sobj.nextInt();
        System.out.println("Enter the Third value");
        int iValue3=sobj.nextInt();

        Test tobj=new Test();
        tobj.Addition(iValue1,iValue2);
        tobj.Addition(iValue1,iValue2,iValue3);
        
    }
}