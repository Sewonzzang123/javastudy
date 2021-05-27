package tire;

public class KumhoTire extends Tire{
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
		
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation){
			System.out.println(location+"hankook:"+(maxRotation-accumulatedRotation));
			return true;
		}else {
			System.out.println(location+"hankook펑크");
			return false;
		}
	}
}
