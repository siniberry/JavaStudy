/*============================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
============================================*/

// if ~ else

// ○ 과제 ( Test031과 유사 참고)
//		사용자로부터 임의의 알파벳 한 문자를 입력받아
//		이를 판별하여 입력받은 알파벳이 모음일 경우만
//		결과를 출력하는 프로그램을 구현한다.
//		단, 대소문자를 모두 적용할 수 있도록 처리한다.
//		또한, 알파벳 이외의 문자가 입력되었을 경우
//		입력 오류에 대한 내용을 사용자에게 안내해 줄 수 있도록 한다.

// 실행 예)
// 임의의 알파벳 한 문자 입력 : A
// >> 모음 OK~!!!
// 계속하려면 아무 키나....

// 임의의 알파벳 한 문자 입력 : e
// >> 모음 OK~!!!
// 계속하려면 아무 키나....

// 임의의 알파벳 한 문자 입력 : B
// 계속하려면 아무 키나....

// 임의의 알파벳 한 문자 입력 : 1
// >> 입력 오류~!!!
// 계속하려면 아무 키나....

import java.io.IOException;

public class Test041
{
	public static void main(String[]args)throws IOException
	{
		// 주요 변수 선언
		char ch; 
	
		// 연산 및 처리
		// 사용자로부터 문자 입력 받기
		System.out.print("한 문자 입력 : ");
		

		
		ch=(char)System.in.read();
		  //----- 자동 형 변환 규칙에 위배 됨으로
		  // 입력받은 문자를 char 형태로 변환 

		  // 조건 check !!
		  // 입력받은 문자가 A,E,I,O,U일 때 → 모음 OK~!!!
		  //				 a,e,i,o,u일 때 → 모음 OK~!!!
		  // 입력받은 문자가 이외의 것일 때 → 입력 오류~!!!

		  if (ch == 'A' ||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U'||ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u')
		  {
			  System.out.println(">>> 모음 OK~!!!");
		  }
		  
		  else
			{
				System.out.println(">>> 입력 오류~!!!");
			}
	}
}

// 출력 결과

/*
한 문자 입력 : A
>>> 모음 OK~!!!
계속하려면 아무 키나 누르십시오 . . .
*/

/*
한 문자 입력 : a
>>> 모음 OK~!!!
계속하려면 아무 키나 누르십시오 . . .
*/

/*
한 문자 입력 : 7
>>> 입력 오류~!!!
계속하려면 아무 키나 누르십시오 . . .
*/