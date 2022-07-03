import java.lang.*;
import java.util.*;

class Array4
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        int arr[][]=new int[3][];

        arr[0]=new int[3];
        arr[1]=new int[5];
        arr[2]=new int[4];

        System.out.println("Enter the elements");

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=sobj.nextInt();
            }
        }

        System.out.println("Entered elements are");

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
}