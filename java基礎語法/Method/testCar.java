package Method;

public class testCar {
	public static void main(String[] args) {
		Car bmw=new Car();
		bmw.setMake("BMW");
		System.out.println(bmw.getMake());
		
		Car benz=new Car();
		benz.setModel("W21");
		System.out.println(benz.getModel());
		benz.setYear(1900);
		System.out.println(benz.getYear());
		System.out.println(benz.getMake());//沒有賦予值，所以是null
		
	}

}
