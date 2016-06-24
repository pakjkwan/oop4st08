package lotto2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 * @date   :2016. 6. 24. 
 * @author :pakjkwan@gmail.com
 * @file   :SBSMain.java
 * @story  :
*/
public class LottoBallMain2 {
	public static void main(String[] args) {

		LottoBean lot = new LottoBean();
		LottoBallService service = new LottoBallServiceImpl();
		service.setLottoBall();
		int[] lotto = service.getLottoBall();
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i]+"\t");
		}
	}
}
