/*===============================
■■■ 정렬(Sort) 알고리즘 ■■■
===============================*/

/*
○ 정렬
   : 데이터를 특정한 규칙(기준)에 맞게 순서대로 나열(오름차순, 내림차순)

○ 정렬의 목적
   : 데이터 처리 과정의 편의성이나 가독성을 높이기 위함
   → 보기 좋게.. 검색하기 위함
   → 성능은 반복의 횟수로 측정함

○ 정렬의 종류
   : 선택 정렬, 버블 정렬, 삽입 정렬, 힙 정렬, 퀵 정렬, 쉘 정렬, ....
   → 리소스 소모가 굉장히 심하기 때문에 계속해서 많은 종류가 나옴

*/

// 선택 정렬(Selection Sort)
//→ 하나를 선택하고 다음꺼 다음꺼

// 실행 예)
// Source Data : 52 42 14 62 60
// Sorted Data : 12 42 52 60 62
// 계속하려면 아무키나 누르세요...

public class Test109
{
	public static void main(String[]args)
	{
		int [] a = {52, 42, 12, 62, 60};
		
		/*
		52 42 12 62 60

		42 52 12 62 60
		== --

		12 52 42 62 60
		==    --

		12 52 42 62 60
		==       --

		12 52 42 62 60
		==          --
		------------------------------------- 1회전
		12 42 52 62 60
		   == --
		 
		12 42 52 62 60
		   ==    --

		12 42 52 62 60
		   ==       --
		------------------------------------- 2회전
		12 42 52 62 60
		      == --
		
		12 42 52 62 60
			  ==    --
		------------------------------------- 3회전
		12 42 52 60 62
		         == --
		------------------------------------- 4회전
		*/
		
		// 시은이 풀이 
		/*
		System.out.print("Source Data : ");
		
		for (int i = 0;i<a.length ;i++ )
		{
			System.out.print(a[i]+ " ");
		}
		System.out.println();

		for (int i = 0;i<a.length ;i++ )
		{
			for (int j=i+1;j<a.length ;j++ )
			{
			
				if (a[i]>a[j])
				{
					a[i] = a[i] ^ a[j];
					a[j] = a[j] ^ a[i];
					a[i] = a[i] ^ a[j];
				}
			}
		}

		
		System.out.print("Sorted Data : ");

		for (int i = 0;i<a.length ;i++ )
		{
				System.out.print(a[i]+" ");
		}
		System.out.println();
		*/

		int i, j;
		
		System.out.print("Sourse Data : ");
		
		/*
		for (i=0;i<a.length ;i++ )
			System.out.print(a[i] + " ");
		System.out.println();
		*/

		// 향상된 for문 (for each구문)
		/*
		for (자료구조 요소의 타입+이름:자료구조(여기먼저작성))
		{

		}
		*/
		for ( int n : a )
			System.out.print(n+" ");
		System.out.println();

		// Selection Sort
		for (i =0;i<a.length-1 ;i++ )
		{
			for (j=i+1;j<a.length ;j++ )
			{
				if (a[i]>a[j])
				{
				a[i] = a[i] ^ a[j];
				a[j] = a[j] ^ a[i];
				a[i] = a[i] ^ a[j];
				}	
			}
		}

		System.out.print("Sorted Data : ");
		/*
		for (i=0;i<a.length ;i++ )
			System.out.print(a[i] + " ");
		System.out.println();
		*/
		for (int n: a )
			System.out.print(n+" ");
		System.out.println();

		
	}
}

// 실행 결과

/*
Sourse Data : 52 42 12 62 60
Sorted Data : 12 42 52 60 62
계속하려면 아무 키나 누르십시오 . . .
*/