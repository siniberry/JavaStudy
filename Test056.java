/*============================================
  ���� ���� �帧�� ��Ʈ��(���) ����
============================================*/

// �ݺ���(while��) �ǽ�

// ����ڷκ��� ���ϴ� ��(������)�� �Է¹޾�
// �ش��ϴ� �������� ����ϴ� ���α׷��� �����Ѵ�
// ��, 1�� ~ 9�� ������ ���� �Է¹��� ��Ȳ�� �ƴ϶��
// �̿� ���� �ȳ��� �� �� ���α׷��� ������ �� �ֵ��� ó���Ѵ�

// ���� ��)
// ���ϴ� ��(������) �Է� : 7
// 7 * 1 = 7
// 7 * 2 = 14
// 7 * 3 = 21
//    :
// 7 * 9 = 63
// ����Ϸ��� �ƹ� Ű�� ��������...

// ���ϴ� ��(������) �Է� : 7
// 1���� 9������ ������ �Է��� �����մϴ�.
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io. BufferedReader;
import java.io.IOException;
import java.io. InputStreamReader;

public class Test056
{
	public static void main(String[]args)throws IOException
	{
		// ���� Ǯ���� ���� 

		/*
		
		// �ֿ� ���� ���� �� �ʱ�ȭ
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		
		int a;
		int b = 1;
		int result=0;


		// ���� �� ó��
		System.out.print("���ϴ� ��(������) �Է� : ");
		a = Integer. parseInt(br.readLine());
		
		while (b<=9)
		{
			result = a *b;
		if (a<1||a>9)
		{
			System.out.println("1���� 9������ ������ �Է��� �����մϴ�.");
			break;
		}
			System.out.printf("%d * %d = %d\n",a,b,result);
			b++;
		}
		*/

		// �ֿ� ���� ���� �� �ʱ�ȭ
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		
		int dan;
		


		// ���� �� ó��
		System.out.print("���ϴ� ��(������) �Է� : ");
		dan = Integer. parseInt(br.readLine());

		if (dan<1 || dan>9)
		{
			System.out.println("1���� 9������ ������ �Է��� �����մϴ�.");
			return;
		}
		int n =0;
		while (n<9)
		{
			n++;
			System.out.printf("%d * %d = %d\n",dan,n,(dan*n));
		}
		
	}
}