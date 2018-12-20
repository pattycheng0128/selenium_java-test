package test;

import InheritanceDemo.Customer;
import InheritanceDemo.VIP;

public class testCustomer {

	public static void main(String[] args) {

		Customer c=new Customer();
		c.setDiscount(1000);
		System.out.println("價錢:"+c.getDiscount());

		VIP v = new VIP();
		v.setDiscount(300);
		System.out.println("價錢:" + v.getDiscount());
		v.setName("Penny");
		System.out.println("客戶名稱:" + v.getName());

	}

}
