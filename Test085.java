/*===================
  ���� �迭 ����
====================*/

// �迭�� ����� �ʱ�ȭ
// �迭�� �⺻�� Ȱ��

// �� ����
//	  ����ڷκ��� ������ ������ ������ ������ŭ �Է¹޾�
//	  �Է¹��� �� �߿��� ���� ū ���� ����ϴ� ���α׷��� �ۼ��Ѵ�.
//	  ��, �迭�� Ȱ���Ͽ� ������ �� �ֵ��� �Ѵ�.

// ���� ��)
// �Է��� ������ ����     : 12
// ������ �Է�(���� ����) : 74 65 13 91 5 67 33 41 2 50 11 38
// >> ���� ū �� �� 91
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.util.Scanner;
import java.io.IOException;


public class Test085
{
	public static void main(String[]args)throws IOException
	{
		// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);		
		
		// ����ڷκ��� �Է��� ������ ���� �Է� �ޱ�
		System.out.print("�Է��� ������ ����     : ");
		
		//�Է� ���� ������ ���� ���� �� ó�� 
		int n = sc.nextInt();		//--==>> ������ ����
		int m=0;					//--==>> ���� ū ���� ��Ƶ� ����
		
		
		// ����ڰ� �Է��� ����ŭ num ���� �迭 ����
		int [] num = new int[n];
		
		// ����ڰ� �Է��� n�� �� ��ŭ ������ �Է� �ޱ�
		System.out.print("������ �Է�(���� ����) : ");
		
		// for �������� �Է°� ��Ƴ���
		for (int i=0 ;i<n ;i++ )
		{			
			num[i] = sc.nextInt();
			
			// for������ ���� ���� m�� ���� ū �� ���
			if (m<num[i])
			{
				m= num[i];	
			}
			
		}
		// ��� ���
		System.out.printf(">> ���� ū �� �� %d\n",m);
			
		

	}
}

// ���� ���

/*
�Է��� ������ ����     : 12
������ �Է�(���� ����) : 74 65 13 91 5 67 33 41 2 50 11 38
>> ���� ū �� �� 91
����Ϸ��� �ƹ� Ű�� ��������...
*/