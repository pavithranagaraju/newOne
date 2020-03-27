package InterfaceSegregation;

public class Videocon implements PenDrive,HDMI {

	@Override
	public void SupportHDMI() {
		// TODO Auto-generated method stub
		System.out.println("HDMI");
	}

	@Override
	public void SupportPenDrive() {
		// TODO Auto-generated method stub
		System.out.println("PenDrive");
	}

}
