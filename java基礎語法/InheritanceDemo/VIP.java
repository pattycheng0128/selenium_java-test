package InheritanceDemo;

public class VIP extends Customer {

	@Override
	public void setDiscount(double discount) {
		// TODO Auto-generated method stub
		if (discount < 500) {
			System.out.println("���B����500�A�ݥ[80���B�O");
			discount = discount + 80;
		}
		super.setDiscount(discount);
	}

}
