package Condition;

public class ForDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�C�Lfor�̭����ƭ�
//		for(int i=0;i<10;i++) {
//			System.out.println("�C�Li:"+i);
//		}
		//�`�Ϊ�for:�C�L�}�C�̭������e(���)
		int[] intArray= {10,40,30};
		for(int i=0;i<intArray.length;i++) {
			System.out.println(intArray[i]);
		}
		
		//�`�Ϊ�for:�C�L�}�C�̭������e(�r��)
		String[] strArray= {"A","B","C"};
		for(int i=0;i<strArray.length;i++) {
			System.out.println(strArray[i]);
		}
		//�d��2:�u��Ω󶰦X�M�Ʋ�
		for(int num:intArray) {
			System.out.println("�Ʋխ�:"+num);
		}
		for(String str:strArray) {
			System.out.println("�Ʋխ�:"+str);
		}
	}

}
