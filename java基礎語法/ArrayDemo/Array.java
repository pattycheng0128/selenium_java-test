package ArrayDemo;

import java.util.Arrays;

public class Array {

		public static void main(String[] args) {
			int[] array;// �ŧi�W�٬�array�}�C��int���O
			array = new int[10];// ����10�ӭȵ�array�}�C
			array[0] = 100;//���w��1�Ӽƭ�
			array[1] = 102;//���w��2�Ӽƭ�
			System.out.println("��0�ӯ���:" + array[0]);
			System.out.println("��1�ӯ���:" + array[1]);
			System.out.println("��2�ӯ���:" + array[2]);//�����w�|��ܼƭ�0
			
			int[] array2= {1,2,8,44,3,66};
			System.out.println("��0�ӯ���:" + array2[5]);
			
			String[] stringArray= {"A","B","C"};
			System.out.println("��0�ӯ���:" + stringArray[0]);
			System.out.println("��0�ӯ���:" + stringArray[1]);
			System.out.println("��0�ӯ���:" + stringArray[2]);
			
			//�}�C������
			int len1=array.length;
			int len2=stringArray.length;
			System.out.println("��ƫ��O���}�C����:"+len1);
			System.out.println("�r�Ŧꪺ�}�C����:"+len2);
			
			//��for�j��ӦL�X�}�C�̭������e
			int[] array3= {44,33,6,1,9,99};
			String str=" ";
			for(int i=0;i<array3.length;i++) {
				System.out.print(array3[i]+str);
			}
			System.out.println();
			Arrays.sort(array3);
			for(int i=0;i<array3.length;i++) {
				System.out.print(array3[i]+str);
			}
		}

	}

