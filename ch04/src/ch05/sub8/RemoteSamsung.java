package ch05.sub8;

public class RemoteSamsung implements RemoteControl {

	@Override
	public void powerOn() {
		System.out.println("Samsum powerON...");
	}

	@Override
	public void powerOff() {
		System.out.println("Samsum  powerOff...");
	}

	@Override
	public void chUp() {
		System.out.println("Samsum  chUp...");
	}

	@Override
	public void chDown() {
		System.out.println("Samsum  chDown...");
	}

	@Override
	public void soundUp() {
		System.out.println("Samsum  soundUp...");
	}

	@Override
	public void soundDown() {
		System.out.println("Samsum  soundDown...");
	}

}
