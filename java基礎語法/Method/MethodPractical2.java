package Method;

public class MethodPractical2 {
	// 方法返回值類型

	public static void main(String[] args) {
		// 呼叫其他函式用的
		String studentName = "Penny";
		String grade = findGrade(90);
		displayGrade(studentName, grade);

		studentName = "Ginny";
		grade = findGrade(70);
		displayGrade(studentName, grade);
	}

	public static String findGrade(int score) {
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
		return grade;// 要將grade返回值，所以要將void移除並加String，若為整數要加int
	}

	// 因為印出有用到grade，所以參數裡面要加String grade
	public static void displayGrade(String studentName, String grade) {
		System.out.println("------------------");
		System.out.println("學生:" + studentName + ",級距:" + grade);
		System.out.println("------------------");
	}

}
