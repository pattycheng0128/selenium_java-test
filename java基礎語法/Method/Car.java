package Method;

public class Car {
	// �ŧicar���ݩ�
	private String color;// �C��
	private String make;// �s�y��
	private String model;// ����
	private int year;// �~��

	public void increaseSpeed() {
		System.out.println("�[�t��");
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}

	public void setMake(String make) {
		this.make = make;// this�O���V�����ܼƪ�make
	}

	public String getMake() {
		return this.make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if(year>1900) {
			this.year = year;
		}else {
			System.out.println("�~���L��");
		}
		
	}

}
