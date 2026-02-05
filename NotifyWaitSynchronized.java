//package threadPack;
class TotalCalculation extends Thread {
	int students = 16;
	int total = 0;
	@Override
	public void run() {
		for (int i = 1; i <= students; i++ ) {
			total += 999999;
		}
	}
}

public class NotifyWaitSynchronized {
	public static void main(String[] args) throws InterruptedException{
		TotalCalculation tc = new TotalCalculation();
	    tc.start();
	    synchronized(tc) {
	    	tc.wait();
	    }
	    System.out.println("Total Collection = " + tc.total);
	}
}
