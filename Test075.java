/*================================
  ���� Ŭ������ �ν��Ͻ� ����
=================================*/

// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// �ش� ������ �����ϴ� ���α׷��� �����Ѵ�.
// ��, Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ �� ���� �Է�(���� ����) : 10 5
// ������ ������ �Է� (+ - * /)   : +
// >> 10 + 5 =- 15
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.util. Scanner;
import java.io. IOException;

class Calculate
{
	int a,b;
	char c;

	void input()throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �� ���� �Է�(���� ����) : ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.print("������ ������ �Է� (+ - * /)   : ");
		c=(char)System.in.read();
	}

	int cal()
	{
		int result=0;
		/*
		if (c=='+')
		{
			result = a + b;
			return result;// �̷��� �ϴ��� �ƴϸ� �ۿ��� �����������
	    }		
		else if (c=='-')
			result = a - b;

		else if (c=='*')
			result = a * b;

		else if (c == '/')
			result = a / b;

		else
		return result;
		*/



		switch (c)
		{
		case  '+' : result = a + b;break;
		case  '-' : result = a - b;break;
		case  '*' : result = a * b;break;
		case  '/' : result = a / b;break;
		// default�� ���� ������ default : result =-9999 �̷� ������ �ϴ� �� �ٶ��� ��
		
		}

		return result;
	}


	void print(int sum)
	{
		System.out.printf(">> %d %c %d = %d",a,c,b,sum);
	}
}
public class Test075
{
	public static void main(String[]args)throws IOException
	{
		Calculate ob = new Calculate();

		ob.input();
		int a =ob.cal();
		ob.print(a);
	}
}

// ��� ���

/*
������ �� ���� �Է�(���� ����) : 250 50
������ ������ �Է� (+ - * /)   : -
>> 250 - 50 = 200����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/