/*====================================
���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
=====================================*/

// Calendar Ŭ����

// �� �ǽ� ����
//	  ������ �������� �Է¹޴� ��¥��ŭ ���� ��, ��, ��, ������
//	  Ȯ���Ͽ� ����� ����ϴ� ���α׷��� �����Ѵ�.
//	  �� ���� ��¥�� �������� �� �� ���ϴ� ���� �޼ҵ� Ȱ��
//		 �� ��ü.add(Calendar.DATE,nalsu)

// ���� ��)
// ���� ��¥ : 2022-2-3 �����
// �� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : 200

// ========[Ȯ�� ���]========
// 200�� �� : xxxx-xx-xx x����
// ===========================
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.util. Calendar;
import java.util. Scanner;

public class Test146
{
	public static void main(String[]args)
	{
		int y,m,d,w,nalsu;
		Calendar cal = Calendar.getInstance();

		y = cal.get(Calendar.YEAR);
		m = cal.get(Calendar.MONTH)+1;
		d = cal.get(Calendar.DATE);
		w = cal.get(Calendar.DAY_OF_WEEK);
		
		String week = "";
		switch (w)
		{
	

			case 1: week = "�Ͽ���"; break;
			case 2: week = "������"; break;
			case 3: week = "ȭ����"; break;
			case 4: week = "������"; break;
			case 5: week = "�����"; break;
			case 6: week = "�ݿ���"; break;
			case 7: week = "�����"; break;
		}
		
		Scanner sc = new Scanner(System.in);

		System.out.println( y + "-" + m + "-" + d + "-" + week);
		do
		{
			System.out.print("�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : ");
			nalsu = sc.nextInt();
		}
		while (nalsu<1);
		

		cal.add(Calendar.DATE,nalsu);

		y = cal.get(Calendar.YEAR);
		m = cal.get(Calendar.MONTH)+1;
		d = cal.get(Calendar.DATE);
		w = cal.get(Calendar.DAY_OF_WEEK);

		switch (w)
		{
	

			case 1: week = "�Ͽ���"; break;
			case 2: week = "������"; break;
			case 3: week = "ȭ����"; break;
			case 4: week = "������"; break;
			case 5: week = "�����"; break;
			case 6: week = "�ݿ���"; break;
			case 7: week = "�����"; break;
		}


		System.out.println("========[Ȯ�� ���]========");
		System.out.println(nalsu +"�� �� : "+ y + "-" + m + "-" + d + "-" + week);
		System.out.println("===========================");
	
	
	}
}