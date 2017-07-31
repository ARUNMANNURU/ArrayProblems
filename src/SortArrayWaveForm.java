/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class SortArrayWaveForm {

	/**
	 * @param args
	 */
	/*
	 * Given an unsorted array of integers, sort the array into a wave like array.
	 * An array ‘arr[0..n-1]’ is sorted in wave form if arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4] >= …..
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrEle = {20, 10, 8, 6, 4, 2};
		int n = arrEle.length;
		sortInWave(arrEle,n);
	}
	// This function sorts arr[0..n-1] in wave form, i.e.,
    // arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4]....
    static void sortInWave(int arr[], int n)
    {
        // Traverse all even elements
        for (int i = 0; i < n; i+=2)
        {
            // If current even element is smaller
            // than previous
            if (i>0 && arr[i-1] > arr[i] )
                swap(arr, i-1, i);
 
            // If current even element is smaller
            // than next
            if (i<n-1 && arr[i] < arr[i+1] )
                swap(arr, i, i + 1);
        }
        for(int x : arr){
        	System.out.println(x);
        }
    }
	// A utility method to swap two numbers.
    static void swap(int arr[], int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
