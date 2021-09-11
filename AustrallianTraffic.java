package practice;

public class AustrallianTraffic implements TrafficRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrafficRules a=new AustrallianTraffic();
		AustrallianTraffic c= new AustrallianTraffic();
		a.GoGreen();
		a.StopRed();
		a.ReadyYellow();
		c.AustrallianOwnRule();
	}

	@Override
	public void GoGreen() {
		// TODO Auto-generated method stub
		System.out.println("Go to way");
		
	}

	@Override
	public void StopRed() {
		// TODO Auto-generated method stub
		System.out.println("Stop here");
		
	}

	@Override
	public void ReadyYellow() {
		// TODO Auto-generated method stub
		System.out.println("be ready to move");
		
	}
	
	public void AustrallianOwnRule() {
		System.out.println("AustrallianOwnRule");
	}

}
