package Variable;

public class ch3_8 {

	public static void main(String[] args) {
		// ���P�i�쪺���
		int x;
		long y;

		x = 103;// 10�i��
		System.out.println("�C�L103����:" + x);

		x = 0b111;// 2�i��0b��0B�}�Y
		System.out.println("�C�L2�i�쪺��:" + x);

		y = 022;// 0�}�Y�N��8�i��
		System.out.println("�C�L8�i�쪺��:" + y);

		y = 0x2B;// 0x��0X�N��16�i��
		System.out.println("�C�L16�i�쪺��:" + y);

		// �d��8�ث��A���̤j�ȩM�̤p��
		System.out.println("byte-max:" + Byte.MAX_VALUE + ",byte-min:" + Byte.MIN_VALUE);
		System.out.println("short-max:" + Short.MAX_VALUE + ",short-min:" + Short.MIN_VALUE);
		System.out.println("int-max:" + Integer.MAX_VALUE + ",short-min:" + Integer.MIN_VALUE);
		System.out.println("long-max:" + Long.MAX_VALUE + ",short-min:" + Long.MIN_VALUE);
		System.out.println("float-max:" + Float.MAX_VALUE + ",short-min:" + Float.MIN_VALUE);
		System.out.println("double-max:" + Double.MAX_VALUE + ",short-min:" + Double.MIN_VALUE);
	}

}
