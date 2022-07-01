/*============================================
  ■■■ 메소드의 재귀 호출 ■■■
============================================*/

public class InfRecul
{
	public static void main(String[]args)
	{
		showHi(10);
	}

	// 코드 내에서 2군데 위치 바꾸기

	public static void showHi(int cnt)
	{	/*
		System.out.println("Hi~ ");
		showHi(cnt--);// --가 뒤로 붙으면 다음 처리인데 다음에 처리될 일이 없음
		if (cnt==1)
		return;
		*/

		/*
		System.out.println("Hi~ ");
		showHi(--cnt);//1로가도 if문으로 갈일이 없네?
		if (cnt==1)
		return;
		*/
		System.out.println("Hi~ ");

		if (cnt==1)
			return;

		showHi(--cnt);

	}
	
}