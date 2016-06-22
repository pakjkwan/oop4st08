package matrix;

/**
 * @date   :2016. 6. 22. 
 * @author :pakjkwan@gmail.com
 * @file   :Matrix5.java
 * @story  :
*/
public class SimpleArr {
	public static void main(String[] args) {
		int []arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+"\t");
		}
	}
}
