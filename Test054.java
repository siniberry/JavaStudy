/*============================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
============================================*/

// 반복문(while문) 실습

// 사용자로부터 임의의 두 정수를 입력받아
// 작은 수 부터 큰 수 까지의 합을 구하여
// 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
// 첫 번째 정수 입력 : 10
// 두 번째 정수 입력 : 20
// >> 10~ 20 까지의 합 : xxx
// 계속하려면 아무 키나 누르세요

// 첫 번째 정수 입력 : 10
// 두 번째 정수 입력 : 2
// >> 2~ 10 까지의 합 : xxx
// 계속하려면 아무 키나 누르세요

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Test054
{
	public static void main(String[]args)throws IOException
	{

		// 주요 변수 선언 및 초기화
		BufferedReader br = new BufferedReader ( new InputStreamReader (System.in));

		int n;			// 루프변수
		int a,b;		// 입력값
		int result =0;	// 누적합을 담을 변수
	

		// 연산 및 처리
		System.out.print("첫 번째 정수 입력 : ");
		a= Integer. parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b= Integer. parseInt(br.readLine());
		
		// 입력받은 두 수의 크기 비교 및 자리 바꿈
		// 즉, a가 b보다 큰 경우 두 수의 자리를 바꿀 수 있도록 처리
		if (a>b)
		{
			a=a^b;
			b=b^a;
			a=a^b;
		}
		
		// 반복 연산 수행
		// 반복 연산을 수행하기 전에
		// 작은 수를 따로 저장하여 루프 변수로 활용한다.
		// (결과 출력 과정에서 입력받은 작은 수가 필요한데
		//	그 수를 반복과정에서 사용하게 되면
		//	원래의 값을 확인할 수 없기 때문에)
		n = a;
			while (n<=b)
			{
				result+=n;
				n++;
			}
			
			System.out.printf(" >> %d~ %d 까지의 합 :  %d\n",a,b,result);

	
	}
}

// 결과 출력

/*
첫 번째 정수 입력 : 10
두 번째 정수 입력 : 2
 >> 2~ 10 까지의 합 :  54
계속하려면 아무 키나 누르십시오 . . .
*/

/*
첫 번째 정수 입력 : 2
두 번째 정수 입력 : 10
 >> 2~ 10 까지의 합 :  54
계속하려면 아무 키나 누르십시오 . . .
*/