/*============================================
  ���� ���� �帧�� ��Ʈ��(���) ����
============================================*/

// �ݺ���(while��) �ǽ�

// 1/2 + 2/3 + 3/4 + ... +9/10 �� ���� ó�� �����
// ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ���� ��� : xxxx(�� �Ǽ� ��� ���� )
// ����Ϸ��� �ƹ� Ű�� ��������...



public class Test051
{
	public static void main(String[]args)
	{/*
		// �ֿ� ���� ���� �� �ʱ�ȭ
		int n=0;			// 1���� 1�� �����ϰ� �� ����
		double sum=0;		// �������� ��Ƴ� ����(�Ǽ� ���·� ó��)
		
		// ���� �� ó��
		while (n<9) // -- 0 1 2 3 4 5 6 7 8
		{
			// ������ ����
			// ���������� �ݺ����� ������ ���ʶ߸��� �Ǵ� ���谡 �Ǵ� ����
			n++;		// -- 1 2 3 4 5 6 7 8 9

			sum += (double)n/(n+1); // -- 1.0/2 2.0/3 3.0/4
			// -- ���� ��� ������ ������ ���� ��ȯ�ϱ� ������
			//	  �Ǽ� ��� ������ �����ϵ��� ó���ϱ� ���ؼ�
			//	  ������ �����ڸ� �߽����� �ǿ����� �� �ϳ���
			//    �Ǽ� ���·� ������ִ� ���� �߿�����
	
		}

		// ��� ���

		
*/
	
		
		double a = 1.0;
		double b = 2.0;
		double sum = 0;
		while (a<=9)
		{
			if (b<=10)
			{
				sum+=a/b;
			}
		a++;
		b++;
		}
		System.out.printf("���� ��� : %.6f%n", sum);
		
	}
}

// ��� ���

/*
���� ��� : 7.071032
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
���� ��� : 7.071032
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/