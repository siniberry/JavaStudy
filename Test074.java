/*================================
  ■■■ 클래스와 인스턴스 ■■■
=================================*/

// 사용자로부터 임의의 정수를 입력받아
// 1 부터 입력받은 수 까지의 합을 연산하여
// 결과값을 출력하는 프로그램을 구현한다.

// 단, 클래스와 인스턴스의 개념을 활용하여 처리할 수 있도록 한다.
// 또한, 입력 처리 과정에서 BufferedReader의 readLine() 을 사용하며,
// 입력 데이터가 1 보다 작거나 1000 보다 큰 경우
// 다시 입력받을 수 있는 처리를 포함하여 프로그램을 구현할 수 있도록 한다.

// 실행 예)
// 임의의 정수 입력 (1~1000) : 1050
// 임의의 정수 입력 (1~1000) : -45
// 임의의 정수 입력 (1~1000) : 100
// >> 1~100 까지의 합 : 5050
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Hap
{
	// 주요 변수 선언(사용자의 입력값을 담아낼 변수)
	int su;

	// 입력 메소드 정의
	void input()throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		do
		{
			System.out.print("임의의 정수 입력(1~1000) : ");
			su = Integer.parseInt(br.readLine());
		}
		while (1>su||1000<su);		
	}
	
	// 연산 처리 메소드 정의
	int calculate()
	{
			int result = 0;
			
			for (int i=1;i<=su ;i++ )
			result += i;
			
			return result;
	}	

	// 결과 출력 메소드 정의
	void print(int sum)
	{
		System.out.printf(">> 1 ~ %d 까지의 합 : %d\n",su,sum);
	}
}
public class Test074
{
	public static void main(String[]args)throws IOException
	{	
		// Hap 인스턴스 생성
		Hap ob = new Hap();

		// 생성한 인스턴스를 통해 입력 메소드 호출 → input()
		// ----------------------
		//	   참조변수 활용

		ob. input();

		// 생성한 인스턴스를 통해 연산 처리 메소드 호출 → calculate()
		int a=ob. calculate();

		// 생성한 인스턴스(ob)를 통해 출력 메소드 호출 → print()
		// ob. print(calculate());
		ob.print(a);
	}
}

// 실행 결과

/*
임의의 정수 입력(1~1000) : 10000
임의의 정수 입력(1~1000) : -20
임의의 정수 입력(1~1000) : 200
>> 1 ~ 200 까지의 합 : 20100
계속하려면 아무 키나 누르십시오 . . .

*/