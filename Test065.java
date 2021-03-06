/*============================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
============================================*/

// 반복문(for문) 실습
// 다중 for문(반복문의 중첩)을 활용한 별찍기 실습

//○ 과제
//	 다음과 같은 내용이 출력될 수 있도록
//	 반복문의 중첩 구문을 작성하여 프로그램을 구현한다.

// 실행 예)
/*

*********
 *******
  *****
   ***
	*

*/
	

public class Test065
{
	public static void main(String[]args)
	{
		for (int a=1;a<=5 ;a++ ) // 1~5번 실행
		{
			
			for (int b=1;b<=a ;b++ ) // 1개, 2개,3개.. 늘어나네?
			{
				System.out.print(" ");
			}

			for (int b=1;b<=10-(a*2-1) ;b++ )// 별이 9,7,5,3,1이되네
					  //------ 여기를바꿔야겠다 !
					  // 1. 1<=1+9 는 늘어나니까 빼는 걸로 해야겠다
					  //    1<=10-(1*2-1) 9
					  // 2. 2<=10-(2*2-1) 7
					  // 3. 3<=10-(3*2-1) 5
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

// 결과 출력

/*
 *********
  *******
   *****
    ***
     *
계속하려면 아무 키나 누르십시오 . . .
*/