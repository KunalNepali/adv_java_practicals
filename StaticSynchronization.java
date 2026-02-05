//important question
class MovieTicketBooking {
	static int seats = 218;

	public static synchronized void book(int reqseats) {
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

class ESewa extends Thread {
	int seats;
	MovieTicketBooking mtb;

	public ESewa(MovieTicketBooking mtb, int seats) {
		this.mtb = mtb;
		this.seats = seats;
	}

	public void run() {
		mtb.book(seats);
	}
}

class Khalti extends Thread {
	int seats;
	MovieTicketBooking mtb;

	public Khalti(MovieTicketBooking mtb, int seats) {
		this.mtb = mtb;
		this.seats = seats;
	}

	public void run() {
		mtb.book(seats);
	}
}

public class StaticSynchronization {
	public static void main(String[] args) {
		MovieTicketBooking mtb1 = new MovieTicketBooking();
		ESewa es1 = new ESewa(mtb1, 5);
		es1.start();
		MovieTicketBooking mtb2 = new MovieTicketBooking();
		ESewa es2 = new ESewa(mtb2, 15);
		es2.start();
		MovieTicketBooking mtb3 = new MovieTicketBooking();
		ESewa es3 = new ESewa(mtb3, 25);
		es3.start();
		MovieTicketBooking mtb4 = new MovieTicketBooking();
		Khalti kh1 = new Khalti(mtb4, 5);
		kh1.start();
	}
}