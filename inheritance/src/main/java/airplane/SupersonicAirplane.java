package airplane;

public class SupersonicAirplane extends Airplane {
	public static final int NORMAL = 1;
	public static final int SPERSONIC = 2;

	public int flyMode = NORMAL;

	@Override
	public void fly() {
		if (flyMode == SPERSONIC) {
			System.out.println("supersonic");
		} else {
			// airplane의 fly를 호출
			super.fly();
		}
	}
}
