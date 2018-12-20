package Condition;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numDay = numOfDay(2000, 12);
		System.out.println(numDay);
	}

	static int numOfDay(int year, int month) {
		int numDay = 0;
		switch (month) {
		case 1:
			numDay = 31;
			break;
		case 2:
			if (numDay % 400 == 0) {
				numDay = 29;
			} else {
				numDay = 28;
			}
			break;
		case 3:
			numDay = 31;
			break;
		case 4:
			numDay = 30;
			break;
		case 5:
			numDay = 31;
			break;
		case 6:
			numDay = 30;
			break;
		case 7:
			numDay = 31;
			break;
		case 8:
			numDay = 31;
			break;
		case 9:
			numDay = 30;
			break;
		case 10:
			numDay = 31;
			break;
		case 11:
			numDay = 30;
			break;
		case 12:
			numDay = 31;
			break;
		default:
			System.out.println("無效的月份");
			break;
		}
		return numDay;

	}

}
