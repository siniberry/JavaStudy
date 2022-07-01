/*=====================
���� ���� �޷� ����
======================*/

// ������ ���� ����� ���α׷��� �����Ѵ�.

// ���� ��)
// ���������� �Է��ϼ��� : 2022
// �������� �Է��ϼ��� : 6
/*
	[ 2022�� 6�� ]

 ��  ��  ȭ  ��  ��  ��  ��
 ===========================
 			  1   2   3   4
  5   6   7   8   9  10  11
 12  13  14  15  16  17  18
 19  20  21  22  22  24  25
 26  27  28  29  30
 ===========================
 ����Ϸ��� �ƹ� Ű�� ��������...
 */

import java.util.Scanner;

class WeekDay
{
	// �ֿ� ���� ����
	int y,m,d,w;
	int[]months ={31,28,31,30,31,30,31,31,30,31,30,31};
	String[]week={"��","��","ȭ","��","��","��","��"};
	int nalsu;

	public void input()
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print(" ���������� �Է��ϼ��� : ");
			y=sc.nextInt();
		}
		while (y<1);
		
		do
		{
			System.out.print(" �������� �Է��ϼ��� : ");
			m=sc.nextInt();
		}
		while (m<1||m>12);
		

	}
	public void week()
	{
		

			if ((y%4==0&&y%10!=0)||y%400==0)
			{
				months[1]=29;
			}
			
		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400; 
		
			for (int i=0;i<(m-1) ;i++ )
			{
				nalsu+=months[i];
			}
				
			nalsu +=1;
			w = nalsu % 7;
		
	}
	

	public void print()
	{
		System.out.println();
		System.out.printf("	[ %d�� %d�� ] \n\n",y,m);
		System.out.println("  ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("=============================");
		
		for (int i=1;i<=w ;i++ )		
		{
			System.out.print("    ");
		}
	
		for (int i=1; i<months[m-1]; i++) 
		{	   
		System.out.printf("%4d",i);	
		w++;
			if (w%7==0)
			{
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("=============================");
		


	}
}
public class Test107
{
	public static void main(String[]args)
	{
		WeekDay wd = new WeekDay();

		wd.input();
		wd.week();
		wd.print();
	}
	
}