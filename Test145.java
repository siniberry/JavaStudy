/*====================================
���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
=====================================*/

// Calendar Ŭ����

/*
�� java.util.Calendar Ŭ������
   ��¥�� �ð��� ��ü �𵨸�ȭ �� Ŭ������
   ��, ��, ��, ����, ��, ��, �� ������
   �ð��� ��¥�� ���õ� ������ �����Ѵ�.
   �׸���, Calendar Ŭ������ �߻�Ŭ�����̹Ƿ� ���� ��ü�� ������ �� ������
   �������� �޼ҵ� ������ Calendar Ŭ������ ���� Ŭ������
   GregorianCalendar Ŭ������ ���ǵǾ� �ִ�.

   �ý������κ��� ���� �ý��� �ð� ������ ���� ��
   getInstance() ��� ����(static) �޼ҵ带 �̿��Ͽ� ��ü�� ������ �� �ִ�.
   ������ Calendar Ŭ���� ��ü�� �ý����� ���� ��¥�� �ð� ������ ������,
   �� ��ü�� �����Ǹ� �����ִ� �ð� ��������
   get() �޼ҵ带 �̿��Ͽ� ���� ������(�����) �� �ִ�.

   getInstance() �޼ҵ�� ���������� GregorianCalendar ��ü�� �����Ͽ�
   �����ֱ� ������ GregorianCalendar  ��ü�� ���� �����Ͽ� �ð� ������
   ���� �� �� �ִ�.
*/

// �� �ǽ� ����
//	  ����ڷκ��� ��, ���� �Է¹޾�
//	  �޷��� �׷��ִ�(����ϴ�) ���α׷��� �����Ѵ�.
//	  ��, ����޷��� �ƴ϶� Calendar Ŭ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// ���� �Է� : 0
// ���� �Է� : 2022
// �� �Է�   : -2
// �� �Է�   : 16
// �� �Է�   : 7
/*
	[ 2022�� 7�� ]

  ��  ��  ȭ  ��  ��  ��  ��
===============================
					   1   2
   3   4   5   6   7   8   9
  10  11  12  13  14  15  16
  17  18  19  20  21  22  23
  24  25  26  27  28  29  30
  31
===============================
����Ϸ��� �ƹ� Ű�� ��������
*/

import java.util.Calendar;
import java.util.Scanner;

public class Test145
{
	public static void main(String[]args)
	{
		int y,m,w;
		
		Scanner sc = new Scanner(System.in);

		Calendar cal = Calendar.getInstance();

		do
		{
			System.out.print("���� �Է� : ");
			y = sc.nextInt();
		}
		while (y<1);
		
		do
		{
			System.out.print("�� �Է�   : ");
			m = sc.nextInt();
		}
		while (m<1||m>12);

		cal.set(y,m-1,1);

		w = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(); 
		System.out.println("        [ " + y + "�� " +  m + "�� ]");
		System.out.println();
		System.out.println("  ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("=============================");
		
		for (int i =1;i<w ;i++ )
		{
			System.out.print("    ");
		}
		for (int i = 1;i<=cal.getActualMaximum(Calendar.DATE); i++ )
		{
			System.out.printf("%4d",i);
			w++;
			if (w%7==1)
			{
				System.out.println();
			}	
		}
		if(w%7!=1)
			System.out.println();

		System.out.println("=============================");


		
	}
}