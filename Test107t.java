import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test107t
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 배열 선언 및 초기화
		//-- 각 달이 담고있는 마지막 날짜(매 월의 최대 날짜)
		int[]days ={31,28,31,30,31,30,31,31,30,31,30,31};

		// 테스트
		//System.out.println(days.length);
		//--==>> 12
		
		// 주요 변수 선언
		int nalsu, y, m, w;		//-- 날수, 년, 월, 요일

		do
		{
			System.out.print("『연도』를 입력하세요 : ");
			y = Integer.parseInt(br.readLine());
		
		}
		while (y<1);
		//-- 입력받은 연도가 1보다 작을 경우 다시 입력 받기~!!!
		
		do
		{
			System.out.print("『월』을 입력하세요 : ");
			m = Integer.parseInt(br.readLine());
		}
		while (m<1||m>12);
		//-- 입력받은 연도가 1보다 작거나 12보다 클 경우 다시 입력 받기~!!!

		//------------------------------------ 여기까지 수행하면 유효한 연도와 월을 입력한 상태

		// 입력받은 연도에 해당하는 2월의 마지막 날 계산
		if ((y%4==0 && y%100!=0) || y%400==0)	// 윤년이라면...
		{
			days[1]=29;
		}
		// else 구문은
		// 현재 days 배열의 1번째 요소(2월)가 28로 구성되어 있는 상태이기 때문에
		// 생략이 가능한 구문이 된다.

		// 1년 1월 1일 ~ 입력받은 연도의 이전년도 12월 31일 까지의 날 수 계산
		nalsu = (y-1)*365 +(y-1)/4 - (y-1)/100 + (y-1)/400;

		// 입력받은 연도(해당연도) 1월 1일 ~ 입력한 월의 이전 월까지의 날 수 누적 연산
		for (int i=0;i<(m-1) ;i++ )
		{
			nalsu += days[i];
		}

		// 입력받은 월의 1일을 날 수 누적 연산
		nalsu += 1; // ++nalsu;

		//--------------------------------------- 여기까지 수행하면 모든 날 수에 대한 종합 처리 완료

		// 요일 확인
		//-- 입력받은 연의 입력받은 월의 1일이 무슨 요일인지 확인하기 위해 연산
		w =  nalsu %7;
		// w:0 → 일요일
		// w:1 → 월요일
		// w:2 → 화요일

		// 테스트
		//System.out.print(w);
		//--==>> 『연도』를 입력하세요 : 2022
		//		 『월』을 입력하세요 : 6
		//		  3
		//		 → 2022년 6월 1일은 수요일(3)이라는 의미


		//--------------------------------------- 여기까지 수행하면 해당 연도 해당 월 1일 무슨 요일인지 확인 완료
		

		// 출력(달력 그리기)
		System.out.println();	//개행
		System.out.printf("\t[ %d년 %d월 ]\n",y,m);
		System.out.println();
		System.out.println("  일  월  화  수  목  금  토");
		System.out.println("=============================");

		// 특정 요일부터 1일이 출발할 수 있도록 공백 발생(지정)
		for (int i=1;i<=w ;i++ )
		{
			System.out.print("    ");		// 공백 4칸 발생
		}

		// 테스트
		//System.out.printf("%4d",1);

		// 해당 월(입력한 월)의 날짜만 출력될 수 있도록 반복문 구성
		for (int i=1;i<=days[m-1] ;i++ )
		{
			System.out.printf("%4d",i);
			w++;
			//-- 날짜를 처리하는 만큼 요일도 함께 증가

			// 일요일을 구성하려는 경우... (이번에 출력하고자 하는 날짜가 일요일일 경우)
			if (w%7==0)
			{
				System.out.println();
			}
		}
		
		// 달의 마지막 날짜가 출력 형식을 모두 채웠을 경우 (토요일까지 출력)
		// 이미 일요일 개행이 이루어졌기 때문에
		// 이경우에는 추가 개행을 하지 않도록 처리
		if (w%7!=0)
		{
			System.out.println(); // 마지막 날짜 다 찍은 후 개행 
		}

		System.out.println("=============================");
	
	}
}