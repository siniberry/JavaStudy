/*====================
■■■ 배열 ■■■
====================*/

// 배열과 난수 처리(※ Random 클래스 활용)		***에러***

// 사용자로부터 임의의 정수를 입력받아
// 그 정수의 갯수만큼 난수(1~100)를 발생시켜 배열에 담고
// 배열에 담겨있는 데이터들 중
// 가장 큰 값과 가장 작은 값을 선택하여
// 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
// 발생시킬 난수의 갯수 입력 : 10
// (50 7 24 81 72 45 61 38 1 99 → 무작위로 발생한 정수들...)
// (int[] arr = {50, 7, 24, 81, 72, 45, 61, 38, 1, 99} → 배열에 담아내기(배열 구성)
// 가장 큰 값 : 99, 가장 작은 값 : 1
// 계속하려면 아무 키나 누르세요...

import java.util.Scanner;
import java.util.Random;

public class Test097
{
	public static void main(String[] args)
	{
		//Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		// 안내 메세지 출력
		System.out.print("발생시킬 난수의 갯수 입력 : ");
		int size = sc.nextInt();

		// size 변수에 담아낸 수만큼의 배열방 만들기
		// (배열 선언 및 메모리 할당)
		int[] arr = new int[size];

		// 무작위 정수(난수)를 발생시키기 위해서는
		// 난수 발생 전용 객체가 필요하다.
		// → 『java.util.Random』
		Random rd = new Random();

		// ※ Random 클래스의 『nextInt()』 메소드
		//	  0 ~ 매개변수로 넘겨받은 정수 n-1 까지의 수 중
		//	  무작위 정수(난수) 1개를 발생시킨다.
		// Random 클래스의 nextInt는 매개변수를 넘겨줘야함
		// rd.nextInt(10)		// 0 ~ 9. 발생하는 개수 아님. 실제로는 한 개.
		
		// 테스트
		//System.out.println("발생한 난수 : " + rd.nextInt(10));
		// 0 ~ 9 까지의 범위 내에서 무작위 정수 한 개 발생~!!!
		
		// 배열 구성
		// for (int i=0; i<arr.length; i++)
		for (int i=0; i<size; i++)
		{
			//rd.nextInt(100);
			//→ 0 ~ 99
			arr[i] = rd.nextInt(100) + 1;
			//→ 0 ~ 99 → 1 ~ 100
		}
		//-- rd.nextInt(100)	→ 0 ~ 99 까지의 무작위 정수 한 개 발생
		//	 rd.nextInt(100)+1	→ 1 ~ 100 까지의 무작위 정수 한 개 발생
	
		// 테스트 → 구성된 배열의 전체 요소 출력
		for (int i=0; i<arr.length; i++)
			System.out.printf("%4d", arr[i]);
			System.out.println();
		//--==>>
		
		/*
		발생시킬 난수의 갯수 입력 : 10
		14   9  35  37  26  31  50  30  52  82
		계속하려면 아무 키나 누르십시오 . . .
		발생시킬 난수의 갯수 입력 : 10
		52  51  99  64  37  77  14  88  17  87
		계속하려면 아무 키나 누르십시오 . . .
		*/
	
		//------------------------------------------- 배열 구성 완료~!

		// 가장 작은 값, 가장 큰 값 출력
		
		//Scanner sc = new Scanner(System.in);

		int max, min;					//-- 최대값, 최소값
		max=min=arr[0];					//-- max = min = 52; (바로 위를 예시로 든다면..)

		for (int i=1; i<arr.length ; i++)
		{
			if (max<arr[i])
				max = arr[i];
			
			// 최소값과 최대값을 구하는 각각의 연산에 논리적 연관성이 없으므로 else if는 아님.
			if (min>arr[i])
				min=arr[i];
		}

		// 결과 출력
		System.out.printf("가장 큰 값 : %d, 가장 작은 값 : %d%n", max, min);
	}
}

// 실행결과

/*
발생시킬 난수의 갯수 입력 : 10
  63  22   5  36  42   1  95  43  81  32
가장 큰 값 : 95, 가장 작은 값 : 1
계속하려면 아무 키나 누르십시오 . . .
*/