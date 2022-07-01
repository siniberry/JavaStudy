/* ================================
  ■■■ 연산자(Operator) ■■■
  ================================= */

// 조건 연산자 == 삼항 연산자

// 사용자로부터 임의의 연도를 입력받아
// 입력받은 연도가... 윤년인지 평년인지 판별하여
// 그 결과를 출력하는 프로그램을 구현한다.
//단, 입력은 BufferedReader의 readLine()을 활용하고
// 조건 연산자를 활용하여 연산을 수행 할 수 있도록 한다.

// 실행 예)
// 임의의 연도 입력 : 2000
// 2000년 → 윤년
// 계속하려면 아무 키나 누르세요...

//임의의 연도 입력 : 2022
// 2021년 → 평년
// 계속하려면 아무 키나 누르세요...

// ※ 2월이 28일까지 있는 해 → 평년
//			29일까지 있는 해 → 윤년


// ※ 윤년의 판별 조건
//	  연도가 4의 배수이면서 100의 배수가 아니거나
//	  400의 배수이면 윤년
//	  그렇지 않으면 평년


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test032
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		
		int y;
		String result;

		System.out.print("임의의 연도 입력 : ");
		y= Integer.parseInt(br.readLine());
		//-----------------
		//문자열은 br.readline으로 못읽어서 쓰는 거임
		

		//내가 작성한 식 → result =  y%400==0 ? "윤년":( y%4==0 && y%100!=0 ? "윤년" : "평년"); 
		
		result = y%4==0 && y%100!=0 || y%400==0 ? " 윤년" : "평년";

		//내가 작성한 식 → System.out.println(y+"년 → "+result);
		System.out.printf("%d년 → %s\n",y,result);

		
	}
}