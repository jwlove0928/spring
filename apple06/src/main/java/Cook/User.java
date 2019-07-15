package Cook;

public class User {
	public static void main(String[] args) {
		
		KoreaCook korea = new KoreaCook();
		korea.make();
		korea.sell();
		korea.prepare();
		
		JapanCook japan = new JapanCook();
		japan.make();
		japan.sell();
		japan.prepare();
	}
}
