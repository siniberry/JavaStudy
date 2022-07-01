/*=====================
■■■ 만년 달력 ■■■
======================*/

// 다음과 같은 기능의 프로그램을 구현한다.

// 실행 예)
// 『연도』를 입력하세요 : 2022
// 『월』을 입력하세요 : 6
/*
	[ 2022년 6월 ]

 일  월  화  수  목  금  토
 ===========================
 			  1   2   3   4
  5   6   7   8   9  10  11
 12  13  14  15  16  17  18
 19  20  21  22  22  24  25
 26  27  28  29  30
 ===========================
 계속하려면 아무 키나 누르세요...
 */

import java.util.Scanner;

class WeekDay
{
	// 주요 변수 선언
	int y,m,d,w;
	int[]months ={31,28,31,30,31,30,31,31,30,31,30,31};
	String[]week={"일","월","화","수","목","금","토"};
	int nalsu;

	public void input()
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print(" 『연도』를 입력하세요 : ");
			y=sc.nextInt();
		}
		while (y<1);
		
		do
		{
			System.out.print(" 『월』를 입력하세요 : ");
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
		System.out.printf("	[ %d년 %d월 ] \n\n",y,m);
		System.out.println("  일  월  화  수  목  금  토");
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