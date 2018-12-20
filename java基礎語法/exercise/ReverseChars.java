package exercise;

import java.util.Scanner;

public class ReverseChars {

	public static void main(String[] args) {
		// 讓user輸入內容
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入內容:");
		// 讀取使用者輸入的內容
		String original = scan.nextLine();
		while (original.isEmpty() || original == null) {
			System.out.println("輸入內容不能為空值，請重新輸入:");
			original = scan.nextLine();//重新讀取內容再丟到original變數裡
		}
		scan.close();
		//呼叫底下函式
		ReverseChars output = new ReverseChars();
		String reverseCharacters = output.reverseCharacters(original);
		System.out.println(reverseCharacters);

	}

	//將字串做顛倒
	private String reverseCharacters(String input) {

		String reverse = "";
		//input.length() - 1，index是從0開始，所以長度減1才是最後一個字母
		for (int i = input.length()-1; i >= 0; i--) {
			//
			reverse = reverse + input.charAt(i);//把最後一個字母取出來然後依序放置reverse變數裡
		}
		return reverse;
	}

}
