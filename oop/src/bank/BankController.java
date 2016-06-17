/**
 * 
 */
package bank;

import javax.swing.JOptionPane;

/**
 * @date   :2016. 6. 15. 
 * @author :pakjkwan@gmail.com
 * @file   :BankController.java
 * @story  :
*/
public class BankController {
	public static void main(String[] args) {
	//	Account account = null;
		int ok = 0;
		Account	account = null;
		while (true) {
			switch (JOptionPane.showInputDialog("1개설 2입금 3조회 4출금 5통장내역 0종료")) {
			case "1":
				ok = JOptionPane.showConfirmDialog(null,"계좌개설 YES?");
				if (ok==0) {
				account = new Account(JOptionPane.showInputDialog("이름"));
				} else {
					continue;
				}
				break;
			case "2":
				String inputMoney = JOptionPane.showInputDialog("입금액?");
				account.setMoney(Integer.parseInt(inputMoney));
				break;
			case "3":
				JOptionPane.showMessageDialog(null, account.getMoney());
				break;
			case "5":
				JOptionPane.showMessageDialog(null, 
						Account.BANK_NAME
						+",이름 : "+account.getName()
						+",계좌번호 : "+account.getAccountNo());
				break;
			default:
				ok = JOptionPane.showConfirmDialog(null, "close ?");
				if (ok==0) {
					return;
				} else {
					continue;
				}
			}
		}
	}
}
