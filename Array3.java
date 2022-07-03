import java.lang.*;

class Array3
{
    public static void main(String arg[])
    {
        int arr[][]=new int[2][3];

        arr[0][0]=10;
        arr[0][1]=20;
        arr[0][2]=30;
        arr[1][0]=40;
        arr[1][1]=50;
        arr[1][2]=60;

        System.out.println("elements are : ");

            // arr.length       2
            // arr[0].langth    3
            // arr[1].length    3

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.println(arr[i][j]);
            }
        }
    }

}