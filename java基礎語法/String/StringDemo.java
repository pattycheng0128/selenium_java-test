package String;

public class StringDemo {

	public static void main(String[] args) {
		// 比較兩個字串值是否一樣
		String x="Hello";
		String y="Hello";
		System.out.println(x==y);//true
		//不同的物件要比較內容時，要用equals來比較
		String z=new String("Hello");
		System.out.println(z==x);//false
		System.out.println(z.equals(x));//true
	}

}
