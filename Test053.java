/*============================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
============================================*/

// 반복문(while문) 실습

// 사용자로부터 임의의 정수를 입력받아
// 입력받은 정수가 소수인지 아닌지를 판별하여
// 결과를 출력하는 프로그램을 구현한다.

// ※ 소수 : 1 또는 자기 자신의 값 이외에 어떤 수로도 나누어 떨어지지 않는 수.
//			 단, 1은 소수 아님.

// 실행 예)
// 임의의 정수 입력 : 10
// 10 → 소수 아님
// 계속하려면 아무 키나 누르세요...

// 임의의 정수 입력 : 11
// 10 → 소수
// 계속하려면 아무 키나 누르세요...

// 임의의 정수 입력 : 967

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test053
{
	public static void main(String[]args)throws IOException
	{
		// 내가 쓴 답
		/*
		BufferedReader br = new BufferedReader ( new InputStreamReader (System.in));

		int a ;
		int b =1;

		System.out.print("임의의 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		while (b<=a)
		{ b++;
			
			if (a==b)
			{System.out.println(a+" → 소수");break;}
			else if (a==1)
			{System.out.println(a+" → 소수아님");break;} 
			else if (a%b==0)
			{System.out.println(a + " → 소수아님");break;}
			*/


		// 주요 변수 선언 및 초기화
		BufferedReader br = new BufferedReader ( new InputStreamReader (System.in));

		int num ;
		int n =2;		// 입력값을 대상으로 나눗셈 연산을 수행할 변수
						// 2부터 시작해서 1씩 증가
						// ex) 입력값 27 → n : 2 3 4 5 6 7 8... 26
		
		// 연산 및 처리
		System.out.print("임의의 정수 입력 : ");
		num = Integer.parseInt(br.readLine());
		
		//String result = "소수다";
		boolean flag = true;		// num(사용자 입력값)은 소수일 것이다~!!!

		while (n<num)
		{ 
			// n 으로 num이 나누어 떨어지는지 확인
			if (num%n==0)
			{
				//result = "소수아니다";
				flag = false;		// num은 소수 아니다 ~!!!
				break;				// 멈춘다. 그리고 빠져나간다.
									// (break 를 감싸는 가장 가까운 반복문)
			}
			
			
			n++;
			
			
		}
		//System.out.println("result");

		// 결과 출력 (출력 전에 수행해야 할 추가 확인 → 1인지 아닌지에 대한 추가 검토)
		if (flag && num!=1)
			{
				System.out.printf("%d → 소수%n",num);
			}
		else 
			{
				System.out.printf("%d → 소수아님%n",num);
			}

	}
}

// 실행결과
/*
임의의 정수 입력 : 98
98 → 소수아님
계속하려면 아무 키나 누르십시오 . . .
*/