package Overloading;

public class testDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		d.setBirthday(1988, 01, 22);
		System.out.println("¥Í¤é:"+d.getBirthday());
		d.setBirthday(1988,01,22);

	}

}
