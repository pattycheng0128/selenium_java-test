package Condition;

public class WhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		while (i < 10) {
			i++;
//			System.out.println(i);
			if (i == 2) {
//				break;
				continue;
			}
			System.out.println("i����:" + i);
		}
		System.out.println("�`���~");
	}

}
