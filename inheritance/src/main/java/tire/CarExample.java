package tire;

public class CarExample {

	public static void main(String[] args) {
	Car car = new Car();
	for(int i=0; i<5; i++) {
		int problemLocation = car.run();
		
		switch(problemLocation) {
		case 1:
			System.out.println("앞왼쪽 Hankook");
			car.frontLeftTire = new HankookTire("앞왼쪽", 15);
			break;
		case 2:
			System.out.println("앞오른쪽 Kumho");
			car.frontRightTire = new KumhoTire("앞왼쪽", 13);
			break;
		case 3:
			System.out.println("뒤왼쪽 Hankook");
			car.backLeftTire = new HankookTire("앞왼쪽", 14);
			break;
		case 4:
			System.out.println("뒤오른쪽 Kumho");
			car.backRightTire = new KumhoTire("앞왼쪽", 17);
			break;
		}
		System.out.println("================");
	}

	}

}
