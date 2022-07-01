/*==============================
���� Ŭ������ �ν��Ͻ� ����
===============================*/

// Ŭ���� ����
// �迭 Ȱ��
// �������������ڿ� ��������

// ����ڷκ��� ��,��,���� �Է¹޾�
// �ش� ��¥�� ������ ����ϴ� ���α׷��� �����Ѵ�.
// ��, �޷� Ŭ����(Calender)�� ������� �ʴ´�.
// ����, Ŭ������ ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�. (�� WeekDay Ŭ���� ����)
// �׸���, �迭�� ���䵵 ������� �ۼ��� �� �ֵ��� �Ѵ�.
// ���������������� ���䵵 Ȯ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.
// ���������� WeekDay Ŭ���� ���踦 ����
// Test101 Ŭ������ main() �޼ҵ尡 ���������� ���α׷� ����� �� �ֵ��� �Ѵ�.

// �� 1�� 1�� 1�� �� "������"

// ���� ��)
// �� �� �� �Է�(���� ����) : 2022 1 19
// 2022�� 1�� 19�� �� ������
// ����Ϸ��� �ƹ� Ű�� ��������....

// �� �� �� �Է�(���� ����) : 2000 5 4
// 2000�� 5�� 4�� �� �����
// ����Ϸ��� �ƹ� Ű�� ��������

import java.util.Scanner;

class WeekDay
{
  // �ֿ� ���� ����
  private int	y,m,d;		//-- ����ڰ� �Է��� ��, ��, ���� ��Ƴ� ����

  // �޼ҵ� ���� �� ��� : ��, ��, �� �Է¹ޱ�
  public void input()
	{
	  	Scanner sc = new Scanner(System.in);

		System.out.print("�� �� �� �Է�(���� ����) : ");
		y = sc.nextInt();
		m = sc.nextInt();
		d = sc.nextInt();

	}

	/*
	�� �� �� �Է�(���� ����) : 2022 11 19

	 �迭 ���� �� {31, 0, 31, 30, 31, 30, 31, 31 , 30, 31, 30, 31};
	
	
	�� 1.1.1 ~ 2021.12.31
	   ------------------		��
			�� ��			+=  2022.1.1 ~ 2022.10. ������ ��	 +=  ��  ��  
								------------------------------

	(�Է¿���-1)*365 - (�Է¿���-1)/4 - (�Է¿���-1)/100 +(�Է¿���-1)/400
	
	*/
	
	
	//�޼ҵ� ���� �� ��� : ���� �����ϱ�
	public String week()
	{	
		// �� ���� ������ ��¥(�� ���� �ִ밪)�� �迭 ���·� ����
		int[] months = {31, 0, 31, 30, 31, 30, 31, 31 , 30, 31, 30, 31};

		// ���� �̸��� ���� �迭 ����
		String[] weekNames = {"��", "��", "ȭ", "��", "��", "��", "��"};
		
		// �� ���� ������ ����
		int nalsu;

		// ���⿡ ���� 2���� �� �� ���
		// �Է� �⵵�� �����̶��... 2���� ������ ��¥�� 29�� ����
		// �Է� �⵵�� ����̶��... 2���� ������ ��¥�� 28�� ����

		if ((y%4==0 && y%100!=0)||y%400==0) //-- �Է� �⵵�� �����̶��...
		{
			months[1]=29; //-- 2���� ������ ��¥�� 29�Ϸ� ����
		}
		else								//-- �Է� �⵵�� ����̶��...
		{
			months[1]=28; //-- 2���� ������ ��¥�� 28�Ϸ� ����
		}
		
		// �� 1�� 1�� 1�� ���� �Է¹��� �⵵�� ���� �⵵ 12�� 31�ϱ����� �� �� ���
		//					   -------------
		//                          y
		//					   -------------------------
		//							      y - 1
			
		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;
		//      ----------
		//	   1��⺻�ֱ�
		//					--------
		//					4�⸶��+1
		//							 ------------
		//							100�⸶��+1(��)
		//										 ------------
		//										  400�⸶��+1
		
		// �׽�Ʈ
		//System.out.println("�� �� : "+ nalsu);
		//--==>> �� �� �� �Է�(���� ����) : 2022 6 20
		//		 �� �� : 738155
		//				--------
		//				1.1.1 ~ 2021.12.31 �� �� �� ��


		// �� �Է¹��� ���� ���� �� ������ �� �� ��� ��
		//	  �� ��� ����� 1�� ����� ���ϴ� ����
		for (int i =0;i<(m-1) ;i++ )
			nalsu += months[i];

		// �׽�Ʈ
		//System.out.println("�� �� : "+ nalsu);
		//--==>> �� �� �� �Է�(���� ����) : 2022 6 20
		//		 �� �� : 738306
		//				--------
		//				1.1.1 ~ 2022.5.31 �� �� �� ��


		//�� �Է¹��� ���� ��¥��ŭ �� �� ��� ��
		//	 2�� ����� ���ϴ� ����

		nalsu += d;


		
		// �׽�Ʈ
		//System.out.println("�� �� : "+ nalsu);
		//--==>> �� �� �� �Է�(���� ����) : 2022 6 20
		//		 �� �� : 738326
		//				--------
		//				1.1.1 ~ 2022.6.20 �� �� �� ��


		//-------------------- ������� �����ϸ� �� �� ���� ��~ !!!
		
		// ���� �������� Ȯ���ϱ� ���� ����
		int w = nalsu % 7;		//-- ��ü���� % 7 ==0  �� �Ͽ���
								//	 ��ü���� % 7 == 1 �� ������
		return weekNames[w];
	}
	
	// �޼ҵ� ���� �� ��� : ��� ����ϱ�
	public void print(String day)
	{
		System.out.printf(">> %d�� %d�� %d�� �� %s����\n",y,m,d,day);
	}

}


public class Test101
{
	public static void main(String[] args)
	{
		//WeekDay Ŭ���� ��� �ν��Ͻ� ����
		WeekDay wd = new WeekDay();

		// �Է� �޼ҵ� ȣ��
		wd.input();

		// ���� ���� �޼ҵ� ȣ�� �� ��� Ȯ��
		String result = wd.week();

		// ���� ��� ��� �޼ҵ� ȣ��
		wd.print(result);
	}
}

// ���� ���

/*
�� �� �� �Է�(���� ����) : 1999 10 31
>> 1999�� 10�� 31�� �� �Ͽ���
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/