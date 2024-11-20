package interfaceDemo;

interface CreditCard {
	
	void charge(double amount);

	default void refund(double amount) {
		System.out.println("Refunding " + amount + " to Credit Card");
	}
}

interface PayPal {
	void charge(double amount);

//	default void refund(double amount) {
//		System.out.println("Refunding " + amount + " to PayPal");
//	}
}

class Customer implements CreditCard, PayPal {
	@Override
	public void charge(double amount) {
		System.out.println("Charging " + amount + " to Customer's account");
	}

//	@Override
//	public void refund(double amount) {
//		System.out.println("customer class Refunding " + amount + " to Customer's account ");
//	}
}

public class PaymentTest {
	public static void main(String[] args) {
//		Customer customer = new Customer();
//		customer.refund(100.0);
		
		CreditCard c = new Customer();
		c.refund(100.0);
	}
}
