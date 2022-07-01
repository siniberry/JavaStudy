/*====================
■■■ 배열 ■■■
====================*/

// 배열의 배열(2차원 배열)		

// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
/*
	1	8	9	16	17
	2	7	10	15	18
	3	6	11	14	19
	4	5	12	13	20
*/

// 웅~   i  i  i  i		 i  i  i  i		 i  i  i  i		 i  i  i  i		 i  i  i  i
//		00 10 20 30		31 21 11 01		02 12 22 32		33 23 13 03		04 14 24 34
// 쑝~  j  j  j  j		j  j  j  j		j  j  j  j		j  j  j  j		j  j  j  j

public class Test091
{
	public static void main(String[] args)
	{
		// 배열의 배열 선언 + 메모리 할당
		int[][] arr = new int[4][5];

		int n=0;

		// 배열 채워넣기
		for (int i=0; i<5; i++)	// outer 웅 i → 0		 1 2 3 4
		{
			for (int j=0; j<4; j++)			// inner 쑝 j → 0 1 2 3	...
			{
				// arr[j][i]
				// System.out.print(j + "" +  + "   ");

				n++;

				if(i%2==0)				// i → 0 2 4
					arr[j][i] = n;
				else					// i → 1 3
					arr[3-j][i] = n;	// 0 1 2 3 을 3 2 1 0 으로...
										// [3-0][1]		[3-0][3]	
										// [3-1][1]		[3-1][3]
										// [3-2][1]		[3-2][3]
										// [3-3][1]		[3-3][3]
			}
			// System.out.println();
		}
		
		// 전체 요소 출력
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
				System.out.printf("%3d", arr[i][j]);
			System.out.println();
		}
	
	}
}

// 실행 결과

/*
  1  8  9 16  0
  2  7 10 15  0
  3  6 11 14  0
  4  5 12 13  0
계속하려면 아무 키나 누르십시오 . . .
*/