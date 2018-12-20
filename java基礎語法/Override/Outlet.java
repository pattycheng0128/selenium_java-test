package Override;

public class Outlet extends Product {

	@Override
	public double getUnitPrice() {
		// TODO Auto-generated method stub
		return super.getUnitPrice()*0.8;
	}
	//查詢定價，Outlet定義的新方法
	public double getListPrice() {
		return super.getUnitPrice();
	}

	

}
