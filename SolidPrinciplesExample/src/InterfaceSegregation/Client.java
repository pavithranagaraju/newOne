package InterfaceSegregation;

public class Client {
	public static void main(String[] args) {
		Sony s=new Sony();
		System.out.println("Sony supports following features");
s.SupportPenDrive();
s.SupportHDMI();
s.shareScreen();
System.out.println("Videocon supports following features");

Videocon v=new Videocon();
v.SupportHDMI();
v.SupportPenDrive();
		}
}