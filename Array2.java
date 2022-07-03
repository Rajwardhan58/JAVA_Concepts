import java.lang.*;
import java.util.*;

class Array2
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the size of array");
        int iSize=sobj.nextInt();
        int iCnt=0;

        int arr[]=new int[iSize];

        System.out.println("Enter "+iSize+" elements in array");

        for(iCnt=0;iCnt<arr.length;iCnt++)
        {
            arr[iCnt]=sobj.nextInt();
        }

        System.out.println("Elements in array are : ");

        for(iCnt=0;iCnt<arr.length;iCnt++)
        {
            System.out.println(arr[iCnt]);
        }
    }
}