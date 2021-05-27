package cellphone;

public class DmbCellPhone extends CellPhone {
	int channel;
	
	public DmbCellPhone(String model, String color, int channel){
		this.model = model;//CellPhone으로부터 상속받은 필드
		this.color = color;//CellPhone으로부터 상속받은 필드
		this.channel = channel;
	}
	
	void turnOnDmb() {System.out.println(channel+"번");}
	void changeChannelDmb(int channel) {this.channel=channel; System.out.println(channel+"번");}
	void turnOffDmb() {System.out.println("turnoff");}
}
