/*===================
  ■■■ 배열 ■■■
====================*/

// 배열의 배열(2차원 배열)


public class Test087
{
	public static void main(String[]args)
	{
		// 배열의 배열 선언과 초기화
		// 방법①
		// int[]arr1 = new int[3];
		int[][]arr1 = new int[3][3];

		//arr1[0] = 1;
		arr1[0][0] = 1;
		arr1[0][1] = 2;
		arr1[0][2] = 3;
		arr1[1][0] = 4;
		arr1[1][1] = 5;
		arr1[1][2] = 6;
		arr1[2][0] = 7;
		arr1[2][1] = 8;
		arr1[2][2] = 9;

		// 방법②
		//int[]arr2 = {1, 2, 3};
		int[][]arr2 = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};

		// 방법③
		int [][]arr3 = new int[3][3];
		int n=1;
		for (int i=0;i<arr3.length ;i++	)		//웅 ~~~~~~~~ 0		1		2  → 층
		{
			for (int j=0;j<arr3[i].length ;j++ ) // 쑝~쑝~쑝  012	012		012 → 사무실
			{
				//테스트
				//System.out.println("i:"+i+", j:"+j);

				arr3[i][j] = n;
				n++;
			}
		}
		
		// 배열의 배열 요소 전체 출력
		for (int i=0;i<arr3.length ;i++ )			// 웅~~~
		{
			for (int j=0;j<arr3[i].length ;j++ )	// 쑝쑝쑝
			{
				System.out.printf("%2d",arr3[i][j]);
			}
			System.out.println();
		}

	}
}