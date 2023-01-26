
public class Inovice {
	private int id;
	private Customer customer;
	private double amount;

	public Inovice(int id, Customer customer, double amount) {
		this.id = id;
		this.customer = customer;
		this.amount = amount;
	}

	public int getID() {
		return id;

	}

	public Customer getCustomer() {
		return customer;

	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int CustomerID() {
		return customer.getID();
	}

	public String getCustomerName() {
		return customer.getName();
	}

	public int getCustomerDiscount() {
		return customer.getDiscount();
	}

	public double getAmountAfterDiscount() {
		return amount - ((double) customer.getDiscount() / 100 * amount);
	}

	public String toString() {
		return "Inovice[id = " + id + ",customer = " + customer.getName() + 
				"(" + customer.getID() + ")" + ",amount ="
				+ getAmountAfterDiscount() + "]";
	}
}
