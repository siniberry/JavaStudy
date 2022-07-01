/* ================================
  ■■■ 자바 기본 프로그래밍 ■■■
  ================================= */

// 퀴즈
// 사전에 부여된 반지름 정보를 통해
// 원의 넓이와 둘레를 구하는 프로그램을 구현한다.
// → 반지름 : 10

// 실행 예)
// 넓이 : xxxxxx
// 둘레 : xxxxxx
// 계속하려면 아무 키나 누르세요...

public class Test012
{
	public static void main(String[] args)
	{
		/* 내가 풀이한 내용 ----------------------------------
		
		int r =10;
		double p = 3.141592;
		
		double e = r * r *p;
		double s = 2 * r * p;

		System.out.println( " 넓이 : " + e );
		System.out.println( " 둘레 : " + s );
		
		→ 넓이 : 314.1592
		   둘레 : 62.83184
		   계속하려면 아무 키나 누르십시오 . . .

		----------------------------------- 내가 풀이한 내용 */


		// 함께 풀이한 내용 ----------------------------------

		//주요 변수 선언
		int r = 10;						//→ 반지름
		final double PI = 3.141592;		//→ 원주율

		// ※ 『final』 키워드 : 변수의 상수화 ~ !!
		/*     final로 상수화한 변수는 개발자끼리 
		       암묵적으로 대문자로 기입,『_』(언더스코어)사용
			   ex) final int RAINBOW_COLOR = 10;    */

		double area, length;			//→ 원의 넓이, 원의둘레
		
		// 연산 및 처리
		// ① 넓이 연산
		// 원의 넓이 = 반지름 * 반지름 * 3.141592
		area = r * r * PI ;

		// ② 둘레 연산
		// 원의 둘레 = 반지름 * 2 * 3.141592
		length = r * 2 * PI;

		// 결과 출력
		// System.out.println("넓이 : " + area);
		// System.out.println("둘레 : " + length);
		System.out.printf("넓이 : %.2f%n " + area);
		System.out.printf("둘레 : %.2f%n" + length);


		//---------------------------------- 함께 풀이한 내용 //
	}
}


// 실행 결과
/*
넓이 : 314.1592
둘레 : 62.83184
*/