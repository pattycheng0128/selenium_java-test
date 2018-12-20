package Variable;

public class ch3_5 {

	public static void main(String[] args) {
		// 設定有意義的變數名稱
		int hourly_salary = 200;// 時薪
		int monthly_fee = 10000;// 月花費
		int annual_salary, annual_fee, annual_savings;
		// 計算年薪多少?
		annual_salary = hourly_salary * 8 * 300;
		System.out.println("年薪:" + annual_salary);
		// 計算年花費
		annual_fee = monthly_fee * 12;
		System.out.println("年花費:" + annual_fee);
		// 計算年儲蓄
		annual_savings = annual_salary - annual_fee;
		System.out.println("年儲蓄:" + annual_savings);

	}

}
