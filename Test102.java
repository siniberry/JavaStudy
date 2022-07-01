/*==============================
■■■ 클래스와 인스턴스 ■■■
===============================*/

// static 변수(클래스변수)와 static 메소드(클래스메소드)

// 클래스 변수, 클래스메소드
// 정적 변수, 정적 메소드
// ① 탄생 시점 → 클래스 정보 로딩 시
// ② 공유 가능


// 인스턴스 변수, 인스턴스메소드
// 동적 변수, 동적 메소드
// ① 탄생 시점 → 인스턴스 생성 시
// ② 공유 가능

// static 변수가 형아  인스턴스 변수가 아가

// ※ 실습 편의상 접근제어 지시자 생략 
 
public class Test102
{
	// ※ 클래스 변수 또는 클래스 메소드는
	//	  클래스 정보가 로딩되는 순간 메모리 할당이 이루어지며
	//	  클래스 이름 또는 객체(인스턴스)를 통해 접근 할 수 있다.
	//	  즉,『new』 연산자를 통해 메모리를 할당 받지 않아도
	//	  사용이 가능하다는 것이다.

	static int a = 10;	// static 변수(클래스변수, class 변수, 정적변수)

	// ※ 인스턴스 변수 또는 인스턴스 메소드는
	//	   동일한 클래스의 메소드에서는 바로 접근하는 것이 가능하지만
	//     클래스 메소드에서는 접근할 수 없다.

	int b = 20;			// non-static 변수(인스턴스변수, instance변수, 동적변수)
	
	void write()		// non-static 메소드(인스턴스메소드, instance메소드, 동적메소드)
	{
		System.out.println("클래스   변수 a : "+a);
		System.out.println("인스턴스 변수 b : "+b);
	}

	static void print()	// static 메소드(클래스메소드, class메소드, 정적메소드)
	{
		System.out.println("클래스   변수 a : "+a);
		//System.out.println("인스턴스 변수 b : "+b);
		//--==>> 에러 발생(컴파일 에러)
	}
	public static void main(String[]args)
	{
		System.out.println("main() → 클래스 변수 a : " + Test102.a);
		//-- 클래스 변수에 접근하기 위해서는
		//	 『클래스명.변수명』의 형태로 클래스의 이름을 통해
		//	  접근하는 것이 가능하다.
		//--==>> main() → 클래스 변수 a : 10

		System.out.println("main() → 클래스 변수 a : " + a);
		//--==>> main() → 클래스 변수 a : 10
		//-- 같은 클래스 내부에 존재하기 때문에
		//	 클래스 이름을 생략하는 것이 가능하다.

		Test102.print();
		//--==>> 클래스   변수 a : 10
		print();
		//--==>> 클래스   변수 a : 10
		//-- 클래스 메소드에서 클래스 메소드의 호출은 가능하며,
		//   『클래스명,메소드명()』의 형태로 접근하여 호출하는 것이 가능하다.
		//    또한, 지금은 같은 클래스 내부에 존재하기 때문에
		//    클래스의 이름을 생략하는 것이 가능하다.

		//System.out.println("main() → 인스턴스 변수 b : "+b);
		//--==>> 에러 발생 (컴파일 에러)
		//System.out.println("main() → 인스턴스 변수 b : "+Test102.b);
		//--==>> 에러 발생 (컴파일 에러)

		//Test102.write();
		//--==>> 에러 발생 (컴파일 에러)
		//write();
		//--==>> 에러 발생 (컴파일 에러)

		// Test102 클래스 기반 인스턴스 생성
		Test102 ob = new Test102();

		//System.out.println("main() → 인스턴스 변수 b : "+b);
		//--==>> 에러 발생(컴파일 에러)

		// 생성된 인스턴스를 통한 인스턴스 변수 접근
		System.out.println("main() → 인스턴스 변수 b : "+ob.b);
		//--==>> main() → 인스턴스 변수 b : 20

		//write();
		//--==>> 에러 발생(컴파일 에러)

		// 생성된 인스턴스를 통한 인스턴스 메소드 접근(호출)
		ob.write();
		//--==>> 클래스   변수 a : 10
		//		 인스턴스 변수 b : 20

		// 생성된 인스턴스를 통한 클래스 변수 접근
		System.out.println("main() → 인스턴스 변수 a : "+ob.a);
		//--==>> main() → 인스턴스 변수 a : 10

		// 생성된 인스턴스를 통한 클래스 메소드 접근(호출)
		ob.print();
		//--==>>클래스   변수 a : 10

		// ※ 클래스 변수나 클래스 메소드는
		//    『생성된인스턴스명.변수명』
		//    『생성된인스턴스명.메소드명()』
		//	   의 형태로도 접근(호출)이 가능하지만
		//	   『클래스명.변수명』
		//	   『클래스명.메소드명』
		//	    의 형태로 접근(호출)하는 것이 일반적이다.

		System.out.println("main() → 클래스 변수 a : "+a);
		System.out.println("main() → 클래스 변수 a : "+Test102.a);
		System.out.println("main() → 클래스 변수 a : "+ob.a);
		//--==>> main() → 클래스 변수 a : 10
		//main() → 클래스 변수 a : 10
		//main() → 클래스 변수 a : 10


		System.out.println();		//개행

		// Test102 클래스 기반 인스턴스 생성
		Test102 ob2 = new Test102();

		ob2.a = 10000;		//-- 클래스 변수 초기화
		ob2.b = 20000;		//-- 인스턴스 변수 초기화

		System.out.println("ob2 확인 ---------------------------");
		ob2.write();
		//--==>> ob2 확인 ---------------------------
		//클래스   변수 a : 10000
		//인스턴스 변수 b : 20000

		System.out.println("ob 확인 ---------------------------");
		ob.write();
		//--==>> ob 확인 ---------------------------
		//클래스   변수 a : 10000
		//인스턴스 변수 b : 20
	}
}


