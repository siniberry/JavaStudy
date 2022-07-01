/*===============================
■■■ 정렬(Sort) 알고리즘 ■■■
===============================*/

// ○ 과제
//	  사용자로부터 여러 학생의 성적 데이터를 입력받아
//	  점수가 높은 학생부터 낮은 순으로 등수를 부여하여
//	  결과를 출력하는 프로그램을 구현한다.
//	  단, 배열과 정렬 알고리즘을 활용하여 작성할 수 있도록 한다.

// 실행 예)
// 인원 수 입력 : 5
// 이름 점수 입력 (1, 공백 구분) : 이아린 90
// 이름 점수 입력 (2, 공백 구분) : 박현수 80
// 이름 점수 입력 (3, 공백 구분) : 이지연 85
// 이름 점수 입력 (4, 공백 구분) : 서민지 75
// 이름 점수 입력 (5, 공백 구분) : 김민성 95
/*
----------------
1등 김민성 95
2등 이아린 90
3등 이지연 85
4등 박현수 80
5등 서민지 75
----------------
*/

import java.util.Scanner;

public class Test112
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		// 주요 변수 선언 
		int num;		// 인원수를 입력받을 변수
		String name;	// 문자열은 ^로 반전 시킬 수 없어 담아둘 변수
		String [] names;// 입력받은 num수만큼 이름을 담을 배열
		int [] scores;	// 입력받은 num수만큼 점수를 담을 배열
		boolean flag;	// 향상된 버블 정렬을 위한 flag
		
		// 인원 수 입력 받기
		System.out.print("인원 수 입력 : ");
		num = sc.nextInt();
		
		// 입력받은 이름, 인원수 만큼 배열 생성
		names = new String [num];
		scores= new int [num];
		
		// 길이만큼 이름, 점수 입력 받고 배열에 집어 넣기
		for (int i =0;i<names.length ;i++ )
		{
			System.out.printf("이름 점수 입력 (%d, 공백 구분) : ",i+1);
				 
			 names[i] = sc.next();
			scores[i] = sc.nextInt();
		}
			
		// 향상된 버블 정렬
		do
		{
			int a = 0;
			flag =false;
			a++;
			for (int j = 0;j<scores.length-a ;j++ )  
			{
				if (scores[j]<scores[j+1])
				{
					scores[j] = scores[j]^scores[j+1];
					scores[j+1] = scores[j+1]^scores[j];
					scores[j] = scores[j]^scores[j+1];
					
					name = names[j];
					names[j] = names[j+1];
					names[j+1] = name;
					flag = true;
				}
			}
		}while (flag); // flag가 false일 때까지 ~ !!
		

		// 결과 출력 
		System.out.println();
		System.out.println("==================");
		
		for (int i = 0; i < names.length; i++)
			System.out.printf("  %d등 %s %d\n", i+1, names[i], scores[i]);

		System.out.println("==================");
		
			
		
	}
}

//결과 출력

/*
인원 수 입력 : 5
이름 점수 입력 (1, 공백 구분) : 김민성 95
이름 점수 입력 (2, 공백 구분) : 이아린 90
이름 점수 입력 (3, 공백 구분) : 이지연 85
이름 점수 입력 (4, 공백 구분) : 박현수 80
이름 점수 입력 (5, 공백 구분) : 서민지 75

==================
  1등 김민성 95
  2등 이아린 90
  3등 이지연 85
  4등 박현수 80
  5등 서민지 75
==================
계속하려면 아무 키나 누르십시오 . . .
*/