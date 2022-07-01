/* ================================
  ■■■ 자바 기본 프로그래밍 ■■■
  ================================= */

// 변수와 자료형
// 자바의 기본 입출력 : BufferedReader 클래스

// 사용자로부터 이름, 국어점수, 영어점수, 수학점수를 입력받아
// 이름과 총점을 출력하는 프로그램을 구현한다

//실행 예)
// 이름을 입력하세요 : 신시은
// 국어 점수 입력 : 90
// 영어 점수 입력 : 80
// 수학 점수 입력 : 70

// ===[ 결과 ]===
// 이름 : 신시은
// 총점 : 240
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test016
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (isr);
		
		
		String	strName;			//→ 헝가리안 표기 법
		int nKor,nEng,nMat;  
		int nSum;

	
		System.out.print("이름을 입력하세요 : ");


		//  사용자가 입력한 값(외부 데이터)을 변수에 담기
		strName = br.readLine();

		System.out.print("국어 점수 입력 :");

		nKor = Integer.parseInt(br.readLine());

		System.out.print("영어 점수 입력 : ");

		nEng = Integer.parseInt(br.readLine());

		System.out.print("수학 점수 입력 : ");

		nMat = Integer.parseInt(br.readLine());

		nSum = nKor + nEng + nMat;

		System.out.println("===[ 결과 ]===");
		System.out.printf("이름 : %s \n총점 : %d\n",strName,nSum);
		

	}
}

// 실행 결과
/*
이름을 입력하세요 : 신시은
국어 점수 입력 :90
영어 점수 입력 : 80
수학 점수 입력 : 70
===[ 결과 ]===
이름 : 신시은
총점 : 240
계속하려면 아무 키나 누르십시오 . . .
*/