/* ================================
  ���� �ڹ� �⺻ ���α׷��� ����
  ================================= */

// ������ �ڷ���
// Ű���� �� �ĺ���
//printf()

public class Test007
{
	public static void main(String[] args)
	{
		// �ֿ� ���� ���� �� �ʱ�ȭ
		int a=10, b=5;
		int c, d ;

		// ���� �� ó��
		c = a + b;
		d = a - b;

		// ��� ���
		System.out.println(c);
		System.out.println(d);
		//��15
		//  5
					
		// ��� ��� �� ��10 + 5 = 15��
		System.out.println( a + " + " + b + " = " + c);
		//��10 + 5 = 15
		/*				  ���� ���ڿ�  ���� ���ڿ� ����
			�ڹٿ����� ���� �ٸ� �ڷ����� �����͵鳢����
			��+�� ������ �����ϸ�,
			�ٸ� � �ڷ����� ���ڿ� ������ ��+�� ���� ����� ���ڿ�
			��, ���ڿ� ���� �����ڷν� ��+��
													*/
		
		// print() / println() / printf() / format()

		// printf() / format () 
		// JDK 1.5 ���� �����Ǵ� �޼ҵ� (���� ��¿� �޼ҵ�)
		//System.out.printf(" ��+��=��",10,20,30);
		System.out.printf("%d + %d = %d\n",10,20,30);
		System.out.printf("%d + %d = %d%n",10,20,30);

		//�� 10 + 20 = 30
		//	 10 + 20 = 30

		//System.out.printf("%d �� %d\n", 10, 3.14);
		//�� ��Ÿ�� ���� �߻� (�����Ϸ���  () �ȱ����� �˻� X
		System.out.printf("%d �� %f\n", 10, 3.14);
		//�� �Ǽ����� ���� %f
		//�� 10 �� 3.140000

		System.out.printf("%.2f\n",3.141592);
		//�� �Ҽ��� ���� �� ��° �ڸ����� ǥ��
		System.out.printf("%.3f\n",3.141592);
		//�� �Ҽ��� ���� �� ��° �ڸ����� ǥ�� (�ݿø� �߻�)
		System.out.printf("%.4f\n",3.141592);
		//�� �Ҽ��� ���� �� ��° �ڸ����� ǥ�� (�ݿø� �߻�)
		// ��3.14
		//   3.142
		//   3.1416


	}
}

// ���� ���
/*
15
5
10 + 5 = 15
10 + 20 = 30
10 + 20 = 30
10 �� 3.140000
3.14
3.142
3.1416
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/