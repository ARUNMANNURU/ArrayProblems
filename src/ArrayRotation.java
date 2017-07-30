/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class ArrayRotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrElements = {1,2,3,4,5,6,7};
		leftRotate(arrElements, 2, 7);
        printArray(arrElements,7);
	}
	/*Function to left rotate arr[] of size n by d*/
    static void leftRotate(int arr[], int d, int n) 
    {
        int i;
        for (i = 0; i < d; i++)
            leftRotatebyOne(arr, n);
    }
 
   static void leftRotatebyOne(int arr[], int n) 
    {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[i] = temp;
    }
 
    /* utility function to print an array */
   static void printArray(int arr[], int size) 
    {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }
}
