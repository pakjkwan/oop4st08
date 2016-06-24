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
public class LottoBallMain {
	public static void main(String[] args) {

		LottoBean lot = new LottoBean();
		LottoBallService service = new LottoBallServiceImpl();
		StringBuffer buf = new StringBuffer();
		service.setLottoBall(lot);
		
		int[] lotto = service.getLottoBall();
		
		for (int i = 0; i < lotto.length; i++) {
			Arrays.sort(lotto);
				buf.append(lotto[i] + "\t");
			
		}
		System.out.println("로또\n" + buf);
		// int lottoSerialNo = (int) (Math.random()*999999+100000);
		File output = new File("C:\\eclipse\\lotto\\lottoball.txt");
		BufferedWriter bw = null;
		String[] myLotto = buf.toString().split("/");

		try {
			// 뒤에 true 는 이어 써라
			bw = new BufferedWriter(new FileWriter(output, true));

			for (String lots : myLotto) {
				lots += System.getProperty("line.separator");
				bw.write(lots);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bw.flush();// 화장실 물내림
				bw.close();// 화장실 문닫고 나감
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
}
