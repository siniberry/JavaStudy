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
import java.io.BufferedReader;
import java.io. InputStreamReader;
import java.io.IOException;

public class Test145b
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int y,m;		//-- ��, ��
		int w;			//-- ����
		int i;			//-- ���� ����

		Calendar cal = Calendar.getInstance();

		do
		{
			System.out.print("���� �Է� : ");
			y = Integer.parseInt(br.readLine());
		}
		while (y<1);
		
		do
		{
			System.out.print("�� �Է�   : ");
			m =Integer.parseInt(br.readLine());
		}
		while (m<1||m>12);
		

		// ����ڷκ��� �Է¹��� ��(y), ��(m)�� �̿��Ͽ�
		// �޷��� ��¥ ����
		cal.set(y,m-1,1);
		//-- �� ���� �� �Է°�(m)�� �״�� ����ϴ� ���� �ƴ϶�
		//   �Է°����� 1�� �� ������ ���� �����ؾ� �Ѵ�.
		//-- �� ������ �Է¹��� ��, ���� �ش��ϴ� 1�Ϸ� �����ؾ� �Ѵ�.

		// ���õ� �޷��� ��¥�κ��� ���� ��������
		w = cal.get(Calendar.DAY_OF_WEEK);

		// Ȯ�� 
		//System.out.println(w);
		//--==>> ���� �Է� : 2022
		//		 �� �Է�   : 6
		//		 4 �� 2022�� 6�� ���� �� ������ �� 2022�� 6�� 1�� �� ������

		// ��� ��� �� �޷� �׸��� 
		System.out.println(); 
		System.out.println("\t[ " + y + "�� " +  m + "�� ]\n");
		System.out.println("  ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("=============================");
		
		for (i =1;i<w ;i++ )
		{
			System.out.print("    ");			// ���� 4ĭ �߻�
		}
		
		// Calendar Ŭ���� ��getActualMaximum()�� �޼ҵ� check~!!!
		for (i = 1;i<=cal.getActualMaximum(Calendar.DATE); i++ )
		{
			System.out.printf("%4d",i);
			w++;							//-- �ݺ����� �����ϸ� ��¥�� ������ �� ����
											//   ���ϵ� �Բ� ������ �� �ֵ��� ó��
			if (w%7==1)						//-- ������ ������ �Ͽ����� �� �� ����
			{								//	 ���� �� ��µ� �� �ֵ��� ó��
				System.out.println();
			}	
		}
		if(w%7!=1)							//-- �Ͽ��� ������ ������� �ʾ��� ��츸 ����
			System.out.println();

		System.out.println("=============================");


		
	}
}