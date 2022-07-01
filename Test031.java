/* ================================
  ■■■ 연산자(Operator) ■■■
  ================================= */

// 삼항 연산자 == 조건 연산자

// 사용자로부터 임의의 문자를 하나 입력받아
// 대문자이면 소문자로, 소문자이면 대문자로
// 알파벳이 아닌 기타 문자이면 그 문자 그대로 출력하는
// 프로그램을 구현한다.

// 실행 예)
// 한 문자 입력 : A
// A → a
// 계속하려면 아무 키나 누르세요...

// 한 문자 입력 : b
// b → B
// 계속하려면 아무 키나 누르세요...

// 한 문자 입력 : 7
// 7 → 7
// 계속하려면 아무 키나 누르세요...


import java.io.IOException;

public class Test031
{
public static void main(String[]args)throws IOException
	{
		/*
		// int temp;
		char temp;

		System.out.print("한 문자 입력 : ");
		temp = (char) System.in.read(); //→ System.in.read();는 int로 읽어옴

		//System.out.println("입력받은 값 확인 : " + temp);
		
		// String result = temp <= 65 && temp <=90 ? "대문자":tmep<=95"대문자아님";
		//→ 두개 이상의 조건이 등장하면 반드시 논리 연산자

		//String result = temp <= 'A' && temp <='Z' ? "대문자": "대문자아님";
 		
		System.out.println("결과 : " +result);
		*/
		
		
		char ch;
		char result;
	

		System.out.print("한 문자 입력 : ");

		ch=(char)System.in.read();
		
		
		//result = (64<ch<91) ? (char)ch+=32 : (96<ch<123) ? (char)ch-=32 : (char)ch;
		//→     한번에 못씀
		//		 64<ch , ch<91
		//두개 이상의 조건이 등장하면 반드시 논리 연산자
		// 알파벳대문자니 ? 알파벳소문자로 변환 : (알파벳소문자니 ? 알파벳대문자로 변환 : 있는그대로)
		//										   --------------   -------------------   ----------
		//											     1					 2				   3
		// --------------   -------------------   ---------------------------------------------------
		//		 1					 2										 3

		result = (ch>='A' && ch<='Z') ? (char)(ch +32) : (ch>='a' && ch<='z' ? (char)(ch-32) : ch);
		
		
		System.out.print(ch +"→"+result);


	}
}


