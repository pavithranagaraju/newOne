package InterfaceSegregation;

public class Sony implements HDMI,PenDrive,ScreenSharing{

	@Override
	public void SupportPenDrive() {
		// TODO Auto-generated method stub
		System.out.println("PenDrive");
	}

	@Override
	public void SupportHDMI() {
		// TODO Auto-generated method stub
		System.out.println("HDMI");
	}

	@Override
	public void shareScreen() {
		// TODO Auto-generated method stub
		System.out.println("ShareScreen");
	}

}
