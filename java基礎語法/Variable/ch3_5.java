package Variable;

public class ch3_5 {

	public static void main(String[] args) {
		// �]�w���N�q���ܼƦW��
		int hourly_salary = 200;// ���~
		int monthly_fee = 10000;// ���O
		int annual_salary, annual_fee, annual_savings;
		// �p��~�~�h��?
		annual_salary = hourly_salary * 8 * 300;
		System.out.println("�~�~:" + annual_salary);
		// �p��~��O
		annual_fee = monthly_fee * 12;
		System.out.println("�~��O:" + annual_fee);
		// �p��~�x�W
		annual_savings = annual_salary - annual_fee;
		System.out.println("�~�x�W:" + annual_savings);

	}

}
