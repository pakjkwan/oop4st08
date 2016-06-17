/**
 * 
 */
package something;

import javax.swing.JOptionPane;

/**
 * @date   :2016. 6. 17. 
 * @author :pakjkwan@gmail.com
 * @file   :SomethingMain.java
 * @story  :
*/
public class SomethingMain {
	public static void main(String[] args) {
		Something s = null;
		while (true) {
			switch (JOptionPane.showInputDialog("1등록2조회0종료")) {
			case "1":
				String bbb = JOptionPane.showInputDialog("bbb 문자");
				String sccc = JOptionPane.showInputDialog("ccc 숫자");
				int ccc = Integer.parseInt(sccc);
				s = new Something(bbb, ccc);
				String aaa = JOptionPane.showInputDialog("aaa");
				String sddd = JOptionPane.showInputDialog("ddd");
				s.setAaa(aaa);
				int ddd = Integer.parseInt(sddd);
				s.setDdd(ddd);
				break;
			case "2":
				JOptionPane.showMessageDialog(null, s.getAaa()
						+s.getBbb()+s.getCcc()+s.getDdd());
				break;
			case "0":
				JOptionPane.showConfirmDialog(null, "종료?");
				return;
				
				

			default:
				break;
			}
		}
	}
}
