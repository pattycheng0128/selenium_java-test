package Condition;

public class ForDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//列印for裡面的數值
//		for(int i=0;i<10;i++) {
//			System.out.println("列印i:"+i);
//		}
		//常用的for:列印陣列裡面的內容(整數)
		int[] intArray= {10,40,30};
		for(int i=0;i<intArray.length;i++) {
			System.out.println(intArray[i]);
		}
		
		//常用的for:列印陣列裡面的內容(字串)
		String[] strArray= {"A","B","C"};
		for(int i=0;i<strArray.length;i++) {
			System.out.println(strArray[i]);
		}
		//範例2:只能用於集合和數組
		for(int num:intArray) {
			System.out.println("數組值:"+num);
		}
		for(String str:strArray) {
			System.out.println("數組值:"+str);
		}
	}

}
