/*============================================
  ���� ���� �帧�� ��Ʈ��(���) ����
============================================*/

// switch �� �ǽ�

// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// �ش� �������� ó�� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, switch ���� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�,
// ���� ����� ���ǻ� ���� ���·� ó���� �� �ֵ��� �Ѵ�.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test045
{
	public static void main(String[]args)throws IOException
	{
	
	//��
	/*
	BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));

	int a,b, result=0;
	int op;

	
	System.out.print("ù ��° ���� �Է�    : ");
	a=  Integer.parseInt(br.readLine());
	System.out.print("�� ��° ���� �Է�    : ");
	b=  Integer.parseInt(br.readLine());
	System.out.print("������ �Է�[+ - * /] : ");
	op = System.in.read();

	// + �� op : 43, - �� op :45, * �� op:42, / �� op: 47

	switch (op)
	{
	case 43 : result= a+b;break;
	case 45 : result= a-b;break;
	case 42 : result= a*b;break;
	case 47 : result= a/b;break;
	default : return;	// 1. ���� ��ȯ �� return a;, return 1;
						// 2. �޼ҵ� ����� main() �޼ҵ� ���� �� ���α׷� ����

	}
	

	System.out.printf("\n>> %d %c %d= %d%n",a,b,result);
	*/

	//��
	
	BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));

	int a,b, result=0;
	char op;

	
	System.out.print("ù ��° ���� �Է�    : ");
	a=  Integer.parseInt(br.readLine());
	System.out.print("�� ��° ���� �Է�    : ");
	b=  Integer.parseInt(br.readLine());
	System.out.print("������ �Է�[+ - * /] : ");
	op =(char) System.in.read();


	switch (op)
	{
	case '+' : result= a+b;break;
	case '-' : result= a-b;break;
	case '*' : result= a*b;break;
	case '/' : result= a/b;break;
	default : return;	// 1. ���� ��ȯ �� return a;, return 1;
						// 2. �޼ҵ� ����� main() �޼ҵ� ���� �� ���α׷� ����

	}
	

	System.out.printf("\n>> %d %c %d= %d%n",a,b,result);
	

	}
}
