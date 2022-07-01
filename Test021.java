/* ================================
  ■■■ 자바 기본 프로그래밍 ■■■
  ================================= */

// 자바의 기본 입출력 : java.until.Scanner

//   ※ java.until.Scanner
//		단락 문자 패턴을 사용하여 입력을 토큰에 따라 분할하며
//		디폴트(default)로 사용되는 단락문자는 공백이다.
//		작성된 다음 토큰은 『next()』 메소드 사용
//		다른 형태(자료형)의 값으로 변환할 수 있다.

import java.util.Scanner;

public class Test021
{
	public static void main(String[]args)
	{
		// 주요 변수 선언
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng, mat, tot;

		// 연산 및 처리
		System.out.print("이름,국어,영어,수학 입력(『,』구분) :");
		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");
		//              -----------
		//			  이연주,90,80,70

		// "\" → 움찔 "\\" → \를 문자로 취급하고 싶음 2개써야함


		// sc = new Scanner("이연주,90,80,70").useDelimiter("\\s*,\\s*");	
		//									  -------------- \s* , \s*      * → 모두라는 뜻
		//							     	   구분자로 자름 ---   ---
		//											 모든 문자열   모든 문자열


		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();

		tot = kor + eng + mat;


		// 결과 출력
		System.out.println("\n>> 이름 : " +name);
		System.out.println(">> 총점 : " + tot);
	}
}

// 실행 결과
/*
이름,국어,영어,수학 입력(『,』구분) :이연주,90,80,70

>> 이름 : 이연주
>> 총점 : 240
계속하려면 아무 키나 누르십시오 . . .
*/