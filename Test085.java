/*===================
  ■■■ 배열 ■■■
====================*/

// 배열의 선언과 초기화
// 배열의 기본적 활용

// ○ 과제
//	  사용자로부터 임의의 정수를 임의의 갯수만큼 입력받아
//	  입력받은 수 중에서 가장 큰 수를 출력하는 프로그램을 작성한다.
//	  단, 배열을 활용하여 구현할 수 있도록 한다.

// 실행 예)
// 입력할 데이터 갯수     : 12
// 데이터 입력(공백 구분) : 74 65 13 91 5 67 33 41 2 50 11 38
// >> 가장 큰 수 → 91
// 계속하려면 아무 키나 누르세요...

import java.util.Scanner;
import java.io.IOException;


public class Test085
{
	public static void main(String[]args)throws IOException
	{
		// Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);		
		
		// 사용자로부터 입력할 데이터 갯수 입력 받기
		System.out.print("입력할 데이터 갯수     : ");
		
		//입력 받은 데이터 변수 선언 및 처리 
		int n = sc.nextInt();		//--==>> 데이터 갯수
		int m=0;					//--==>> 가장 큰 값을 담아둘 변수
		
		
		// 사용자가 입력한 수만큼 num 저장 배열 구성
		int [] num = new int[n];
		
		// 사용자가 입력한 n개 수 만큼 데이터 입력 받기
		System.out.print("데이터 입력(공백 구분) : ");
		
		// for 구문으로 입력값 담아내기
		for (int i=0 ;i<n ;i++ )
		{			
			num[i] = sc.nextInt();
			
			// for구문이 도는 동안 m에 가장 큰 값 담기
			if (m<num[i])
			{
				m= num[i];	
			}
			
		}
		// 결과 출력
		System.out.printf(">> 가장 큰 수 → %d\n",m);
			
		

	}
}

// 실행 결과

/*
입력할 데이터 갯수     : 12
데이터 입력(공백 구분) : 74 65 13 91 5 67 33 41 2 50 11 38
>> 가장 큰 수 → 91
계속하려면 아무 키나 누르세요...
*/