package String;

public class StringMethod {

	public static void main(String[] args) {
		String str = "This is my course";
		System.out.println("���X�r�����:" + str.length());
		System.out.println("���X�r�ꪺ�ĴX�ӭ�:" + str.charAt(3));
		System.out.println("�r��s��:" + str.concat(" ����"));
		System.out.println("�r��O�_�]�t:" + str.contains("is"));
		System.out.println("�r�ꪺ�}�l���e�O�_��his:" + str.startsWith("his"));
		System.out.println("�r�ꪺ�������e�O�_��course:" + str.endsWith("course"));
		// ����r�ꤺ�e�O�_�@�ˡA�n��equals
		String a = "Hello";
		String b = new String("Hello");
		System.out.println("a.equals(b):" + a.equals(b));
		System.out.println("a==b:" + (a == b));
		System.out.println("�r��X�{�����ަ�m" + str.indexOf("m"));
		String str2 = "";
		System.out.println("�r��O�_���ŭ�:" + str.isEmpty());
		System.out.println("�r��O�_���ŭ�:" + str2.isEmpty());
		String str3 = "    Hello  world";
		System.out.println("�h���Ů�:" + str3.trim());// ���]�t�������Ů�
		System.out.println("�r�Ŧ�N��" + str.replace("course", "�ҵ{"));
		System.out.println("��X�r�Ŧ�" + str.substring(3));// �|��X3~�̫�@�ӭ�
		System.out.println("��X�r�Ŧ�d��" + str.substring(5, 10));// ���]�t��10�ӭ�
		// �N�r�Ŧ�ƻs��Unicode�r�Ŧ��
		char charArray[] = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.println("��" + i + "�O" + charArray[i]);
		}
		System.out.println("�ഫ���p�g�r��"+str.toLowerCase());
		System.out.println("�ഫ���p�g�r��"+str.toUpperCase());
	}

}
