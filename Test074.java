/*================================
  ���� Ŭ������ �ν��Ͻ� ����
=================================*/

// ����ڷκ��� ������ ������ �Է¹޾�
// 1 ���� �Է¹��� �� ������ ���� �����Ͽ�
// ������� ����ϴ� ���α׷��� �����Ѵ�.

// ��, Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
// ����, �Է� ó�� �������� BufferedReader�� readLine() �� ����ϸ�,
// �Է� �����Ͱ� 1 ���� �۰ų� 1000 ���� ū ���
// �ٽ� �Է¹��� �� �ִ� ó���� �����Ͽ� ���α׷��� ������ �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ ���� �Է� (1~1000) : 1050
// ������ ���� �Է� (1~1000) : -45
// ������ ���� �Է� (1~1000) : 100
// >> 1~100 ������ �� : 5050
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Hap
{
	// �ֿ� ���� ����(������� �Է°��� ��Ƴ� ����)
	int su;

	// �Է� �޼ҵ� ����
	void input()throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		do
		{
			System.out.print("������ ���� �Է�(1~1000) : ");
			su = Integer.parseInt(br.readLine());
		}
		while (1>su||1000<su);		
	}
	
	// ���� ó�� �޼ҵ� ����
	int calculate()
	{
			int result = 0;
			
			for (int i=1;i<=su ;i++ )
			result += i;
			
			return result;
	}	

	// ��� ��� �޼ҵ� ����
	void print(int sum)
	{
		System.out.printf(">> 1 ~ %d ������ �� : %d\n",su,sum);
	}
}
public class Test074
{
	public static void main(String[]args)throws IOException
	{	
		// Hap �ν��Ͻ� ����
		Hap ob = new Hap();

		// ������ �ν��Ͻ��� ���� �Է� �޼ҵ� ȣ�� �� input()
		// ----------------------
		//	   �������� Ȱ��

		ob. input();

		// ������ �ν��Ͻ��� ���� ���� ó�� �޼ҵ� ȣ�� �� calculate()
		int a=ob. calculate();

		// ������ �ν��Ͻ�(ob)�� ���� ��� �޼ҵ� ȣ�� �� print()
		// ob. print(calculate());
		ob.print(a);
	}
}

// ���� ���

/*
������ ���� �Է�(1~1000) : 10000
������ ���� �Է�(1~1000) : -20
������ ���� �Է�(1~1000) : 200
>> 1 ~ 200 ������ �� : 20100
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/