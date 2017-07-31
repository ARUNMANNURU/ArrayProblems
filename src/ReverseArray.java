/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class ReverseArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrEle = {2,3,4,5};
		//reverseArray(arrEle);
		reverseArrayEle(arrEle);
	}
	static void reverseArrayEle(int[] arrEle){
		int len = arrEle.length;
		for(int i=0; i < arrEle.length; i++){
			int temp = arrEle[i];
			arrEle[i]= arrEle[len-i-1];
			arrEle[len-i-1]= temp;
		}
		for(int x :arrEle){
			System.out.println(x);
		}
	}
	/*static void reverseArray(int[] arrEle){
		
		int start = 0;
		int end = arrEle.length-1;
		
		while(start < end){
			int temp = arrEle[start];
			arrEle[start] = arrEle[end];
			arrEle[end]  = temp;
			start++;
			end--;
		}
		for(int x : arrEle){
			System.out.println(x);
		}
	}*/
}
