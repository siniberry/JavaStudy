/*============================================
  ���� ���� �帧�� ��Ʈ��(���) ����
============================================*/

// �ݺ���(while��) �ǽ�

// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������ �Ҽ����� �ƴ����� �Ǻ��Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.

// �� �Ҽ� : 1 �Ǵ� �ڱ� �ڽ��� �� �̿ܿ� � ���ε� ������ �������� �ʴ� ��.
//			 ��, 1�� �Ҽ� �ƴ�.

// ���� ��)
// ������ ���� �Է� : 10
// 10 �� �Ҽ� �ƴ�
// ����Ϸ��� �ƹ� Ű�� ��������...

// ������ ���� �Է� : 11
// 10 �� �Ҽ�
// ����Ϸ��� �ƹ� Ű�� ��������...

// ������ ���� �Է� : 967

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test053
{
	public static void main(String[]args)throws IOException
	{
		// ���� �� ��
		/*
		BufferedReader br = new BufferedReader ( new InputStreamReader (System.in));

		int a ;
		int b =1;

		System.out.print("������ ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		while (b<=a)
		{ b++;
			
			if (a==b)
			{System.out.println(a+" �� �Ҽ�");break;}
			else if (a==1)
			{System.out.println(a+" �� �Ҽ��ƴ�");break;} 
			else if (a%b==0)
			{System.out.println(a + " �� �Ҽ��ƴ�");break;}
			*/


		// �ֿ� ���� ���� �� �ʱ�ȭ
		BufferedReader br = new BufferedReader ( new InputStreamReader (System.in));

		int num ;
		int n =2;		// �Է°��� ������� ������ ������ ������ ����
						// 2���� �����ؼ� 1�� ����
						// ex) �Է°� 27 �� n : 2 3 4 5 6 7 8... 26
		
		// ���� �� ó��
		System.out.print("������ ���� �Է� : ");
		num = Integer.parseInt(br.readLine());
		
		//String result = "�Ҽ���";
		boolean flag = true;		// num(����� �Է°�)�� �Ҽ��� ���̴�~!!!

		while (n<num)
		{ 
			// n ���� num�� ������ ���������� Ȯ��
			if (num%n==0)
			{
				//result = "�Ҽ��ƴϴ�";
				flag = false;		// num�� �Ҽ� �ƴϴ� ~!!!
				break;				// �����. �׸��� ����������.
									// (break �� ���δ� ���� ����� �ݺ���)
			}
			
			
			n++;
			
			
		}
		//System.out.println("result");

		// ��� ��� (��� ���� �����ؾ� �� �߰� Ȯ�� �� 1���� �ƴ����� ���� �߰� ����)
		if (flag && num!=1)
			{
				System.out.printf("%d �� �Ҽ�%n",num);
			}
		else 
			{
				System.out.printf("%d �� �Ҽ��ƴ�%n",num);
			}

	}
}

// ������
/*
������ ���� �Է� : 98
98 �� �Ҽ��ƴ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/