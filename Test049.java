/*============================================
  ���� ���� �帧�� ��Ʈ��(���) ����
============================================*/

// �ݺ���(while��) �ǽ�

//1���� 100������ ���� �� �� : 5050
//1���� 100������ ¦���� �� : 2550
//1���� 100������ Ȧ���� �� : 2500

public class Test049
{
	public static void main(String[]args)
	{
		int a=0;
		int sum=0;
		int esum=0;
		int hsum=0;

		while (a<=100)
		{  sum+=a;
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
		System.out.println("1���� 100������ ������ �� : "+sum);
		System.out.println("1���� 100������ ¦���� �� : " + esum);
		System.out.println("1���� 100������ Ȧ���� �� : " + hsum);
	}
}