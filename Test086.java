/*===================
  ■■■ 배열 ■■■
====================*/

// 배열의 선언과 초기화
// 배열의 기본적 활용

// ○ 과제
//	  사용자로부터 임의의 학생 수를 입력받고
//	  그만큼의 점수(정수 형태)를 입력받아
//	  전체 학생 점수의 합, 평균, 편차를 구하여
//    결과를 출력하는 프로그램을 구현한다.
//    단, 배열을 활용하여 처리할 수 있도록 한다.

// 실행 예)
// 학생 수 입력 : 5
// 1번 학생 점수 입력 : 90
// 2번 학생 점수 입력 : 82
// 3번 학생 점수 입력 : 64
// 4번 학생 점수 입력 : 36
// 5번 학생 점수 입력 : 98

// >> 합 : 370
// >> 평균 : 74.0
// >> 편차
// 90 : -16.0
// 82 : -8.0
// 64 : 10.0
// 36 : 38.0
// 98 : -24.0
// 계속하려면 아무 키나 누르세요...

import java.util. Scanner;
import java.io.IOException;

public class Test086
{
	public static void main(String[]args)throws IOException
	{
		// Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		
		// 사용자로부터 학생수 입력 받기
		System.out.print("학생 수 입력 :");
		int n = sc.nextInt();
		
		// 사용자가 입력한 만큼 num 저장 배열 구성
		int num[]= new int[n];
		// 변수 선언 및 초기화
		int sum =0;				//--==>> 합을 담을 변수
		double avg =0.0;		//--==>> 평균을 담을 변수
		
		
		// for 구문으로 입력값 담아내기
		for (int i=0;i<n ;i++ )
		{
			System.out.printf("%d번 학생 점수 입력 : ",i+1);
			num[i] = sc.nextInt();
		}
		// 공백 출력
		System.out.println();
		
		// for 구문으로 합 변수에 값 담기
		for (int i=0;i<n ;i++ )
		{
			sum += num[i];
		}
		
		// 평균 계산하기
		avg = (double) sum /n;

		// 결과 출력
		System.out.printf(">> 합 : %d\n", sum);
		System.out.printf(">> 평균 : %.1f\n", avg);
		System.out.println(">> 편차");
		
		// 편차 계산하기 --==>> 출력 값이 밑에 나와야하니까 밑에서 계산
		for (int i =0;i<n ;i++ )
		{
			System.out.printf("%d : %.1f\n",num[i],(avg-num[i]));
		}


		
		

	}
}

// 실행 결과

/*
학생 수 입력 :5
1번 학생 점수 입력 : 90
2번 학생 점수 입력 : 82
3번 학생 점수 입력 : 64
4번 학생 점수 입력 : 36
5번 학생 점수 입력 : 98
>> 합 : 370
>> 평균 : 74.0
>> 편차
90 : -16.0
82 : -8.00
64 : 10.0
36 : 38.0
98 : -24.0
계속하려면 아무 키나 누르십시오 . . .
*/