/*============================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
============================================*/

// if ~ else 문 실습

// 1. 프로그램을 작성할 떄 주어진 조건에 따라
//	  분기 방향을 정하기 위해 사용하는 제어문에는
//	  if문, if~else문, 조건연산자, 복합if문(if문 중첩),
//	  switch 문이 있다.

// 2. if문은 if 다음의 조건이 참일 경우
//    특정 문장을 수행하고자 할 때 사용되는 구문이다.

// 사용자로부터 임의의 두 정수와 연산자를 입력받아
// 해당 연산자의 연산 처리 결과를 출력하는 프로그램을 구현한다.
// 단, if 조건문을 활용하여 처리할 수 있도록 하며,
// 연산 결과는 편의상 정수 기반으로 처리될 수 있도록 한다.

// 실행 예)
// 첫 번째 정수 입력    : 10
// 두 번째 정수 입력    :  3
// 연산자 입력[+ - * /] :  +

// >> 10 + 3 = 13
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Test038
{
	public static void main(String[]args)throws IOException
	{
		/*
		BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
			
			int a, b,ej,ak,rh,sk;
			char A;

			System.out.print("첫 번째 정수 입력    : ");
			a=Integer.parseInt(br.readLine());

			System.out.print("두 번째 정수 입력    : ");
			b=Integer.parseInt(br.readLine());

			// Integer.parseInt()
			// "1234" → Integer.parseInt() → 1234
			// "ABCD" → Integer.parseInt() → (Ⅹ)
			
			// br.readLine(); → 문자열 (Ⅹ)

			System.out.print("연산자 입력[+ - * /] : ");
			A=(char)System.in.read();
			//      ----------------- → 자동형변환 규칙에 인해 위배됨으로 앞에 char

			ej = a + b;
			ak = a - b;
			rh = a * b;
			sk = a / b;

			if (A=='+')
			{
				System.out.printf("\n>> %d + %d = %d\n",a,b,ej);
			}
			else if (A=='-')
			{
				System.out.printf("\n>> %d - %d = %d\n",a,b,ak);
			}
			else if (A=='*')
			{
				System.out.printf("\n>> %d * %d = %d\n",a,b,rh);
			}
			else if (A=='/')
			{
				System.out.printf("\n>> %d / %d = %d\n",a,b,sk);
			}
			else
			{
				System.out.println("\n>> 입력 과정에 오류가 존재합니다.");
			}
			*/

			// 방법 ②
			/*
			BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
			
			int a, b,op;		// 첫 번째, 두 번째 정수, 연산자

			System.out.print("첫 번째 정수 입력    : ");
			a=  Integer.parseInt(br.readLine());


			System.out.print("두 번째 정수 입력    : ");
			b = Integer.parseInt(br.readLine());

			System.out.print("연산자 입력[+ - * /] : ");
			op = System.in.read();

			if (op==43)
			{
				System.out.printf("%n>> %d + %d = %d%n",a,b,(a+b));
			}
			else if (op==45)
			{
				System.out.printf("%n>> %d - %d = %d%n",a,b,(a-b));
			}
			else if (op==42)
			{
				System.out.printf("%n>> %d * %d = %d%n",a,b,(a*b));
			}
			else if (op==47)
			{
				System.out.printf("%n>> %d / %d = %d%n",a,b,(a/b));
			}
			else
			{
				System.out.println("\n>> 입력 과정에 오류가 존재합니다.");
			}
			*/

			// 방법 ③

			BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));

			int a,b, result=0;
			char op;
			
			System.out.print("첫 번째 정수 입력    : ");
			a=  Integer.parseInt(br.readLine());
			System.out.print("두 번째 정수 입력    : ");
			b=  Integer.parseInt(br.readLine());
			System.out.print("연산자 입력[+ - * /] : ");
			op = (char)System.in.read();
			

				if(op=='+')
					result = a + b;
				else if (op=='-')
					result = a - b;
				else if (op=='*')
					result = a * b;
				else if (op=='/')
					result = a / b;

				System.out.printf("\n>> %d %c %d= %d%n",a,b,result");

	}
}