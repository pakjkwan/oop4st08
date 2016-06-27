/**
 * 
 */
package bank;

import javax.swing.JOptionPane;

import com.sun.org.apache.bcel.internal.Constants;

import global.MyConstants;

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
		String spec = "";
		String[] specArr=new String[3];
		AccountService service = new AccountServiceImpl();
		BankService bankService = new BankServiceImpl();
		AccountBean tempAcc = new AccountBean();
		
		while (true) {
			switch (JOptionPane.showInputDialog(""
					+ "========개인인터넷뱅킹=======\n"
					+ "1개설 2입금 3조회 4출금 5통장내역\n"
					+ "========은행창구=======\n"
					+ "11개설 12전체계좌내역 13계좌번호조회 14조회(이름) 15계좌수 "
					+ "0종료")) {
			case "1":
				spec = JOptionPane.showInputDialog("이름,ID,PW");
				specArr = spec.split(",");
				service.openAccount(specArr[0],specArr[1],specArr[2]);
				break;
			case "2":
				String inputMoney = JOptionPane.showInputDialog("입금액?");
			//	account.setMoney(Integer.parseInt(inputMoney));
				service.deposit(Integer.parseInt(inputMoney));
				break;
			case "3":
			//	JOptionPane.showMessageDialog(null, service.findAccount());
				break;
			case "4":
				String outputMoney = JOptionPane.showInputDialog("출금액?");
				JOptionPane.showMessageDialog(null, service.withdraw(Integer.parseInt(outputMoney)));
				break;
			case "5":
				JOptionPane.showMessageDialog(null,service.showAccount());
				break;
			case "11":
				spec = JOptionPane.showInputDialog("이름,ID,PW");
				specArr = spec.split(",");
				AccountBean acc = new AccountBean();
				acc.setAccountNo();
				acc.setId(specArr[1]);
				acc.setName(specArr[0]);
				acc.setPw(specArr[2]);
				bankService.openAccount(acc);
				break;
			case "13":
				tempAcc = bankService.findByAccountNo(JOptionPane.showInputDialog("검색하려는 계좌번호"));
				JOptionPane.showMessageDialog(null,(tempAcc.getId() != null) ?"조회 계좌번호 없음":tempAcc.toString());
				break;
			case "14":
				 bankService.findByName(JOptionPane.showInputDialog("검색하려는 이름"));
				break;
			case "15":
				int count = bankService.count();
				JOptionPane.showMessageDialog(null, count+"개");
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
