/**
 * 
 */
package bank;

/**
 * @date   :2016. 6. 16. 
 * @author :pakjkwan@gmail.com
 * @file   :Account.java
 * @story  :
*/
public class Account {
	private int accountNo; // 인스턴스 변수는 초기화를 하지 않는다
	private String name;
	private int money;
	private String pw;
	private String id;
	public final static String BANK_NAME="한빛은행";
	
	public Account(String name) {
		this.accountNo = (int) (Math.random() * 999999)+100000; 
		this.name = name;
	}
	
	public void setMoney(int money){
		this.money = money;
	}
	
	public void setID(String id){
		this.id = id;
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
		return this.pw;
	}
	
	
	
}
