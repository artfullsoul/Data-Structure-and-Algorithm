import java.util.*;
class Reverse
{
    // 10 , 5 , 6 , 2
    //  0 , 1 , 2 , 3
    //  s ,   ,   , e(e=n-1)
    public int[] reverse(int arr[], int size)
    {
        int start = 0, end = size-1;
        while(start < end)
        {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start ++;
            end--;
        }
        return arr;
    }
    
}
public class Main
{
    public static void main(String args [])
    {
        Reverse ob = new Reverse();
        int arr[] = {10,5,6,2};
        int size = 4;
        int returnedArray[] = ob.reverse(arr,size);
        for(int i=0;i<4;i++)
        {
            System.out.println(arr[i]);
        }
    }
}