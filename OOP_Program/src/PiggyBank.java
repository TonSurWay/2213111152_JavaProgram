

public class PiggyBank {
	// attributes
	public int one;
	public int two;
	public int five;
	public int ten;
	public int size;

	// methods
	public void SetPiggyBank(int s) {
		clear();
		size = s;
	}
	public int getPiggyBank() {
		return size;
	}

	public void clear() {
		one = two = five = ten = 0;
	}

	public int getTotal() {
		return one + (two * 2) + (five * 5) + (ten * 10);
	}

	public void addOne(int c) {
		if (getTotal() + c <= size) {
			one += c; // one = one+c;
		} else {
			System.err.println("Piggy Bank Full");
		}

	} //end of addOne

	public void addTwo(int c) {
		if (getTotal() + c <= size) {
			two += c; // two = two+c;
		} else {
			System.err.println("Piggy Bank Full");
		}
	} // end of addTwo

	public void addFive(int c) {
		if (getTotal() + c <= size) {
			five += c;
		} else {
			System.err.println("Piggy Bank Full");
		}
	} // end of addFive

	public void addTen(int c) {
		if (getTotal() + c <= size) {
			ten += c;
		} else {
			System.err.println("Piggy Bank Full");
		}
	} // end of addTen
}
