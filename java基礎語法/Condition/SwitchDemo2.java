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
			numWeek="�P���@";
			break;
		case 2:
			numWeek="�P���G";
			break;
		case 3:
			numWeek="�P���T";
			break;
		case 4:
			numWeek="�P���|";
			break;
		case 5:
			numWeek="�P����";
			break;
		case 6:
			numWeek="�P����";
			break;
		case 7:
			numWeek="�P����";
			break;
		default:
			System.out.print("�L��");
			break;
		}
		return numWeek;
	}
	
}
