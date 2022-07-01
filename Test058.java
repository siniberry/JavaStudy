/*============================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
============================================*/

// 반복문(do~while문) 실습

// 사용자로부터 여러 개의 양의 정수를 입력받고,
// 그 합을 계산하여 출력하는 프로그램을 작성한다.
// 단, -1이 입력되는 순간
// 입력을 중지하고 
// 그동안 입력된 정수의 합을 출력해주는 프로그램을 구현한다.
// 즉,『-1』을 입력 중ㅈ지 커맨드로 활용한다.
// do! while 문을 활용하여 문제를 해결할 수 있도록 한다.

// 실행 예)
// 정수1 입력 : 10
// 정수2 입력 : 5
// 정수3 입력 : 8
// 정수4 입력 : 9
//	 :
// 정수6 입력 : -1

// >> 현재까지 입력된 정수의 합 : xxx
// 계속하려면 아무 키나 누르세요...

import java.io. BufferedReader;
import java.io.IOException;
import java.io. InputStreamReader;

public class Test058
{
	public static void main(String[]args)throws IOException
	{
		// 주요 변수 선언 및 초기화
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		
		int b;  //사용자의 입력값을 담아낼 변수
		int a=1; // 루프 변수로 활용하며 몇 번ㅉ재 입력 값인지를 담아낼 변수
		int result=0; // 누적합을 담아낼 변수
		

		// 연산 및 처리
		do
		{
		
		System.out.printf("정수%d 입력 : ",a);
		b= Integer.parseInt(br.readLine());
		
		result += b;
		a++;

		}
		while (b!=-1); // b가 -1이 아닐 경우 계속해서 반복
		
		result+=1;

		System.out.println(" \n>> 현재까지 입력된 정수의 합 : " +result);
		
	}
}

// 실행 결과

/*
정수1 입력 : 1
정수2 입력 : 5
정수3 입력 : 3
정수4 입력 : 50
정수5 입력 : 90
정수6 입력 : 999
정수7 입력 : 50
정수8 입력 : -1

 >> 현재까지 입력된 정수의 합 : 1198
계속하려면 아무 키나 누르십시오 . . .
*/