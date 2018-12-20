package Abstract;

public class testcars {

	public static void main(String[] args) {
		// 抽象類別只能透過子類別調用，其他類別要調用必須透過子類別來override後，才能使用。
		BMW c = new BMW();
		c.setBrand("Toyota");
		System.out.println("廠牌:" + c.getBrand());
		c.setStock(10);
		System.out.println("庫存量:" + c.getStock());

	}

}
