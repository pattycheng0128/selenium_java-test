package Variable;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 整數型態有四個byte,short,int,long */

		/* byte是8位元: -128 ~ +127 ,範圍:-2^7~2^7-1 */
		byte myByte = 127;
		byte myByte2 = -128;
		System.out.println("byte " + "max:" + myByte + ",min:" + myByte2);

		/* short是16位元: -32768~+32767,範圍:-2^15~2^15-1 */
		short myShort = 32767;
		short myShort2 = -32768;
		System.out.println("short " + "max:" + myShort + ",min:" + myShort2);

		/* int是32位元:-2147483648~2147483647範圍:-2^31~2^31-1 */
		int myInt = 2147483647;
		int myInt2 = -2147483648;
		System.out.println("int " + "max:" + myInt + ",min" + myInt2);

		/* long是64位元:–9223372036854775808 到 9223372036854775807,-2^63~2^63-1 */
		long mylong = 9223372036854775807l;
		long mylong2 = -9223372036854775808l;
		System.out.println("long:" + "max:" + mylong + ",min:" + mylong2);

		/* 浮點數有兩個:float,double */
		float myFloat = 2.0f;
		System.out.println("float:" + myFloat);

		double mydouble = 1.05;
		System.out.println("mydouble:" + mydouble);

		/* 字元 */
		char myChar = 'A';
		System.out.println("myChar:" + myChar);
		
		/* 布林值 */
		boolean myBoolean = true;
		System.out.println("myBoolean:" + myBoolean);

	}

}
