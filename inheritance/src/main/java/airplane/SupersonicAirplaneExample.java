package airplane;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
	SupersonicAirplane sa = new SupersonicAirplane();
	sa.takeOff();
	sa.fly();
	sa.flyMode=SupersonicAirplane.SPERSONIC;
	sa.fly();
	sa.flyMode=SupersonicAirplane.NORMAL;
	sa.fly();
	sa.land();

	}

}
