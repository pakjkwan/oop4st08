/**
 * 
 */
package school;

import javax.swing.JOptionPane;

import jdk.nashorn.internal.ir.WhileNode;

/**
 * @date   :2016. 6. 16. 
 * @author :pakjkwan@gmail.com
 * @file   :SchoolController.java
 * @story  :
*/
public class SchoolController {
	public static void main(String[] args) { // String[] params
		
		Student stu = null;
		while (true) {
			switch (JOptionPane.showInputDialog("1등록 2조회 0종료")) {
			case "1":
				stu = new Student(JOptionPane.showInputDialog("ID"),
						JOptionPane.showInputDialog("PW"),
						JOptionPane.showInputDialog("이름"),
						JOptionPane.showInputDialog("주민번호"));
				break;
			case "2":
				JOptionPane.showMessageDialog(null, stu.toString());
				break;
			case "3":break;
			case "0":return;

			default:
				break;
			}
		}
	}
}
