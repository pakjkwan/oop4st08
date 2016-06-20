package gameRps;

public class RPSBean {
	private String play,comp;
	
	public void setPlay(String play){
		switch (play) {
		case "1":
			this.play = "가위";
			break;

		default:
			break;
		}
		this.play = play;
	}
	public void setComp(String comp){
		this.comp = comp;
	}
	public String getPlay(){
		return play;
	}
	public String getComp(){
		return comp;
	}
	
	
	
	@Override
	public String toString() {
		return "결과 [플레이어=" + play + ", 컴퓨터=" + comp + "]";
	}
	
}
