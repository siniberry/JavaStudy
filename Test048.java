/*============================================
  ���� ���� �帧�� ��Ʈ��(���) ����
============================================*/

// �ݺ���(while��) �ǽ�

// 1���� 100������ ���� �߿���
// ¦������ �հ� Ȧ������ ���� ���� �����Ͽ� ����Ѵ�.
// �׸��� ������� ����ϴ� ���α׷��� �����Ѵ�.
// ��, �ݺ����� while���� ����� �� �ֵ��� �ϸ�,
// ���� ������ if ���ǹ��� ����Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// 1���� 100 ������ ������
// ¦���� �� : 2550
// Ȧ���� �� : 2500


public class Test048
{
	public static void main(String[]args)
	{
		int a = 0;
		int esum=0;
		int hsum = 0;

		while (a<=100)
		{
			if (a%2==0)
			{
				esum+=a;
			}
			else if (a%2!=0)
			{
				hsum+=a;
			}
			else
			{
				System.out.println("�Ǻ� �Ұ� ������");
				return;
			}
			a++;
		}
			
	
		System.out.println("1���� 100������ ���� ��");
		System.out.println("¦���� �� : "+esum);
		System.out.println("Ȧ���� �� : "+hsum);
	}
}

//���� ���

/*
1���� 100������ ���� ��
¦���� �� : 2550
Ȧ���� �� : 2500
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/