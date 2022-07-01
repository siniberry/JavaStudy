/*=====================================
■■■ 주민등록번호 유효성 검사 ■■■
=====================================*/

/*
○ 주민등록번호 검증 공식
	
	① 마지막 자리를 제외한 앞자리 수를 규칙에 맞게 곱한다.

	123456-1234567 (주민번호)
	****** ******  ----------------------- 각 자릿수에 곱하기
	234567 892345 (각 자리에 곱해질 수)

	② 규칙에 맞게 곱셈 연산을 수행한 결과를 모두 더한다.

	ex) 7 5 0 6 1 5 - 1 8 6 2 1 3 3
		* * * * * *   * * * * * * 
		2 3 4 5 6 7   8 9 2 3 4 5
		----------------------------
	→ 14 + 15 + 0 + 30 + 6 + 35 + 8 + 72 + 12 + 6 + 4 + 15

		== 217
		
	③ 더해진 결과값을 11로 나누어 『나머지』를 취한다.
		19
	 ---------
  11 | 217
  	   11
	 ---------
	   107
	   	99
	 ---------
	 	 8	→ 나머지(○)
	
	④ 11에서 나머지 8을 뺀 결과값을 구한다.

	11 - 8 → 3

	※ ③의 처리 과정에서 나머지가 0인 경우 → 11 - 0 → 11
						  나머지가 1인 경우 → 11 - 0 → 10
						 
		이를 다시 10으로 나누어 나머지를 취한다.		 11 → 1
														 10	→ 0

	⑤ ④의 연산 결과가 주민번호를 구성하는 마지막 숫자와
		일치하는지의 여부를 비교한다.

		일치   → 유효한 주민번호
		불일치 → 잘못된 주민번호
	 

*/

// 실행 예)
// 주민번호입력(xxxxxx-xxxxxxx) : 123456-12345678 → 입력 갯수 초과
// >> 입력 오류~!!!
// 계속하려면 아무 키나 누르세요...

// 주민번호입력(xxxxxx-xxxxxxx) : 123456-123456   → 입력 갯수 미달
// >> 입력 오류~!!!
// 계속하려면 아무 키나 누르세요...

// 주민번호입력(xxxxxx-xxxxxxx) : 123456-1234567  → 유효한 주민번호
// >> 정확한 주민번호~!!!
// 계속하려면 아무 키나 누르세요...

// 주민번호입력(xxxxxx-xxxxxxx) : 123456-1234566  → 유효하지 않은 주민번호
// >> 잘못된 주민번호~!!!
// 계속하려면 아무 키나 누르세요...

// ※ 문제 해결을 위한 추가 팁~!!!

// 배열.length			→ 배열의 길이( 배열방의 갯수) 반환
//문자열.length()		→ 문자열의 길이 반환
//문자열.substring()	→ 문자열 추출
//문자열.substring(m,n) → 문자열의 m번째 위치에서 n-1번째까지 추출 (인덱스는 0부타)
//문자열.substring(m)	→ 문자열의 m번째 위치에서 문자열의 끝까지 추출 (인덱스는 0부터)

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test108
{
	public static void main(String[]args) throws IOException
	{
		/*
		//테스트
		String strTemp="한충희";
		System.out.println(strTemp.length());
		//--==>> 3
		
		//테스트
		strTemp="동해물과 백두산이";
		System.out.println(strTemp.length());
		//--==>>9
		
		//테스트
		strTemp="study-hard";
		System.out.println(strTemp.length());
		//--==>>10

		//---------------------------------------------------

		//테스트
		strTemp="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(strTemp.substring(13,17));
		//--==>>NOPQ

		//테스트
		//strTemp="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		//System.out.println(strTemp.substring(13,57));
		//--==>>에러 발생 (런타임 에러)
		//		java.lang.StringIndexOutOfBoundsException
		
		//테스트
		strTemp="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(strTemp.substring(5));
		//--==>>FGHIJKLMNOPQRSTUVWXYZ

		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
			String n;
			int ju;
			int [] a ={2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5};
			//                          ---
			//                        check~!!

			// 곱셈 연산 후 누적합 (각 곱셈의 결과를 더해 나가라...)
			// ----------   ======
			//               0으로 초기화
			int tot=0;

			System.out.print(" 주민번호입력(xxxxxx-xxxxxxx) : ");       
			n= br.readLine();
			if(n.length()!=14)
			{
				System.out.println(">> 입력 오류~!!!");
				return; //-- 메소드 종료 → main()메소드 종료 → 프로그램 종료
			}

			for (int i=0;i<13 ;i++ )
			{
				if (i==6)
				{
					continue; //뒷부분 무시하고 계속해라
				}
				tot += a[i]*Integer.parseInt(n.substring(i, (i+1))); // 하이푼(-)에서 문제 발생
			}

			//----------------------- 여기까지 수행하면 ① 과 ② 를 모두 끝낸 상황이며
			//						  규칙에 맞게 곱셈 연산을 수행한 결과를 모두 더한 갑ㅎ은
			//						  변수 tot에 담겨있는 상황이 된다.

			ju = 11 - tot % 11;

			//------------------------ 여기까지 수행하면 ③ 과 ④ 를 모두 끝낸 상황이지만
			//                         ju 에 대한 연산 결과가 두 자리로 나올 경우
			//                         주민번호 마지막 자리의 숫자와 비교 수행할 수 없는 상황
			
			ju = ju % 10;			// ju %= 10;


			if (ju==Integer.parseInt(n.substring(13)))
				System.out.println(">> 정확한 주민번호~!!");
				
			else
				System.out.println(">> 잘못된 주민번호~!!");
		
	}
}

// 실행 결과
/*
 주민번호입력(xxxxxx-xxxxxxx) : 991031-2030211
>> 정확한 주민번호~!!
계속하려면 아무 키나 누르십시오 . . .
*/