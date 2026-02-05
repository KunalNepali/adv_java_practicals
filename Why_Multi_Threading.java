//package threadPack;
class CSIT extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.print("CSIT ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}

class BCA extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.print("BCA ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}

public class Why_Multi_Threading {
	public static void main(String[] args) {
		CSIT csit = new CSIT();
		BCA bca = new BCA();
		csit.start();
		bca.start();

	}
}
