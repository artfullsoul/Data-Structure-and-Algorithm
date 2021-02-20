//  Tournament Method Using Divide & Conquer
//  2 , 5 , 3 , 8 , 16 , 4 (low->0 , high->5 , mid-> 0+5/2=2)
//  2 , 5 (low->0 , high->1)  3 , 8 , 16 , 4    

class MinMaxOfArray 
{
    //Static Pairs of max and min to avoid recreation of max and min variables
    static class Pair
    {
        int max;
        int min;
    }

    //function to find out the max and min values
    //Here we would be dividing the array into two parts i.e left and right
    public Pair getMaxMin(int arr[], int low , int high)
    {
        Pair maxmin = new Pair();
        Pair maxminLeft = new Pair();
        Pair maxminRight = new Pair();

        //This case would work when there would be odd number of variables in the array
        if(low==high)
        {
            maxmin.max=arr[low];
            maxmin.min=arr[low];
            return maxmin;    
        }
        //This case Would work when there are even number of variables in the array
        if(high == (low+1))
        {
            if(arr[low]>arr[high])
            {
                maxmin.max=arr[low];
                maxmin.min=arr[high];
            }
            else
            {
                maxmin.min=arr[low];
                maxmin.max=arr[high];
            }
            return maxmin;
        }

        int mid=(low+high)/2;
        maxminLeft = getMaxMin(arr, low, mid);
        maxminRight = getMaxMin(arr, mid+1, high);

        if(maxminLeft.min > maxminRight.min)
            maxmin.min=maxminRight.min;
        else
            maxmin.min=maxminLeft.min;

        if(maxminLeft.max < maxminRight.max)
            maxmin.max=maxminRight.max;
        else
            maxmin.max=maxminLeft.max;
        
        return maxmin;
    }
    public static void main(String[] args)
    {
        int arr[] = {10 , 5 , 6 , 2 , 12 };
        int low = 0, high =arr.length-1;
        Pair ob = new Pair();
        MinMaxOfArray ob1 = new MinMaxOfArray();
        ob = ob1.getMaxMin(arr , low , high);
        System.out.println(ob.max);
        
        System.out.println(ob.min);
    }
    
}
