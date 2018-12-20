package Method;

public class MethodPractical {

	public static void main(String[] args) {
		// 呼叫其他函式用的
		findGrade("Penny",80);
		findGrade("Jinny",90);

	}

	public static void findGrade(String student, int score) {
		String grade;
		if (score >= 90 && score <= 100) {
			grade = "A";
		} else if (score >= 80 && score < 90) {
			grade = "B";
		} else if (score >= 70 && score < 80) {
			grade = "C";
		} else {
			grade = "D";
		}
		System.out.println("學生:" + student + ",級距:" + grade);
	}

}
