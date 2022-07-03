import java.lang.*;
import java.util.*;

interface Circle
{
    float PI=3.14f;                   //public static final float PI=3.14

    float CalculateArea(float Radious);              //public abstract float CalculateArea(float Radious);
    float CalculateCircumfarance(float Radious);     //public abstract float CalculateCircumfarance(float Radious);
}

class Calculate implements Circle
{
    public float CalculateArea(float Radious)
    {
        return(PI*Radious*Radious);
    }
    public float CalculateCircumfarance(float Radious)
    {
        return(2*PI*Radious);
    }
}

class Interface
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the Radious");
        float iRadious=sobj.nextFloat();
        float fRet;
        Calculate cobj=new Calculate();

        fRet=cobj.CalculateArea(iRadious);
        System.out.println("Area of circle is "+fRet);
        
        fRet=cobj.CalculateCircumfarance(iRadious);
        System.out.println("Circumfarance of circle is "+fRet);
    }
}