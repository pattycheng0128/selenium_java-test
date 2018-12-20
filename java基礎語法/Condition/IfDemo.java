package Condition;

public class IfDemo {
	public static void main(String[] args) {
		int score=50;
		String grade;
		if(score>=90 && score<=100) {
			grade="A";
		}else if(score>80 && score<90) {
			grade="B";
		}else {
			grade="C";
		}
		System.out.println("¯Å¶Z:"+grade);
		System.out.println("¤À¼Æ:"+score);
	}
}
