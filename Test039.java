/*============================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
============================================*/

// if문
// if ~ else 문 실습

// 사용자로부터 임의의 정수 세개를 입력받아
// 작은 수에서 큰 수 순으로 출력하는 프로그램을 구현한다.

// 실행 예)
// 첫 번째 정수 입력 : 7
// 두 번째 정수 입력 : 70
// 세 번째 정수 입력 : 42

// >> 정렬 결과 : 7 42 70

// 힌트 :  7   70  42

//  ① 첫 번째 정수 vs 두 번째 정수  크기 비교 및 자리바꿈
//	   → 첫 번째 정수가 두 번째 정수보다 클 경우... 자리 바꿈

//  ② 첫 번째 정수 vs 세 번째 정수  크기 비교 및 자리바꿈
//	   → 첫 번째 정수가 세 번째 정수보다 클 경우... 자리 바꿈

//  ③ 두 번째 정수 vs 세 번째 정수  크기 비교 및 자리바꿈
//	   → 두 번째 정수가 세 번째 정수보다 클 경우... 자리 바꿈

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test039
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
	
		int a,b,c;		// 사용자가 입력하는 임의의 정수를 담아둘 변수

		System.out.print("첫 번째 정수 입력 : ");
			a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
			b = Integer.parseInt(br.readLine());

		System.out.print("세 번째 정수 입력 : ");
			c = Integer.parseInt(br.readLine());

		//  ① 첫 번째 정수(a)가 두 번째 정수(b)보다 클 경우... 자리 바꿈

		if (a>b)
		{
			a=a^b;
			b=b^a;
			a=a^b;
		}

		//  ② 첫 번째 정수(a)가 세 번째 정수(c)보다 클 경우... 자리 바꿈
		if (a>c)
		{
			a=a^c;
			c=c^a;
			a=a^c;
		}
		//  ③ 두 번째 정수(b)가 세 번째 정수(c)보다 클 경우... 자리 바꿈
		if (b>c)
		{
			b=b^c;
			c=c^b;
			b=b^c;
		}
			
		// 최종결과출력
		System.out.printf("\n>> 정렬 결과 : %d  %d  %d\n",a,b,c);

		
		
		
	}
}