/**
 * 
 */
package controller;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @date   :2016. 6. 14. 
 * @author :pakjkwan@gmail.com
 * @file   :Controller.java
 * @story  :
*/
public class ControllerBak {
	public static void main(String[] args) {
		String menu="";
		Scanner s = new Scanner(System.in);
		Calc calc = new Calc();
		while (true) {
			menu = JOptionPane.showInputDialog("1.계산기 "
					+ "2.카우푸 "
					+ "3.년월말 "
					+ "4.1등구하기"
					+ "5.학번/나이"
					+ "6.최고최저점수"
					+ "7.세금액"
					+ "8.성별판별"
					+ "9.시분초구하기"
					+ "0.종료");
			switch (menu) {
			case "1":
				System.out.print("첫번째숫자 : ");
				System.out.print("연산자 : ");
				System.out.print("두번째숫자 : ");
				System.out.println(calc.execute(s.nextInt(), s.next(), s.nextInt()));
				break;
			case "2":kaup(s);break;
			case "3":break;
			case "0":
				JOptionPane.showConfirmDialog(null, "종료하시겠습니까?");
				return;
			default:
				JOptionPane.showMessageDialog(null, "메뉴에 없는 번호입니다");
				break;
			}
		}
	}

	/**
	 * @param s
	 */
	private static void kaup(Scanner s) {
		String name="",result="";
		double height=0.0,weight=0.0,kaup=0.0;
		//---- op -----
		System.out.println("이름?");
		name = s.next();
		System.out.println("키?");
		height = s.nextDouble();
		System.out.println("몸무게?");
		weight = s.nextDouble();
		kaup = weight / (height / 100) / (height / 100);
		
		if (kaup < 18.5) {
			result = "저체중";
		}else if(kaup < 22.9 && kaup > 18.5){
			result = "정상";
		}else if(kaup < 24.9 && kaup > 23.0){
			result = "위험체중";
		}else if(kaup < 29.9 && kaup > 25.0){
			result = "비만1단계";
		}else if(kaup < 40 && kaup > 30.0){
			result = "비만2단계";
		}else if(kaup >= 40){
			result = "비만3단계";
		}
		/*double d = Double.parseDouble(String.format("%.2f", kaup));
		System.out.println(
				name+"은 BMI지수는 "+d+"이고,"+result+"이다"); */
		// 위 문장을 printf 로 변경하시오
		System.out.printf("%s은 BMI지수는 %.2f이고 %s이다",
				name,kaup,result);
	}

	/**
	 * @param s
	 */
	private static void calc(Scanner s) {
		
	}
}
