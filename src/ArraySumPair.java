/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class ArraySumPair {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrEle = {2,3,5,1,9,0};
		int x = 9;
		sumPair(arrEle,x);
	}
	static void sumPair(int[] arrEle,int x){
		// Find the pivot element
	    int i,n = arrEle.length;
	    for (i=0; i<n-1; i++)
	        if (arrEle[i] > arrEle[i+1])
	            break;
	    int l = (i+1)%n;  // l is now index of minimum element
	    int r = i;        // r is now index of maximum element
	 
	    // Keep moving either l or r till they meet
	    while (l != r)
	    {
	         // If we find a pair with sum x, we return true
	         if (arrEle[l] + arrEle[r] == x)
	              System.out.println("True");
	 
	         // If current pair sum is less, move to the higher sum
	         if (arrEle[l] + arrEle[r] < x)
	              l = (l + 1)%n;
	         else  // Move to the lower sum side
	              r = (n + r - 1)%n;
	         
	    }
	    System.out.println("False");
	}

}
