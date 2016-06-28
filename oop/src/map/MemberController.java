package map;

import javax.swing.JOptionPane;

public class MemberController {
	public static void main(String[] args) {
		while (true) {
			switch (JOptionPane.showInputDialog(""
					+ "--- 회원이 보는 화면 ---\n"
					+ "1회원가입 2로그인 3내정보수정(비번) 4탈퇴 0종료\n"
					+ "--- 관리자 화면 ---\n"
					+ "11회원목록 12검색(ID) 13검색(이름) 14검색(성별) 15회원수 ")) {
			case "":break;
			default:
				break;
			}
		}
	}
}
