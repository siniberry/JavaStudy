/*============================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
============================================*/

// 반복문(while문) 실습

// 사용자로부터 원하는 단(구구단)을 입력받아
// 해당하는 구구단을 출력하는 프로그램을 구현한다
// 단, 1단 ~ 9단 사이의 수를 입력받은 상황이 아니라면
// 이에 대한 안내를 한 후 프로그램을 종료할 수 있도록 처리한다

// 실행 예)
// 원하는 단(구구단) 입력 : 7
// 7 * 1 = 7
// 7 * 2 = 14
// 7 * 3 = 21
//    :
// 7 * 9 = 63
// 계속하려면 아무 키나 누르세요...

// 원하는 단(구구단) 입력 : 7
// 1부터 9까지의 정수만 입력이 가능합니다.
// 계속하려면 아무 키나 누르세요...

import java.io. BufferedReader;
import java.io.IOException;
import java.io. InputStreamReader;

public class Test056
{
	public static void main(String[]args)throws IOException
	{
		// 내가 풀이한 내용 

		/*
		
		// 주요 변수 선언 및 초기화
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		
		int a;
		int b = 1;
		int result=0;


		// 연산 및 처리
		System.out.print("원하는 단(구구단) 입력 : ");
		a = Integer. parseInt(br.readLine());
		
		while (b<=9)
		{
			result = a *b;
		if (a<1||a>9)
		{
			System.out.println("1부터 9까지의 정수만 입력이 가능합니다.");
			break;
		}
			System.out.printf("%d * %d = %d\n",a,b,result);
			b++;
		}
		*/

		// 주요 변수 선언 및 초기화
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		
		int dan;
		


		// 연산 및 처리
		System.out.print("원하는 단(구구단) 입력 : ");
		dan = Integer. parseInt(br.readLine());

		if (dan<1 || dan>9)
		{
			System.out.println("1부터 9까지의 정수만 입력이 가능합니다.");
			return;
		}
		int n =0;
		while (n<9)
		{
			n++;
			System.out.printf("%d * %d = %d\n",dan,n,(dan*n));
		}
		
	}
}