/*============================================
  ���� ���� �帧�� ��Ʈ��(���) ����
============================================*/

// if��
// if ~ else �� �ǽ�

// ����ڷκ��� ������ ���� ������ �Է¹޾�
// ���� ������ ū �� ������ ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ù ��° ���� �Է� : 7
// �� ��° ���� �Է� : 70
// �� ��° ���� �Է� : 42

// >> ���� ��� : 7 42 70

// ��Ʈ :  7   70  42

//  �� ù ��° ���� vs �� ��° ����  ũ�� �� �� �ڸ��ٲ�
//	   �� ù ��° ������ �� ��° �������� Ŭ ���... �ڸ� �ٲ�

//  �� ù ��° ���� vs �� ��° ����  ũ�� �� �� �ڸ��ٲ�
//	   �� ù ��° ������ �� ��° �������� Ŭ ���... �ڸ� �ٲ�

//  �� �� ��° ���� vs �� ��° ����  ũ�� �� �� �ڸ��ٲ�
//	   �� �� ��° ������ �� ��° �������� Ŭ ���... �ڸ� �ٲ�

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test039
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
	
		int a,b,c;		// ����ڰ� �Է��ϴ� ������ ������ ��Ƶ� ����

		System.out.print("ù ��° ���� �Է� : ");
			a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
			b = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
			c = Integer.parseInt(br.readLine());

		//  �� ù ��° ����(a)�� �� ��° ����(b)���� Ŭ ���... �ڸ� �ٲ�

		if (a>b)
		{
			a=a^b;
			b=b^a;
			a=a^b;
		}

		//  �� ù ��° ����(a)�� �� ��° ����(c)���� Ŭ ���... �ڸ� �ٲ�
		if (a>c)
		{
			a=a^c;
			c=c^a;
			a=a^c;
		}
		//  �� �� ��° ����(b)�� �� ��° ����(c)���� Ŭ ���... �ڸ� �ٲ�
		if (b>c)
		{
			b=b^c;
			c=c^b;
			b=b^c;
		}
			
		// ����������
		System.out.printf("\n>> ���� ��� : %d  %d  %d\n",a,b,c);

		
		
		
	}
}