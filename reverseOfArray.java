import java.util.*;
// Reverse an array by swapping the first and last digit and then 
// Incrementing start by +1
// and decrementing end by -1
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
// To reverse an array using recursion
class ReverseThroughRecursion
{
    public void reverse(int arr[],int start,int end)
    {
        if(start>=end)
        {
            return ;
        }
        else
        {
            int temp=arr[start];
            arr[start] =arr[end];
            arr[end] = temp;
            reverse(arr, start+1, end-1);
        }
    }
}
class Main
{
    public static void main(String args [])
    {
        Reverse ob = new Reverse();
        ReverseThroughRecursion ob1 = new ReverseThroughRecursion();
        int arr[] = {10,5,3,6,2};
        int size = arr.length;
        // int returnedArray[] = ob.reverse(arr,size);
        ob1.reverse(arr,0,size-1);
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
    }
}