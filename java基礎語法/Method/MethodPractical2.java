package Method;

public class MethodPractical2 {
	// ��k��^������

	public static void main(String[] args) {
		// �I�s��L�禡�Ϊ�
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
		return grade;// �n�Ngrade��^�ȡA�ҥH�n�Nvoid�����å[String�A�Y����ƭn�[int
	}

	// �]���L�X���Ψ�grade�A�ҥH�ѼƸ̭��n�[String grade
	public static void displayGrade(String studentName, String grade) {
		System.out.println("------------------");
		System.out.println("�ǥ�:" + studentName + ",�ŶZ:" + grade);
		System.out.println("------------------");
	}

}
