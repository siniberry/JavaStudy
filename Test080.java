/*================================
  ■■■ 클래스와 인스턴스 ■■■
=================================*/

// 생성자(Constructor)와 초기화 블럭(Initialized Block)


public class Test080
{
	/*
	int n;
	int m;
	
	
	n=100;
	m=200;
	*/

	/*
	int n = 100;
	int m = 200;
	*/

	int n;
	int m;
	
	// 초기화 블럭 먼저 실행 → 생성자 블럭 실행 
	//※ 생성자가 중요
	// 나중에 실행되는 것은 앞서 실행 된 것을 덮어씀

	// 생성자(Constructor) → 초기화 블럭이 코드를 먼저 수행했다 하더라도
	//						  최종적으로 해당 멤버들의 초기화 값을 결정하게 되는 개념
	Test080()
	{
		n=100;
		m=200;
		System.out.println("생성자 실행...");
	}
	
	// 초기화 블럭 (Initialized Block)
	{
		n=20;
		m=40;
		System.out.println("초기화 블럭 실행...");
	}
	
	
	Test080(int n, int m)
	{
		this.n = n;
		this.m = m;
		System.out.println("매개변수 있는 생성자 실행...");
	}

	// 멤버 출력 메소드 정의
	void write()
	{
		System.out.println("n:"+n+", m:"+m);
	}

	public static void main(String[]args)
	{
		Test080 ob1 = new Test080();
		ob1.write();

		Test080 ob2 = new Test080(1234, 5678);
		ob2.write();

	}
}

// 결과 출력

/*
초기화 블럭 실행...
생성자 실행...
n:100, m:200
초기화 블럭 실행...
매개변수 있는 생성자 실행...
n:1234, m:5678
계속하려면 아무 키나 누르십시오 . . .
*/