package matrix;

/**
 * @date   :2016. 6. 22. 
 * @author :pakjkwan@gmail.com
 * @file   :MatrixMul5.java
 * @story  :
*/
public class MatrixMul5 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >0 ; j--) {
				if (i>=j) {
					System.out.print(j);
				} else {
					System.out.print(" ");
				}
			
			}
			System.out.println();
		}
	}
}
