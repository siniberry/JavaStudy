/*========================
■■■ 클래스 고급 ■■■
========================*/

// 상속 관계에 있는 클래스들 간의 캐스팅
// 업 캐스팅, 다운 캐스팅

class SuperTest118
{
	public int a=10, b=20;

	public void write()
	{
		System.out.println("슈퍼 클래스 write() 메소드...");
	}

	public int hap()
	{
		return a + b;
	}
}

// sub class, 자식 클래스, 하위 클래스
class SubTest118 extends SuperTest118
{
	public int b=100, c=200;

	@Override
	public int hap()
	{
		return a + b +c;
	}

	public void print()
	{
		System.out.println("서브 클래스 print() 메소드...");
	}
}
// main() 메소드를 포함하는 외부의 다른 클래스
public class Test118
{
	public static void main(String[]args)
	{
		// sub class 기반 인스턴스 생성
		SubTest118 ob1 = new SubTest118();

		System.out.println("ob1.b : "+ob1.b);
		//--==>> ob1.b : 100

		// ○ 업 캐스팅 
		//SuperTest118 ob2;
		SuperTest118 ob2 = ob1;
		//-- 『SuperTest118 ob2 = (SuperTest118)ob1;』과 동일한 코드

		/*
		학생 민지 = new 민지();
		인간 행인 = 민지;		// 『인간 행인 = (인간)민지;』과 동일한 코드
		
		※ 학생도 인간
		※ class 인간			class 학생 extends 인간
			{					{
			}					}
		비교
		byte a = 10;
		short b = a;			// 『short b = (short)a;』과 동일한 코드
		
		*/
		System.out.println("ob2.b : "+ob2.b);
		//--==>> ob2.b : 20
		//-- 변수는 객체별로 따로 할당되므로
		//	 변수 b는 ob2의 변수이다.

		System.out.println("합    : "+ob2.hap());
		//--==>> 합    : 310
		//-- hap()메소드는 오버라이딩(Overriding)되어 있고
		//	 ob2 는 ob1을 업캐스팅한 상태의 객체이므로
		//	 『SuperTest118』의 hap() 메소드를 호출하는 것이 아니라
		//	 『SubTest118』에서 재정의한 hap()메소드를 호출하게 된다.
		//	  즉, 메소드는 업캐스팅이 되더라도
		//	  재정의(덮어쓰기)한 이상... 원래의 기능으로 되돌릴 수 없다.
		
		ob2.write();
		//--==>> 슈퍼 클래스 write() 메소드...

		//ob2.print();
		//--==>> 에러 발생(컴파일 에러)
		
		// ○ 다운 캐스팅
		((SubTest118)ob2).print();
		//--==>> 서브 클래스 print() 메소드...

		// ※ 추가 관찰 ------------------------------------------------------------
		// 다운 캐스팅 가능 여부

		SuperTest118 ob3 = new SuperTest118();
		SubTest118 ob4;

		//System.out.println(ob3.c);
		//--==>> 에러 발생(컴파일 에러)
		//-- 상위 객체는 하위 객체의 멤버에 접근하는 것이 불가능하다.

		//ob4 = ob3;
		//--==>> 에러 발생(컴파일 에러)
		//-- 상위 객체는 하위 객체에 담을 수(참조할 수) 없다.

		//ob4 =(SubTest118)ob3;
		//--==> 에러 발생(런타임 에러)
		//-- 작성된 구문의 문법적인 구조만 봤을 때
		//	 다운 캐스팅이 이루어지는 상황이다.
		//	 하지만, 정상적인 캐스팅이 이루어지지 않는다.
		//	 현재 SubTest118 객체에 대해 메모리 할당이 이루어지지 않은 상태이기 때문에
		//	 다운 캐스팅은 불가능한 것이다.

	}
}

/*
○ 업 캐스팅, 다운 캐스팅이 정상적으로 이루어지는 경우 -----------------------------------------------

	1. 하위 객체 생성;				//-- check~!!!!!!!!!!!!
	2. 상위 = 하위;					// 업 캐스팅. 정상
	3. 하위 = 상위;					// 에러 발생
	4. 하위 = (하위)상위;			// 다운 캐스팅. 정상


○ 업 캐스팅, 다운 캐스팅이 정상적으로 이루어지지 않는 경우 ------------------------------------------

	1. 상위 객체 생성;				//-- check~!!!!!!!!!!!!
	2. 하위 = 상위;					// 에러 발생
	3. 하위 = (하위)상위;			// 다운 캐스팅. 런타임 에러 발생.

※ 업 캐스팅은 항상 가능. 다운 캐스팅은 경우에 따라 가능

*/