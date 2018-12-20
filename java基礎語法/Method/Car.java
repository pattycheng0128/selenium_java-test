package Method;

public class Car {
	// 宣告car的屬性
	private String color;// 顏色
	private String make;// 製造商
	private String model;// 型號
	private int year;// 年分

	public void increaseSpeed() {
		System.out.println("加速度");
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}

	public void setMake(String make) {
		this.make = make;// this是指向成員變數的make
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
			System.out.println("年份無效");
		}
		
	}

}
