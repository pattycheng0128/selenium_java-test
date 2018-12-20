package ArrayDemo;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cars=new ArrayList<String>();
		//在集合新增元素
		cars.add("Penny");
		cars.add("Ginny");
		cars.add("Lily");
		System.out.println("在集合新增元素:"+cars);
		
		//集合裡面有幾個元素
		int size=cars.size();
		System.out.println("集合裡面有幾個元素:"+size);
		
		//取得元素內容(index)
		System.out.println(cars.get(2));
		
		//透過for迴圈印出內容
		for (int i=0;i<size;i++) {
			System.out.println("name:"+cars.get(i)+" ");
		}
		
		for(String car:cars) {
			System.out.println("元素:"+car);
		}
		cars.remove(size-1);
		for(String car:cars) {
			System.out.println("元素:"+car);
		}
		
	}

}
