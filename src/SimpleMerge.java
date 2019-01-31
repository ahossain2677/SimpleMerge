/**
 * Created by Teacher on 1/28/2019.
 * simpleMerge takes in two sorted arrays of
 * integers and merges them to return one sorted
 * array of integers.
 */
public void SimpleMerge {
    
        public void mergeSort(int[] arr )
        {
            int n = arr.length;
            int[] temp = new int[n];
            mergeSortHelper(arr, 0 , n-1, temp);
        }

    public void MergeSortHelper(int[] arr, int left, int right, int[] temp)
    {
        if(left < right)
        {
            int mid = (left + right)/2;
            mergeSortHelper(ar, left,mid, temp);
            mergeSortHelper(arr, mid+1 , right, temp);
            merge(arr, left, mid, right, temp);
        }

}
