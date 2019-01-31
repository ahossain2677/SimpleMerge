/**
 * Created by Teacher on 1/28/2019.
 * simpleMerge takes in two sorted arrays of
 * integers and merges them to return one sorted
 * array of integers.
 */
public class SimpleMerge {
    
int[] arr3 = new int [arr1.length + arr2.length];       // combines array 1 and 2 
    
   static int sort(int[] arr3, int ind)      //Selection sort used on the array 3 
    {
        int minInd = ind;

        for (int i = ind; i <arr.length; i++)
        {
            if (arr[i] < arr[minInd])
            {
                swap(arr,i,minInd);
                {
                minInd = i;
                }

            }

        }
        return minInd;
    }
    // Swap method to switch vales arr[i] an arr[j]
    public static void swap(int[] arr, int i , int j)
    {
        int x = arr[i];
        arr[i] = arr[j];
        arr[j] = x;

    }
    public static void int minInd(int [] arr, int minInd )
    {
        int min = arr[minInd];
        for (int i = minInd; i<arr.length;i++)
        {
            if (arr[i] < minInd){
                minInd = arr[i];
            }
            return minInd;
        
}
}
    
    
