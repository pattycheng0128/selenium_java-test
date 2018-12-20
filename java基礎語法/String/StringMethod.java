package String;

public class StringMethod {

	public static void main(String[] args) {
		String str = "This is my course";
		System.out.println("取出字串長度:" + str.length());
		System.out.println("取出字串的第幾個值:" + str.charAt(3));
		System.out.println("字串連接:" + str.concat(" 測試"));
		System.out.println("字串是否包含:" + str.contains("is"));
		System.out.println("字串的開始內容是否為his:" + str.startsWith("his"));
		System.out.println("字串的結尾內容是否為course:" + str.endsWith("course"));
		// 比較字串內容是否一樣，要用equals
		String a = "Hello";
		String b = new String("Hello");
		System.out.println("a.equals(b):" + a.equals(b));
		System.out.println("a==b:" + (a == b));
		System.out.println("字串出現的索引位置" + str.indexOf("m"));
		String str2 = "";
		System.out.println("字串是否為空值:" + str.isEmpty());
		System.out.println("字串是否為空值:" + str2.isEmpty());
		String str3 = "    Hello  world";
		System.out.println("去除空格:" + str3.trim());// 不包含中間的空格
		System.out.println("字符串代替" + str.replace("course", "課程"));
		System.out.println("找出字符串" + str.substring(3));// 會找出3~最後一個值
		System.out.println("找出字符串範圍" + str.substring(5, 10));// 不包含第10個值
		// 將字符串複製到Unicode字符串組
		char charArray[] = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.println("第" + i + "是" + charArray[i]);
		}
		System.out.println("轉換為小寫字母"+str.toLowerCase());
		System.out.println("轉換為小寫字母"+str.toUpperCase());
	}

}
