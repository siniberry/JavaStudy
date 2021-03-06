/*============================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
============================================*/

// if ~ else 문 실습

// 1. 프로그램을 작성할 떄 주어진 조건에 따라
//	  분기 방향을 정하기 위해 사용하는 제어문에는
//	  if문, if~else문, 조건연산자, 복합if문(if문 중첩),
//	  switch 문이 있다.

// 2. if문은 if 다음의 조건이 참일 경우
//    특정 문장을 수행하고자 할 때 사용되는 구문이다.

// 사용자로부터 임의의 정수를 입력받아
// 다음과 같은 판별 결과를 출력하는 프로그램을 구현한다.

// ○ 과제
//	  → 카페 https://cafe.naver.com/codingwithus
//		주석문 꼼꼼하게 달기/틈나는 대로 해결 가능/ 다른 사람들꺼 많이 보기

// 사용자로부터 임의의 연도를 입력받아
// 입력받은 연도가... 윤년인지 평년인지 판별하여
// 그 결과를 출력하는 프로그램을 구현한다.
// 단, 입력은 BufferedReader의 readLine()을 활용하고
// if 조건문을 활용하여 연산을 수행 할 수 있도록 한다.

// 실행 예)
// 임의의 연도 입력 : 2000
// 2000년 → 윤년
// 계속하려면 아무 키나 누르세요...

//임의의 연도 입력 : 2022
// 2021년 → 평년
// 계속하려면 아무 키나 누르세요...

// ※ 2월이 28일까지 있는 해 → 평년
//			29일까지 있는 해 → 윤년


// ※ 윤년의 판별 조건
//	  연도가 4의 배수이면서 100의 배수가 아니거나
//	  400의 배수이면 윤년
//	  그렇지 않으면 평년

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test037
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		int a ;

		System.out.print("임의의 연도 입력 : ");
		a = Integer.parseInt(br.readLine());

		if (a%4==0 && a%100!=0 || a%400==0)
		//→ 두개 이상의 조건이 등장하면 반드시 논리 연산자
		//		&&→	논리 and		||→	논리 or
		{
			System.out.printf("%d년 → 윤년\n",a);
		}
		else if(a%400!=0)
		{
			System.out.printf("%d년 → 평년\n",a);
		}
		else if (a%4!=0 && a%100==0)
		{
			System.out.printf("%d년 → 평년\n",a);
		}
		else
		{
			System.out.println("%d년 → 확인불가\n",a)
				
		}
		
	}
}