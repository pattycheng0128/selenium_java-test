package exercise;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "This is a string";// �ϥΪ̿�J���e
		String output = reverse(input);// �z�L�禡�h������
		System.out.println("����᪺�r��:" + output);
	}
	
	// �ŧi�禡�Ψ�Ū���ϥΪ̿�J�����e
	private static String reverse(String input) {

		String reverse = "";// �ŧi�@�ӪŦr��᭱�ΨӦs����઺���e
		// �ŭȧP�_
		if (input.isEmpty() || input == null) {
			System.out.println("�z�|����J���e");
		}
		// �P�_�ϥΪ̿�J�����e����
		if (input.length() <= 1) {
			reverse = input;
		} else {
			// \s�N��Ů�A�A�[�@�Ӥϱ׽u�O��Ķ���N��A+�O���@�ӥH�W���Ů�
			//�N�ϥΪ̿�J�����e�z�L�Ů檺�覡�����ΡA�M��N���Ϊ����e�s��boriginalArray�}�C�̭�
			String[] originalArray = input.split("\\s+");
//			for (String item : originalArray) {
//				reverse = item + " " + reverse;
//			}
			//�z�Lfor�j��ӱN���e������
			for (int i = 0; i < originalArray.length; i++) {
				reverse = originalArray[i] + " " + reverse;
			}

		}

		return reverse;// �^�ǭ�
	}

}
