/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class CircularRotateByOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrElements = {1,2,3,4,5};
		circularRotate(arrElements);
	}
	static void circularRotate(int[] arrElements){
		
		// x is last element in array
		int x = arrElements[arrElements.length-1], i;
	       for (i = arrElements.length-1; i > 0; i--)
	    	   arrElements[i] = arrElements[i-1];
	       arrElements[0] = x;
	    for(int y : arrElements){
	    	System.out.println(y);
	    }
	}
}
