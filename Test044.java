/*============================================
  ���� ���� �帧�� ��Ʈ��(���) ����
============================================*/

// switch �� �ǽ�

// ����ڷκ��� 1 ���� 3 ������ ���� �� �ϳ��� �޾�
// �Է¹��� ������ŭ�� ������(��)�� ��µǴ� ���α׷��� �ۼ��Ѵ�.
// ��, �� ���� ������� ������ �� �ֵ��� �Ѵ�.

// �� switch���� �Ϲ� ���� ����Ѵ�.
// �� switch���� �⺻ ���� ����ϵ�,
//	 ��break;���� �� �ѹ��� ��� �� �� �ֵ��� �����Ѵ�

import java.io.BufferedReader;
import java.io. IOException;
import java.io. InputStreamReader;

public class Test044
{
	public static void main(String[]arg)throws IOException
	{
		
		
		// �Ϲ� ��
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a;

		System.out.print("������ ���� �Է�(1~3) : ");
		a = Integer. parseInt(br.readLine());
		
		
		switch (a)
		{case 1 : star="��"; break;
		 case 2 : star="�ڡ�";break;
		 case 3: star="�ڡڡ�";break;
		 default :star="�Է¿���~!!!";}

		System.out.println(star);

		
		// �⺻ ��
/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("������ ���� �Է�(1~3) : ");
		int a=0;
		String star="";
		a = Integer. parseInt(br.readLine());
		//(1)
		switch (a)
		{
		 case 3:  System.out.print("��");
		 case 2 : System.out.print("��");
		 case 1 : System.out.print("��/n");break;

		 default :System.out.println("�Է¿���~!!!");}



		//(2)
		switch (a)
		{case 3: star="��";
		 case 2 : star+="��";
		 case 1 : star+="��"; break;
		 default :star="�Է¿���~!!!";}


		System.out.println(star);*/
		
	}
}