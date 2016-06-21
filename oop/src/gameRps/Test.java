package gameRps;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		RPSBean r = new RPSBean();
		RPSBean p = new RPSBean();
		RPSBean s = new RPSBean();
	       r.value = RPS.가위;
	       p.value = RPS.바위;
	       s.value = RPS.보;
	       
	       System.out.println(r.value.getVal());
	       System.out.println(p.value.getVal());
	       System.out.println(s.value.getVal());
	       
	       if (r.value.getVal() < p.value.getVal()) {
			System.out.println("참");
		}
		System. out.println("=== 가위바위보 게임 ===");
	       System. out.println("가위: 1, 바위:2, 보자기:3");
	       Scanner scanner = new Scanner(System.in );
	        int scan = scanner .nextInt();
	       String result = "";
	        // ------[데이터 입력]-----
	       GameRPS gameRPS = new GameRPS();
	        result = gameRPS.play( scan);
	        // ------[데이터 출력]-----
	       System. out.println(result );
	}
	
}
class GameRPS{
	public String play(int scan ){
        // ----------------[가공해야할 데이터를 입력하는 부분]--------------------
		int sccisors=1,rock =2,paper=3,rpsValue=0,comValue=0;
       String result = "";
        rpsValue = scan;
        comValue = ( int) (Math.random()*3+1);
        switch (rpsValue ) {
        case 1:
            if (comValue ==1) {
                result = "사용자 "+RPS.가위+", 컴퓨터 가위 : 무승부";
           } else if (comValue ==2) {
                result = "사용자 가위, 컴퓨터 바위 : 패배";
           } else{
                result = "사용자 가위, 컴퓨터 보자기 : 승리";
           }
            break;
        case 2:
            if (comValue ==1) {
                result = "사용자 바위, 컴퓨터 가위 : 승리";
           } else if (comValue ==2) {
                result = "사용자 바위, 컴퓨터 바위 : 무승부";
           } else{
                result = "사용자 바위, 컴퓨터 보자기 : 패배";
           }
            break;
        case 3:
            if (comValue ==1) {
                result = "사용자 보자기, 컴퓨터 가위 : 패배";
           } else if (comValue ==2) {
                result = "사용자 보자기, 컴퓨터 바위 : 승리";
           } else{
                result = "사용자 보자기, 컴퓨터 보자기 : 무승부";
           }
            break;
        default: result ="1~3까지 숫자만 입력바랍니다.";
            break;
       }
        //----------------[ 결과가 보여지는 부분]------------
        return result ;
    }   
}