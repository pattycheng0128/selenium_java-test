package Variable;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* ��ƫ��A���|��byte,short,int,long */

		/* byte�O8�줸: -128 ~ +127 ,�d��:-2^7~2^7-1 */
		byte myByte = 127;
		byte myByte2 = -128;
		System.out.println("byte " + "max:" + myByte + ",min:" + myByte2);

		/* short�O16�줸: -32768~+32767,�d��:-2^15~2^15-1 */
		short myShort = 32767;
		short myShort2 = -32768;
		System.out.println("short " + "max:" + myShort + ",min:" + myShort2);

		/* int�O32�줸:-2147483648~2147483647�d��:-2^31~2^31-1 */
		int myInt = 2147483647;
		int myInt2 = -2147483648;
		System.out.println("int " + "max:" + myInt + ",min" + myInt2);

		/* long�O64�줸:�V9223372036854775808 �� 9223372036854775807,-2^63~2^63-1 */
		long mylong = 9223372036854775807l;
		long mylong2 = -9223372036854775808l;
		System.out.println("long:" + "max:" + mylong + ",min:" + mylong2);

		/* �B�I�Ʀ����:float,double */
		float myFloat = 2.0f;
		System.out.println("float:" + myFloat);

		double mydouble = 1.05;
		System.out.println("mydouble:" + mydouble);

		/* �r�� */
		char myChar = 'A';
		System.out.println("myChar:" + myChar);
		
		/* ���L�� */
		boolean myBoolean = true;
		System.out.println("myBoolean:" + myBoolean);

	}

}
