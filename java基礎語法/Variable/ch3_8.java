package Variable;

public class ch3_8 {

	public static void main(String[] args) {
		// 不同進位的表示
		int x;
		long y;

		x = 103;// 10進位
		System.out.println("列印103的值:" + x);

		x = 0b111;// 2進位0b或0B開頭
		System.out.println("列印2進位的值:" + x);

		y = 022;// 0開頭代表8進位
		System.out.println("列印8進位的值:" + y);

		y = 0x2B;// 0x或0X代表16進位
		System.out.println("列印16進位的值:" + y);

		// 查詢8種型態的最大值和最小值
		System.out.println("byte-max:" + Byte.MAX_VALUE + ",byte-min:" + Byte.MIN_VALUE);
		System.out.println("short-max:" + Short.MAX_VALUE + ",short-min:" + Short.MIN_VALUE);
		System.out.println("int-max:" + Integer.MAX_VALUE + ",short-min:" + Integer.MIN_VALUE);
		System.out.println("long-max:" + Long.MAX_VALUE + ",short-min:" + Long.MIN_VALUE);
		System.out.println("float-max:" + Float.MAX_VALUE + ",short-min:" + Float.MIN_VALUE);
		System.out.println("double-max:" + Double.MAX_VALUE + ",short-min:" + Double.MIN_VALUE);
	}

}
