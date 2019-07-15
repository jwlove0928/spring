package Cook;

public class KoreaCook implements COOK {

	@Override
	public void make() {
		System.out.println("손님에게 음식을 만들다.");
	}

	@Override
	public void sell() {
		System.out.println("손님에게 음식을 팔다.");
	}

	@Override
	public void prepare() {
		System.out.println("손님맞을 음식의 재료를 준비하다.");
	}

}
