package exercise;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "This is a string";// 使用者輸入內容
		String output = reverse(input);// 透過函式去做反轉
		System.out.println("反轉後的字串:" + output);
	}
	
	// 宣告函式用來讀取使用者輸入的內容
	private static String reverse(String input) {

		String reverse = "";// 宣告一個空字串後面用來存放反轉的內容
		// 空值判斷
		if (input.isEmpty() || input == null) {
			System.out.println("您尚未輸入內容");
		}
		// 判斷使用者輸入的內容長度
		if (input.length() <= 1) {
			reverse = input;
		} else {
			// \s代表空格，再加一個反斜線是轉譯的意思，+是指一個以上的空格
			//將使用者輸入的內容透過空格的方式做切割，然後將切割的內容存放在originalArray陣列裡面
			String[] originalArray = input.split("\\s+");
//			for (String item : originalArray) {
//				reverse = item + " " + reverse;
//			}
			//透過for迴圈來將內容做反轉
			for (int i = 0; i < originalArray.length; i++) {
				reverse = originalArray[i] + " " + reverse;
			}

		}

		return reverse;// 回傳值
	}

}
