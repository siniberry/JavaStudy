/*========================
■■■ 클래스 고급 ■■■
========================*/

// Wrapper 클래스

public class Test136
{
	public static void main(String[]args)
	{
		byte b = 3;
		int i = 256;

		Byte b2 = new Byte(b);
		Integer i2 = new Integer(i);

		System.out.println(b2);
		System.out.println(i2);

		print(b2);
		print(i2);

		//Byte 클래스의 byteValue() 메소드 호출
		byte b3 = b2.byteValue();			// 언박싱

		//Integer 클래스의 inValue() 메소드 호출
		int i3 = i2.intValue();				// 언박싱

		// check~!!!
		int i4 = b2.byteValue();
		//int b4 =i2.intValue();			//-- 에러 발생(컴파일 에러)
		int b4 = i2.byteValue();

		System.out.println(b3);
		System.out.println(i3);
		
		// check~!!!
		System.out.println(b4);
		System.out.println(i4);

	}

	// java.lang.Number 클래스(추상 클래스)는
	// 모든 숫자형 Wrapper 클래스의 부모 클래스
	// (슈퍼 클래스, 상위 클래스)이다.
	// b2, i2 자료형이 Number에 넘어오면서
	// 업 캐스팅이 일어나게 된다.
	// Auto-Boxing 이 일어나게 된다.
	static void print(Number n) // ← 3
	{
		System.out.println(n);
		System.out.println(n.intValue());
		return;
	}
}