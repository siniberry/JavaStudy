/*============================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
============================================*/

// if문
// if ~ else 문 실습

// 사용자로부터 임의의 정수 5개를 입력받아
// 짝수별, 홀수별 합계를 출력하는 프로그램을 구현한다.
// 단, Scanner를 활용하여 데이터를 입력받을 수 있도록 한다.

// 실행 예)
// 임의의 정수 5개 입력 : 1 2 3 4 5

// >> 짝수의 합은 6이고, 홀수의 합은 9 입니다.

import java.util.Scanner;

public class Test040
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c,d,e;
		int sum1 =0;
		int sum2 =0;
		// 누적 합을 연산할 때는 0으로 초기화
		// 누적 곱을 연산할 때는   1로 초기화 

		System.out.print("임의의 정수 5개 입력(공백 구분) : ");
	


		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();
		
		// a가 짝수일 때 → sum1을 a 만큼 증가
		//	   홀수일 때 → sum2을 a 만큼 증가

		// b가 짝수일 때 → sum1을 b 만큼 증가
		//	   홀수일 때 → sum2을 b 만큼 증가

		// c가 짝수일 때 → sum1을 c 만큼 증가
		//	   홀수일 때 → sum2을 c 만큼 증가

		// d가 짝수일 때 → sum1을 d 만큼 증가
		//	   홀수일 때 → sum2을 d 만큼 증가

		// e가 짝수일 때 → sum1을 e 만큼 증가
		//	   홀수일 때 → sum2을 e 만큼 증가
		

		if (a%2==0)
		{
		 sum1 += a;
		}
		else if (a%2==1)
		{
		 sum2 += a;
		}
		 
		if (b%2==0)
		{
		 sum1 += b;
		}
		else if (b%2==1)
		{
		 sum2 += b;
		}
		 
		if (c%2==0)
		{
		 sum1 += c ;
		}
		else if (c%2==1)
		{
		 sum2 += c;
		}
		 if (d%2==0)
		{
		 sum1 +=  d ;
		}
		else if (d%2==1)
		{
		 sum2 += d;
		}
		 if (e%2==0)
		{
		 sum1 +=  e ;
		}
		else if (e%2==1)
		{
		 sum2 += e;
		}

		System.out.printf(">> 짝수의 합은 %d이고, 홀수의 합은 %d 입니다.\n",sum1,sum2);
		
	}
}

// 출력 결과

/*
임의의 정수 5개 입력(공백 구분) : 30 21 33 56 78
>> 짝수의 합은 164이고, 홀수의 합은 54 입니다.
계속하려면 아무 키나 누르십시오 . . .
*/