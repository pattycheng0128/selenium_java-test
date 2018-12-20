package Condition;

public class SwitchDemo2 {

	public static void main(String[] args) {
		String numWeek=numOfWeek(8);
		System.out.println(numWeek);
		
	}

	static String numOfWeek(int week) {
		String numWeek="";
		switch (week) {
		case 1:
			numWeek="星期一";
			break;
		case 2:
			numWeek="星期二";
			break;
		case 3:
			numWeek="星期三";
			break;
		case 4:
			numWeek="星期四";
			break;
		case 5:
			numWeek="星期五";
			break;
		case 6:
			numWeek="星期六";
			break;
		case 7:
			numWeek="星期日";
			break;
		default:
			System.out.print("無效");
			break;
		}
		return numWeek;
	}
	
}
