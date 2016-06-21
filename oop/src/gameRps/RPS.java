package gameRps;

public enum RPS {
	가위(1),바위(2),보(3);
	private int val;
	private RPS(int i) {
		this.val = i;
	}
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
	
}
