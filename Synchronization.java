//package threadPack;
class Booking {
	int seats = 48;

	public void book(int reqseats) {
		System.out.println(" I shall not be synchronized. ");
		synchronized (this) {
			if (reqseats <= seats) {
				System.out.println(reqseats + " are booked successfully :)");
				seats = seats - reqseats;
				System.out.println(seats + " are Remaining seats !!");
			} else {
				System.out.println(reqseats + " are not available:(");
				System.out.println("Only " + seats + " are reamining:)");
			}
		}
	}
}

public class Synchronization extends Thread {
	int st;
	static Booking bk;

	@Override
	public void run() {
		bk.book(st);
	}

	public static void main(String[] args) {
		bk = new Booking();
		Synchronization kunal = new Synchronization();// object for synchronization
		kunal.st = 12;
		kunal.start();
		Synchronization udip = new Synchronization();
		udip.st = 16;
		udip.start();
		Synchronization nicksun = new Synchronization();
		nicksun.st = 10;
		nicksun.start();
		Synchronization aarushi = new Synchronization();
		aarushi.st = 10;
		aarushi.start();
	}
}
