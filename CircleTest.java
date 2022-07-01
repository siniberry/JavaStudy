
/*
===============================
■■■ 클래스와 인스턴스 ■■■
================================


※ Test 073.java 와 set임


*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class CircleTest

{

	//멤버변수 -> 주요 속성
	final float PI = 3.141592f; //원주율 바뀌면 안되니가 final
	int r;				  //반지름

	//멤버 메소드 -> 주요 기능 (동작, 행위)

	
	//반지름 입력 기능 -> 메소드 정의
	void input() throws IOException{ //메소드에만 throws처리 해줌.
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("반지름 입력 : ");
			r = Integer.parseInt(br.readLine());

	}

	//넓이 계산 기능 -> 메소드 정의
	double calarea(){

		double result;
		result = r * r * PI;
		return result;

	}


	//둘레 계산 기능 -> 메소드 정의

	double calLength(){

		double result;
		result = 2 * r * PI;
		return result;
	}

	
	//결과 출력 -> 메소드 정의

	void print(double a, double l){ //print 임의의 이름임 아무거나 해도댐 편한거루 ㅋ
		System.out.printf(">> 반지름이 %d인 원의%n" , r);
		System.out.println(">> 넓이 : " + a);
		System.out.println(">> 둘레 : " + l);
	
	}

}
