/*============================================
  ���� ���� �帧�� ��Ʈ��(���) ����
============================================*/

// return �ǽ�

// �� return Ű���尡 ���ϴ� �ǹ�
//	  1. ���� ��ȯ
//    2. �޼ҵ��� ����

import java.io. IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test069
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		int n, s;

		System.out.print("������ ���� �Է�(10�̻�) : ");
		n = Integer.parseInt(br.readLine());

		if (n<10)
		{
			System.out.println("10 �̻��� ������ �Է��ؾ� �մϴ�.");
			return;
			//---- �޼ҵ� ���� �� ���� ��� : main() �޼ҵ� �� ���α׷� ����
		}

		s=0;
		for (int i=1;i<=n ;i++ )
		{
			s += i;
		}
	
		System.out.println("��� : " + s);
	
	}
}