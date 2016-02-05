class Bycicle {
	int cadence = 0;
	int speed = 30;
	int gear = 2;

	void changecadence(int newval) {
		cadence = newval;
	}
	void changespeed(int increment) {
		speed += increment;
	}
	void changegear(int decrement) {
		gear = decrement;
	}
	void printstates() {
		System.out.println("cadence:"+ cadence + "speed :" + speed + "gear:" + gear);
	}
}

class BycicleDemo {
	public static void main(String[] args) {
		
		Bycicle bk1 = new Bycicle();
		Bycicle bk2 = new Bycicle();

		//First Bycicle details
		bk1.changecadence(10);
		bk1.changespeed(2);
		bk1.changegear(1);
		bk1.printstates();

		//Second details
		bk2.changecadence(11);
		bk2.changespeed(3);
		bk2.changegear(2);
		bk2.printstates();
	}
}