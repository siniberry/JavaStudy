/*============================================
  ���� ���� �帧�� ��Ʈ��(���) ����
============================================*/

// if ~ else �� �ǽ�

// 1. ���α׷��� �ۼ��� �� �־��� ���ǿ� ����
//	  �б� ������ ���ϱ� ���� ����ϴ� �������
//	  if��, if~else��, ���ǿ�����, ����if��(if�� ��ø),
//	  switch ���� �ִ�.

// 2. if���� if ������ ������ ���� ���
//    Ư�� ������ �����ϰ��� �� �� ���Ǵ� �����̴�.

// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// �ش� �������� ���� ó�� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, if ���ǹ��� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�,
// ���� ����� ���ǻ� ���� ������� ó���� �� �ֵ��� �Ѵ�.

// ���� ��)
// ù ��° ���� �Է�    : 10
// �� ��° ���� �Է�    :  3
// ������ �Է�[+ - * /] :  +

// >> 10 + 3 = 13
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Test038
{
	public static void main(String[]args)throws IOException
	{
		/*
		BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
			
			int a, b,ej,ak,rh,sk;
			char A;

			System.out.print("ù ��° ���� �Է�    : ");
			a=Integer.parseInt(br.readLine());

			System.out.print("�� ��° ���� �Է�    : ");
			b=Integer.parseInt(br.readLine());

			// Integer.parseInt()
			// "1234" �� Integer.parseInt() �� 1234
			// "ABCD" �� Integer.parseInt() �� (��)
			
			// br.readLine(); �� ���ڿ� (��)

			System.out.print("������ �Է�[+ - * /] : ");
			A=(char)System.in.read();
			//      ----------------- �� �ڵ�����ȯ ��Ģ�� ���� ��������� �տ� char

			ej = a + b;
			ak = a - b;
			rh = a * b;
			sk = a / b;

			if (A=='+')
			{
				System.out.printf("\n>> %d + %d = %d\n",a,b,ej);
			}
			else if (A=='-')
			{
				System.out.printf("\n>> %d - %d = %d\n",a,b,ak);
			}
			else if (A=='*')
			{
				System.out.printf("\n>> %d * %d = %d\n",a,b,rh);
			}
			else if (A=='/')
			{
				System.out.printf("\n>> %d / %d = %d\n",a,b,sk);
			}
			else
			{
				System.out.println("\n>> �Է� ������ ������ �����մϴ�.");
			}
			*/

			// ��� ��
			/*
			BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
			
			int a, b,op;		// ù ��°, �� ��° ����, ������

			System.out.print("ù ��° ���� �Է�    : ");
			a=  Integer.parseInt(br.readLine());


			System.out.print("�� ��° ���� �Է�    : ");
			b = Integer.parseInt(br.readLine());

			System.out.print("������ �Է�[+ - * /] : ");
			op = System.in.read();

			if (op==43)
			{
				System.out.printf("%n>> %d + %d = %d%n",a,b,(a+b));
			}
			else if (op==45)
			{
				System.out.printf("%n>> %d - %d = %d%n",a,b,(a-b));
			}
			else if (op==42)
			{
				System.out.printf("%n>> %d * %d = %d%n",a,b,(a*b));
			}
			else if (op==47)
			{
				System.out.printf("%n>> %d / %d = %d%n",a,b,(a/b));
			}
			else
			{
				System.out.println("\n>> �Է� ������ ������ �����մϴ�.");
			}
			*/

			// ��� ��

			BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));

			int a,b, result=0;
			char op;
			
			System.out.print("ù ��° ���� �Է�    : ");
			a=  Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է�    : ");
			b=  Integer.parseInt(br.readLine());
			System.out.print("������ �Է�[+ - * /] : ");
			op = (char)System.in.read();
			

				if(op=='+')
					result = a + b;
				else if (op=='-')
					result = a - b;
				else if (op=='*')
					result = a * b;
				else if (op=='/')
					result = a / b;

				System.out.printf("\n>> %d %c %d= %d%n",a,b,result");

	}
}