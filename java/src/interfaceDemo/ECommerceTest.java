package interfaceDemo;

interface User {
	void placeOrder();

	default void requestRefund(double amount) {
		System.out.println("Requesting refund of " + amount + " as a User");
	}
}

abstract class Customer1 implements User {
	@Override
	public void placeOrder() {
		System.out.println("Placing order as a Customer");
	}

	@Override
	public void requestRefund(double amount) {
		System.out.println("Requesting refund of " + amount + " as a Customer");
	}
}

abstract class Vendor implements User {
	@Override
	public void placeOrder() {
		System.out.println("Placing order as a Vendor");
	}

	@Override
	public void requestRefund(double amount) {
		System.out.println("Requesting refund of " + amount + " as a Vendor");
	}
}

class PremiumCustomer extends Customer1 {
	@Override
	public void placeOrder() {
		System.out.println("Placing premium order as a Premium Customer");
	}

	// Notice no override for requestRefund()
}

class PremiumVendor extends Vendor {
	@Override
	public void placeOrder() {
		System.out.println("Placing premium order as a Premium Vendor");
	}

	@Override
	public void requestRefund(double amount) {
		System.out.println("Requesting refund of " + amount + " as a Premium Vendor");
	}
}

public class ECommerceTest {
	public static void main(String[] args) {
		PremiumCustomer pc = new PremiumCustomer();
		pc.placeOrder();
		pc.requestRefund(100.0);

		System.out.println("---");

		PremiumVendor pv = new PremiumVendor();
		pv.placeOrder();
		pv.requestRefund(200.0);
	}
}
