package lotto;

/**
 * @date   :2016. 6. 23. 
 * @author :pakjkwan@gmail.com
 * @file   :LottoServiceImpl.java
 * @story  :
*/
public class LottoServiceImpl implements LottoService{
	
	private int[][]lottos;
	private int[] lotto;
	private int count; // 돈에 따른 회전수
	
	
	@Override
	public void setLottos(LottoBean lot) {
		// 회전수를 입력받아서 매트릭스로 로또 추첨
		this.lottos = new int[count][6];
		this.lotto = new int[6];
		int i = 0;
		if (count<0) {
			this.lottos =null;
		} else {
			for (count=0; count < lottos.length; count++) {
				while(true){
					int num = 0; // 0 대신 식을 채우시오
					/*if () { // 조건문을 채우시오
						continue;
					}*/
					this.lottos[count][i] = num;
					i++;
					/*if (condition) { // if문을 완성하시오
						
					}*/
				}
			}
		}
	}

	@Override
	public int[][] getLottos() {
		// 로또를 가져온다(완성)
		return lottos;
	}

	@Override
	public boolean isDuplication(int count, int num) {
		// 중복방지(완성)
		for (int i = 0; i < lottos[count].length; i++) {
			if (lottos[count][i]==num) {
				return false;
			}
		}
		return true;
	}

	@Override
	public void sort(int[] lot) {
		// 오름차순을 정렬(줄단위로 해당)
		for (int i = 0; i < lot.length -1; i++) {
			for (int j = 0; j < lot.length -i -1; j++) {
				if (lot[j]>lot[j+1]) {
					// 구글링으로 스왑정렬을 검색해서
					// 응용한 코드를 입력하세요
				}
			}
		}
	}

	@Override
	public int count(LottoBean lot) {
		// 회전수 구하기
		return lot.getMoney(); 
		// 1000단위 횟수추출하도록 편집
	}

	

}
