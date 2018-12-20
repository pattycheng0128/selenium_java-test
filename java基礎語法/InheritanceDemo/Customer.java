package InheritanceDemo;

public class Customer {

	private double discount;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		if (discount > 1000) {
			discount = discount * 0.9D;
		}else {
			System.out.println("���B�C��1000�A�����馩");
		}
		
		this.discount = discount;
	}

}
