/*============================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
============================================*/

// 반복문(while문) 실습

//1부터 100까지의 정수 의 합 : 5050
//1부터 100까지의 짝수의 합 : 2550
//1부터 100까지의 홀수의 합 : 2500

public class Test049
{
	public static void main(String[]args)
	{
		int a=0;
		int sum=0;
		int esum=0;
		int hsum=0;

		while (a<=100)
		{  sum+=a;
			if (a%2==0)
			{
				esum+=a;
			}
			else if (a%2!=0)
			{
				hsum+=a;
			}
			else
			{
				System.out.println("판별 불가 데이터");
				return;
				}
				a++;
		}
		System.out.println("1부터 100까지의 정수의 합 : "+sum);
		System.out.println("1부터 100까지의 짝수의 합 : " + esum);
		System.out.println("1부터 100까지의 홀수의 합 : " + hsum);
	}
}