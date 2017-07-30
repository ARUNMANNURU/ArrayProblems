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
		rotateArray(arrElements,2);
	}
	static void rotateArray(int[] arrElements,int d){
		
		int len = arrElements.length;
		int[] finalArray = new int[len];
		int k=0;
		for(int j=d; j < len; j++){
			finalArray[k] = arrElements[j];
			k++;
		}
		int m=0;
		for(int l=len-d; l < len; l++){
			finalArray[l] = arrElements[m];
			m++;
		}
		for(int x: finalArray){
			System.out.println(x);
		}
	}
}
