import java.lang.*;
import java.util.*;

class Test
{
    public int i;
    public final int j;
    public final int k=31;

    public Test(int i,int j)
    {
        this.i=i;
        this.j=j;
    }

    public void Fun1()
    {
        i++;
        //j++;  NA
        //k++;  NA
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }
}

class Final1
{
    public static void main(String arr[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the first value");
        int iValue1=sobj.nextInt();

        System.out.println("Enter the second number");
        int iValue2=sobj.nextInt();

        Test tobj=new Test(iValue1,iValue2);
        tobj.Fun1();

    }
}