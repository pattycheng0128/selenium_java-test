package ArrayDemo;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cars=new ArrayList<String>();
		//�b���X�s�W����
		cars.add("Penny");
		cars.add("Ginny");
		cars.add("Lily");
		System.out.println("�b���X�s�W����:"+cars);
		
		//���X�̭����X�Ӥ���
		int size=cars.size();
		System.out.println("���X�̭����X�Ӥ���:"+size);
		
		//���o�������e(index)
		System.out.println(cars.get(2));
		
		//�z�Lfor�j��L�X���e
		for (int i=0;i<size;i++) {
			System.out.println("name:"+cars.get(i)+" ");
		}
		
		for(String car:cars) {
			System.out.println("����:"+car);
		}
		cars.remove(size-1);
		for(String car:cars) {
			System.out.println("����:"+car);
		}
		
	}

}
