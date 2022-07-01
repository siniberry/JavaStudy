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

// ����ڷκ��� �̸�, ��������, ��������, ���������� �Է¹޾�
// ������ ���� ���·� ����ϴ� ���α׷��� �ۼ��Ѵ�.
// ����� ��� ������ �������� ó���Ѵ�.

// 90�� ~ 100�� : A		80�� ~ 89�� : B
// 70�� ~  79�� : C		60�� ~ 69�� : D
// 60�� �̸�    : F

// ��, BufferedReader�� readLine() �޼ҵ带 ���� �Է¹��� �� �ֵ��� �ϸ�
// printf() �޼ҵ带 ���� ����� �� �ֵ��� �����Ѵ�.

// ���� ��)
// �̸� �Է� : ȫ����
// ���� ���� : 90
// ���� ���� : 80
// ���� ���� : 70

// >> ����� �̸��� ȫ�����Դϴ�.
// >> ���� ������ 90,
// >> ���� ������ 80,
// >> ���� ������ 70,
// >> ������ 240�̰�, ����� 80�Դϴ�.
// >> ����� B �Դϴ�.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test033
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		String name;
		char g;
		int k,e,m,plus, result;
		

		System.out.print("�̸� �Է� : ");
		name= br.readLine();

		System.out.print("���� ���� : ");
		k= Integer. parseInt(br.readLine());
		
		System.out.print("���� ���� : ");
		e= Integer. parseInt(br.readLine());
		
		System.out.print("���� ���� : ");
		m= Integer. parseInt(br.readLine());

		plus = k+e+m;
		result = plus/3;

		if(result>90)
		{g='A';}
		else if (result>=80)
		{g='B';}
		else if (result>=70)
		{g='C';}
		else if (result>=60)
		{g='D';}
		else
		{g='F';}

		// ������ �ִ� ��� ���ǿ� �ش���� ���� �� �ʱ�ȭ �� ���� �ԷµǾ��־���� ������ �߻����� ��
		/* char g;  �� ����
			
			if(result>90)
		{g='A';}
		else if (result>=80)
		{g='B';}
		else if (result>=70)
		{g='C';}
		else if (result>=60)
		{g='D';}

		char g = 'F'; �� ������

		if(result>90)
		{g='A';}
		else if (result>=80)
		{g='B';}
		else if (result>=70)
		{g='C';}
		else if (result>=60)
		{g='D';}
		*/
		

		System.out.printf(" >>> ����� �̸��� %s �Դϴ�.\n ",name);
		System.out.printf(" >>> ���� ������ %d, \n",k);
		System.out.printf(" >>> ���� ������ %d, \n",e);
		System.out.printf(" >>> ���� ������ %d,\n",m);
		System.out.printf(" >>> ������ %d �̰�, ����� %d �Դϴ�.\n",plus,result);
		System.out.printf(" >>> ����� %c �Դϴ�.\n",g);
	}
}