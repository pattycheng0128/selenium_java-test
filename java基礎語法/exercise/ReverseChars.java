package exercise;

import java.util.Scanner;

public class ReverseChars {

	public static void main(String[] args) {
		// ��user��J���e
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J���e:");
		// Ū���ϥΪ̿�J�����e
		String original = scan.nextLine();
		while (original.isEmpty() || original == null) {
			System.out.println("��J���e���ର�ŭȡA�Э��s��J:");
			original = scan.nextLine();//���sŪ�����e�A���original�ܼƸ�
		}
		scan.close();
		//�I�s���U�禡
		ReverseChars output = new ReverseChars();
		String reverseCharacters = output.reverseCharacters(original);
		System.out.println(reverseCharacters);

	}

	//�N�r�갵�A��
	private String reverseCharacters(String input) {

		String reverse = "";
		//input.length() - 1�Aindex�O�q0�}�l�A�ҥH���״�1�~�O�̫�@�Ӧr��
		for (int i = input.length()-1; i >= 0; i--) {
			//
			reverse = reverse + input.charAt(i);//��̫�@�Ӧr�����X�ӵM��̧ǩ�mreverse�ܼƸ�
		}
		return reverse;
	}

}
