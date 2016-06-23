package lotto;

import javax.swing.JOptionPane;

/**
 * @date :2016. 6. 23.
 * @author :pakjkwan@gmail.com
 * @file :LottoController.java
 * @story :
 */
public class LottoMain {
	public static void main(String[] args) {
		LottoBean lot = new LottoBean();
		LottoService service = new LottoServiceImpl();
		JOptionPane.showInputDialog("얼마치 구입?");
		lot.setMoney(5800);
		int[][] lottos = service.getLottos();
		for (int i = 0; i < lottos.length; i++) {
			service.sort(lottos[i]);
			for (int j = 0; j < lottos[i].length; j++) {
				System.out.println(lottos[i][j]+"\t");
			}
			System.out.println();
		}

	}
}






