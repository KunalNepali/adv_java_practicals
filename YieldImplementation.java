//package threadPack;
public class YieldImplementation extends Thread {
	@Override
	public void run() {
		Thread.yield();
		for (int i = 0; i < 5; i++) {
			System.out.println("I am a " + currentThread().getName());

		}
	}

	public static void main(String[] args) {
		YieldImplementation t1 = new YieldImplementation();
		t1.start();
		for(int i = 0; i < 5; i++) {
			System.out.println("I am a " + currentThread().getName());
		}
	}
}
