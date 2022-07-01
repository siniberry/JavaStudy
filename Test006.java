/* ================================
  ■■■ 자바 기본 프로그래밍 ■■■
  ================================= */

// 변수와 자료형
// 키워드 및 식별자

public class Test006
{
	public static void main(String[] args)
	{
		double height = 172.8;
		int age = 27;
		char degree = 'A';

		System.out.println(height);
		System.out.println(age);
		System.out.println(degree);
		
		/*→172.8
			27
			A */

		String name = "신시은";
		// String name = "최현명";
		// → 스코프 영역 안에서 변수명은 식별자

		// String # name = "김태형";
		// 『$』 와 『_』를 제외한 다른 특수문자는
		//	변수의 이름으로 활용할 수 없다.
		// 하지만, 그나마 사용 가능한 이들 특수문자도
		// 함부로 사용하는 것은 고려해야한다.

		//int tel = 010123123;
		String tel = "01062670734";

		// → 숫자만 이루어져도 앞이 0이 있다면,
		//	  문자열로 취급해야함

		String 주소 = "경기도 고양시";
		//→ 문법적으로 한글 단어를 변수명으로 사용할 수 있지만
		//   실무적인 측면에서 접근한다면
		//   절대로 한글 단어를 변수명으로 사용해서는 안된다.
		
		// 결과출력
		System.out.println("name : " + name);
		// → name : 신시은

		System.out.println("tel : " + tel);
		System.out.println("주소 : " + 주소);



// 실행 결과 172.8
/*
27
A
name : 신시은
tel : 01062670734
주소 : 경기도 고양시
계속하려면 아무 키나 누르십시오 . . .
	*/




	}
}