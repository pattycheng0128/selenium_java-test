package InheritanceDemo;

public class VIP extends Customer {

	@Override
	public void setDiscount(double discount) {
		// TODO Auto-generated method stub
		if (discount < 500) {
			System.out.println("金額未滿500，需加80元運費");
			discount = discount + 80;
		}
		super.setDiscount(discount);
	}

}
