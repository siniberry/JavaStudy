/*====================================
■■■ 예외(Exception) 처리 ■■■
======================================*/

// 예외 다시 던지기		
//-- 예외를 잡은 후에 다시 던지는 것은 선원이 물 샌 부분 처리 - 예외 다시 던져 
// 1등 항해사가 예외 확인. 배 수리 예외 다시 잡아내고 선장에게 던져
// 선장은 예외 확인 후 다시 잡음. 전달할 필요성이 있는 것.

public class Test154
{
	public static void main(String[] args)
	{
		Test154 ob = new Test154();

		try
		{
			int a = ob.getValue(-2);			// ⑦ 예외 발생
			System.out.println("a : " + a);
		}
		catch (Exception e)						// ⑧ 예외 잡아내기
		{
			System.out.println("ⓑ printStackTrace........");
			e.printStackTrace();
		}

	}

	public int getData(int data) throws Exception
	{
		if (data < 0)
		{
			throw new Exception("data 가 0 보다 작습니다.");
			// ① 예외 발생
		}

		return data + 10;
	}
									// ⑥ 잡아낸 예외를 다시 던지는 것이 가능하도록 처리
	public int getValue(int value) throws Exception
	{
		int a = 0;
		
		try
		{
			a = getData(-2);		// ② 예외 발생
		}
		catch (Exception e)			// ③ 예외 잡아내기
		{
			// ④ 잡아낸 예외에 대한 처리
			System.out.println("ⓐ printStackTrace.........");
			e.printStackTrace();

			// check ★
			// ⑤ ③에서 잡아낸 예외를 다시 던지기
			throw e;
			
		}

		return a;
	}

}