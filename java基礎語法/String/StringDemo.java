package String;

public class StringDemo {

	public static void main(String[] args) {
		// �����Ӧr��ȬO�_�@��
		String x="Hello";
		String y="Hello";
		System.out.println(x==y);//true
		//���P������n������e�ɡA�n��equals�Ӥ��
		String z=new String("Hello");
		System.out.println(z==x);//false
		System.out.println(z.equals(x));//true
	}

}
