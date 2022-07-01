/* ================================
  ■■■ 자바 기본 프로그래밍 ■■■
  ================================= */

// 변수와 자료형
// 자바의 기본 입출력 : BufferedReader 클래스
						//→ 키보드 장치


// 원의 반지름 입력 : xxx
// >> 넓이 : xxxxxxx
// >> 둘레 : xxxxxxx
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader; //→자바야 여기가면 설계도가 있어
import java.io.InputStreamReader; //→ 번역기
import java.io.IOException; // → 계약서 같은 느낌 내가 밖에서 가져올건데 이거 계약서야


public class Test014
{
	public static void main(String[]args) throws IOException 
	{
		// 키보드 장착(생성)
		//→ BufferedReader 클래스 기반의 인스턴스 생성
		//현실에 버터드리더가 없어 우측에 뭘 대입할 지 모름.
	//자바야 이설계도 보고  이제까지는 없었던거지만 그대로 떠올려주겠니?
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//------------------------------------
		//		문자 입력을 읽어들이는 장치
		//									   ---------------------
		//									   바이트 → 문자 번역기(통역기)
		//															------------- 
		//															바이트 입력값

		// 주요 변수 선언
		int r;
		final double PI = 3.141592;
		double a, b;

		// 연산 및 처리
		// ① 사용자에게 안내 메세지 출력
		System.out.print("원의 반지름 입력 : ");

		//② 사용자가 입력한 값을 받아와 반지름 변수 r 에 담아내기
		// r = br.readLine();			//→ BufferedReader의 redLine() → 문자열 반환
		// r = "80";
		
		// r = Integer.parseInt(br.readLine());
		// r = Integer.parseInt("80");
		// r = 80;

		// Interger.parseInt("80") → 80
		// → 매개변수로 넘겨받은 문자열 데이터를 정수형으로 변환
		//	  단, 이 때 넘겨받은 문자열 데이터는 숫자모양이어야 한다
		//									 (NumberFormat)

		r = Integer.parseInt(br.readLine());
		// → 사용자가 입력한 값은 BufferedReader(br)의 『readLine()』
		//	  메소드를 활용하여 문자열 형태로 읽어들인 후
		//	  그 값을 『Integer.paraeInt()』를 통해 숫자형(정수형)으로 변환한 후
		//	  정수 형태의 반지름 변수 r 에 담아내기

		// ③ 넓이 및 둘레 계산(연산)
		a = r * r * PI;
		b = r * 2 * PI;

		// 결과 출력
		System.out.println(">> 넓이 : " + a);
		System.out.println(">> 둘레 : " + b);

		// 반지름이 45인 원의 넓이는 6361.72 이며,
		// 반지름이 45인 원의 둘레는 282.74 이다

		System.out.printf(">> 반지름이 %d인 원의 넓이는 %.2f 이며, %n",r,a);
		System.out.printf(">> 반지름이 %d인 원의 둘레는 %.2f이다. \n",r,b);


	}
}

// 실행 결과

/*
원의 반지름 입력 : 45
>> 넓이 : 6361.723800000001
>> 둘레 : 282.74328
계속하려면 아무 키나 누르십시오 . . .
*/

/*
원의 반지름 입력 : 45
>> 반지름이 45인 원의 넓이는 6361.72 이며,
>> 반지름이 45인 원의 둘레는 282.74이다.
계속하려면 아무 키나 누르십시오 . . .
*/