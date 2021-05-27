package cellphone;

public class DmbCallExample {

	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "red", 10);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice();
		dmbCellPhone.receiveVoice();
		dmbCellPhone.hangUp();
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();

	}

}
