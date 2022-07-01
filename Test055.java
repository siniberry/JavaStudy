/*============================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
============================================*/

// 반복문(while문) 실습

// ○ 과제
//	  사용자로부터 임의의 정수를 입력받아
//	  1부터 입력받은 그 정수까지의
//	  전체 합과, 짝수의 합과, 홀수의 합을
//	  각각 결과값으로 출력하는 프로그램을 구현한다.

// 실행 예)
// 임의의 정수 입력 : 280
// >> 1 ~ 280 까지의 정수의 합 : xxxx
// >> 1 ~ 280 까지의 짝수의 합 : xxxx
// >> 1 ~ 280 까지의 홀수의 합 : xxxx
// 계속하려면 아무 키나 누르세요...

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Test055
{
	public static void main(String[]args)throws IOException
	{
		// 주요 변수 선언 및 초기화
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));

		int sum=0,psum=0,msum=0;// 각각 정수의 합,
		int i=0; // 루프 변수 
		
		// 사용자로 부터 입력 받기

		System.out.print("임의의 정수 입력 : ");
		int a = Integer. parseInt(br.readLine());

		while (i<=a)// 루프변수가 a랑 같거나 작을 때까지 반복
		{
			sum+=i; // 정수의 합에 담기
			if (i%2==0) // 만약  i가 2의 배수(짝수) 면 짝수의 합에 담기
			{
				psum+=i;
			}
			if (i%2!=0)// 만약 i가 2의 배수가 아니면 (홀수) 홀수의 합에 담기
			{
				msum+=i;
			}
			i++; // 다음 숫자
		}
		System.out.println(">> 1 ~ " + a + " 까지 정수의 합 : " + sum);
		System.out.println(">> 1 ~ " + a + " 까지 짝수의 합 : " + psum);
		System.out.println(">> 1 ~ " + a + " 까지 홀수의 합 : " + msum);

	}
}
// 결과 출력

/*
임의의 정수 입력 : 280
>> 1 ~ 280 까지 정수의 합 : 39340
>> 1 ~ 280 까지 짝수의 합 : 19740
>> 1 ~ 280 까지 홀수의 합 : 19600
계속하려면 아무 키나 누르십시오 . . .
*/