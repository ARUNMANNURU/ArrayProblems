/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class ReverseArrayRotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrElements = {1,2,3,4,5,6,7};
		leftRotate(arrElements, 2); // Rotate array by 2
        printArray(arrElements);
	}
	/* Function to left rotate arr[] of size n by d */
    static void leftRotate(int arr[], int d)
    {
        int n = arr.length;
        rvereseArray(arr, 0, d-1);
        rvereseArray(arr, d, n-1);
        rvereseArray(arr, 0, n-1);
    }
 
    /*Function to reverse arr[] from index start to end*/
    static void rvereseArray(int arr[], int start, int end)
    {
        int temp;
        while (start < end)
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
 
    /*UTILITY FUNCTIONS*/
    /* function to print an array */
    static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
