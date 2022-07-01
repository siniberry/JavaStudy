/*====================
■■■ 배열 ■■■
====================*/

// 배열의 배열(2차원 배열)		

// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
/*
	E	J	O	T	Y
	D	I	N	S	X
	C	H	M	R	W
	B	G	L	Q	V
	A	F	K	P	U
계속하려면 아무 키나 누르세요...
*/

public class Test092
{
	public static void main(String[] args)
	{
		// 배열의 배열 선언 + 메모리 할당
		char[][] arr = new char[5][5];

		char start='A';

		// 배열 채워넣기
		for (int i=0; i<5; i++)			// i → 0 1 2 3 4
		{	
			for (int j=4; j>=0; j--)		
				arr[j][i] = (char)start++;	//-- 캐릭터타입으로 변환하지 않더라도 start 변수는 캐릭터타입이나, 정수형태로 변환되어 arr[j][i]에는 사실상 정수가 담길 것.
		}									//	 그러나 밑에 '전체 요소 출력'에서 %c로 담으면 문자타입으로 보여질 것.

		// 전체 요소 출력
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
				System.out.printf("%3c", arr[i][j]);
			System.out.println();
		}
	}
}

// 실행 결과

/*

  E  J  O  T  Y
  D  I  N  S  X
  C  H  M  R  W
  B  G  L  Q  V
  A  F  K  P  U
계속하려면 아무 키나 누르십시오 . . .

*/