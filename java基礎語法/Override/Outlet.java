package Override;

public class Outlet extends Product {

	@Override
	public double getUnitPrice() {
		// TODO Auto-generated method stub
		return super.getUnitPrice()*0.8;
	}
	//�d�ߩw���AOutlet�w�q���s��k
	public double getListPrice() {
		return super.getUnitPrice();
	}

	

}
