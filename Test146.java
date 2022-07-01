/*====================================
■■■ 자바의 주요(중요) 클래스 ■■■
=====================================*/

// Calendar 클래스

// ○ 실습 문제
//	  오늘을 기준으로 입력받는 날짜만큼 후의 연, 월, 일, 요일을
//	  확인하여 결과를 출력하는 프로그램을 구현한다.
//	  ※ 현재 날짜를 기준으로 날 수 더하는 연산 메소드 활용
//		 → 객체.add(Calendar.DATE,nalsu)

// 실행 예)
// 오늘 날짜 : 2022-2-3 목요일
// 몇 일 후의 날짜를 확인하고자 하십니까? : 200

// ========[확인 결과]========
// 200일 후 : xxxx-xx-xx x요일
// ===========================
// 계속하려면 아무 키나 누르세요...

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
	

			case 1: week = "일요일"; break;
			case 2: week = "월요일"; break;
			case 3: week = "화요일"; break;
			case 4: week = "수요일"; break;
			case 5: week = "목요일"; break;
			case 6: week = "금요일"; break;
			case 7: week = "토요일"; break;
		}
		
		Scanner sc = new Scanner(System.in);

		System.out.println( y + "-" + m + "-" + d + "-" + week);
		do
		{
			System.out.print("몇 일 후의 날짜를 확인하고자 하십니까? : ");
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
	

			case 1: week = "일요일"; break;
			case 2: week = "월요일"; break;
			case 3: week = "화요일"; break;
			case 4: week = "수요일"; break;
			case 5: week = "목요일"; break;
			case 6: week = "금요일"; break;
			case 7: week = "토요일"; break;
		}


		System.out.println("========[확인 결과]========");
		System.out.println(nalsu +"일 후 : "+ y + "-" + m + "-" + d + "-" + week);
		System.out.println("===========================");
	
	
	}
}