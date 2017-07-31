/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class MaximumSumAmongAllRotations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrEle = {8,2,3,1};
		int len = arrEle.length;
		System.out.println(maxSum(arrEle,len));
	}
	static int maxSum(int[] arrEle,int n){
		// Initialize result
		   int res = Integer.MIN_VALUE;
		 
		   // Consider rotation beginning with i
		   // for all possible values of i.
		   for (int i=0; i<n; i++)
		   {
		 
		     // Initialize sum of current rotation
		     int curr_sum = 0;
		 
		     // Compute sum of all values. We don't
		     // acutally rotation the array, but compute
		     // sum by finding ndexes when arr[i] is
		     // first element
		     for (int j=0; j<n; j++)
		     {
		         int index = (i+j)%n;
		         curr_sum += j*arrEle[index];
		     }
		 
		     // Update result if required
		     res = Math.max(res, curr_sum);
		   }
		 
		   return res;
		
	}
}
