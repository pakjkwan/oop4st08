/**
 * 
 */
package bank;

import global.MyConstants;

/**
 * @date   :2016. 6. 16. 
 * @author :pakjkwan@gmail.com
 * @file   :Account.java
 * @story  :
*/
public class AccountBean {
	private int accountNo; // 인스턴스 변수는 초기화를 하지 않는다
	private String name;
	private int money;
	private String pw;
	private String id;
	
	public AccountBean() {
		// default constructor 기본 생성자
		// 생성자 오버로딩
	}
	public AccountBean(AccountBean a) {
		// default constructor 기본 생성자
		// 생성자 오버로딩
		this.name = a.getName();
		
	}
	public AccountBean(String name,String id,String pw) {
		this.accountNo = (int) (Math.random() * 999999)+100000; 
		this.name = name;
		this.id = id;
		this.pw = pw;
	}
	
	public void setMoney(int money){
		this.money = money;
	}
	
	public void setPW(String pw){
		this.pw = pw;
	}
	public int getAccountNo(){
		return this.accountNo;
	} 
	public String getName(){
		return this.name;
	}
	public int getMoney(){
		return this.money;
	}
	
	public String getID(){
		return this.id;
	}
	public String getPW(){
		return pw;
	}
	
	@Override 
	public String toString() { // 메소드 오버라이딩
		return MyConstants.BANK_NAME+" [계좌번호=" + accountNo 
				+ ", 이름=" + name 
				+ ", 잔액=" + money 
				+ ", 비번=" + pw 
				+ ", 아이디=" + id
				+ "]";
	}
	
}
