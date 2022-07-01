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

// 사용자로부터 이름, 국어점수, 영어점수, 수학점수를 입력받아
// 다음과 같은 형태로 출력하는 프로그램을 작성한다.
// 등급은 평균 점수를 기준으로 처리한다.

// 90점 ~ 100점 : A		80점 ~ 89점 : B
// 70점 ~  79점 : C		60점 ~ 69점 : D
// 60점 미만    : F

// 단, BufferedReader의 readLine() 메소드를 통해 입력받을 수 있도록 하며
// printf() 메소드를 통해 출력할 수 있도록 구현한다.

// 실행 예)
// 이름 입력 : 홍은혜
// 국어 점수 : 90
// 영어 점수 : 80
// 수학 점수 : 70

// >> 당신의 이름은 홍은혜입니다.
// >> 국어 점수는 90,
// >> 영어 점수는 80,
// >> 수학 점수는 70,
// >> 총점은 240이고, 평균은 80입니다.
// >> 등급은 B 입니다.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test033
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		String name;
		char g;
		int k,e,m,plus, result;
		

		System.out.print("이름 입력 : ");
		name= br.readLine();

		System.out.print("국어 점수 : ");
		k= Integer. parseInt(br.readLine());
		
		System.out.print("영어 점수 : ");
		e= Integer. parseInt(br.readLine());
		
		System.out.print("수학 점수 : ");
		m= Integer. parseInt(br.readLine());

		plus = k+e+m;
		result = plus/3;

		if(result>90)
		{g='A';}
		else if (result>=80)
		{g='B';}
		else if (result>=70)
		{g='C';}
		else if (result>=60)
		{g='D';}
		else
		{g='F';}

		// 조건이 있는 경우 조건에 해당되지 않을 시 초기화 할 값이 입력되어있어야지 오류가 발생하지 Ⅹ
		/* char g;  → 오류
			
			if(result>90)
		{g='A';}
		else if (result>=80)
		{g='B';}
		else if (result>=70)
		{g='C';}
		else if (result>=60)
		{g='D';}

		char g = 'F'; → 오류Ⅹ

		if(result>90)
		{g='A';}
		else if (result>=80)
		{g='B';}
		else if (result>=70)
		{g='C';}
		else if (result>=60)
		{g='D';}
		*/
		

		System.out.printf(" >>> 당신의 이름은 %s 입니다.\n ",name);
		System.out.printf(" >>> 국어 점수는 %d, \n",k);
		System.out.printf(" >>> 영어 점수는 %d, \n",e);
		System.out.printf(" >>> 수학 점수는 %d,\n",m);
		System.out.printf(" >>> 총점은 %d 이고, 평균은 %d 입니다.\n",plus,result);
		System.out.printf(" >>> 등급은 %c 입니다.\n",g);
	}
}