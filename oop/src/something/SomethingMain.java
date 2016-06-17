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
/**
데이터베이스에 컬럼값은
aaa(text)
bbb(text)
ccc(number)
ddd(number)
이며

이중 기본값은 bbb,ccc입니다.
그리고 그중에서 ccc 는 보안에
민감한 값이고
bbb 는 수정가능한 값입니다.

메뉴는 1번 등록 2번 조회 0번 종료
* */
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
