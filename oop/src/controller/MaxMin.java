/**
 * 
 */
package controller;

import java.util.Scanner;

/**
 * @date   :2016. 6. 15. 
 * @author :pakjkwan@gmail.com
 * @file   :MaxMin.java
 * @story  :
*/
public class MaxMin {
	public String execute(int[] scores) {
		/**
		 * 학생수는 입력받습니다.
		 * 학생의 점수만 입력해서
		 * 최고점과 최저점만 출력하는
		 * 로직을 작성하시오
		 * */
		
		int max=0,min=100;
		
		for (int i = 0; i < scores.length; i++) {
			
			if (scores[i] > max) {
				max = scores[i];
			}
			if(scores[i] < min){
				min = scores[i];
			}
		}
		return "최고점:"+max+"점/최저점:"+min+"점";
	}
}
