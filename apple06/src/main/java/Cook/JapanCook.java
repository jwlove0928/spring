package Cook;

public class JapanCook implements COOK {

	@Override
	public void make() {
		System.out.println("일본인 전용 음식을 만들다.");
	}

	@Override
	public void sell() {
		System.out.println("일본인이니 좀 더 비싸게 판다.");
	}

	@Override
	public void prepare() {
		System.out.println("일본인이여도 음식재료는 최상으로 준비한다.");
	}

}
