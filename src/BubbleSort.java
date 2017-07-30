/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrEle = {3,2,9,5};
		sortArray(arrEle);
	}
	static void sortArray(int[] arrEle){
		
		int len = arrEle.length;
		for(int i=0; i < arrEle.length; i++){
			for(int j=0; j < arrEle.length; j++){
				if(arrEle[i] < arrEle[j]){
					int temp = arrEle[i];
					arrEle[i] = arrEle[j];
					arrEle[j] = temp;
				}
			}
		}
		for(int x : arrEle){
			System.out.println(x);
		}
	}
}
