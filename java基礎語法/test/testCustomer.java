package test;

import InheritanceDemo.Customer;
import InheritanceDemo.VIP;

public class testCustomer {

	public static void main(String[] args) {

		Customer c=new Customer();
		c.setDiscount(1000);
		System.out.println("����:"+c.getDiscount());

		VIP v = new VIP();
		v.setDiscount(300);
		System.out.println("����:" + v.getDiscount());
		v.setName("Penny");
		System.out.println("�Ȥ�W��:" + v.getName());

	}

}
