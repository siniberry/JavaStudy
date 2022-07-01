/*====================
■■■ 배열 ■■■
====================*/

// 배열의 배열(2차원 배열)		

// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
/*
	1	2	3	4	10
	5	6	7	8	26
	9	10	11	12	42
	13	14	15	16	58
	28	32	36	40	136

계속하려면 아무 키나 누르세요...
*/

/*
○ 반복문 처리가 필요한 영역	반복문 처리가 필요하지 않은 영역

		1	2	3	4	|		10
		5	6	7	8	|		26
		9	10	11	12	|		42
		13	14	15	16	|		58
						|
		-----------------
		28	32	36	40			136
*/

public class Test093
{
	public static void main(String[] args)
	{

		int [][] arr = new int [5][5];
		
		int n =0;
		
		// 테스트 변수
		// int sum =0;
		for (int i=0;i<arr.length-1 ;i++ )			// i → 0 1 2 3
		{
			int sum=0;
			for (int j=0;j<arr[i].length-1 ;j++ )	// j → 0 1 2 3
			{
				n++;	// 1 2 3 4 5 6 ...	16까지 만들어짐
				arr[i][j]=n;

				//sum += arr[i][j];
				
				/*
				arr[4][4] += arr[i][j];
				arr[4][j] += arr[i][j];
				arr[i][4] += arr[i][j];
				*/

				arr[i][arr[i].length-1] += arr[i][j];
				arr[arr[i].length-1][i] += arr[i][j];
				arr[arr[i].length-1][arr[i].length-1] += arr[i][j];
				
			}
			
		}


			
		//  전체 요소 출력
			for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
				System.out.printf("%4d", arr[i][j]);
			System.out.println();
		}
	}
}


// 실행결과
/*
  1   2   3   4  10
   5   6   7   8  26
   9  10  11  12  42
  13  14  15  16  58
  34  36  38  40 358
계속하려면 아무 키나 누르십시오 . . .
*/


