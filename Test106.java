/*================================================
■■■ 메소드 중복정의(Method Overloading) ■■■
=================================================*/

// Method Overloading 이 가능한 형태와 불가능한 형태

public class Test106
{
	public static void main(String[]args)
	{
		print(3.14);

		double result = print(3.14);						// 자바가 오른쪽을 먼저 보기때문에 
	}

	public static void print(){}
	// public static void print(){}							//--(Ⅹ)
	public static void print(int i){}
	//public static void print(int j){}						//--(Ⅹ)
	public static void print(char c){}						//-- 자동 형 변환 규칙 check~!!!
	public static void print(int i,int j){}
	public static void print(double d){}
	//public static void print(double e){return 10.0;}		//-- 정의 불가
	//public static double print(double e){return 10.0;}	//--(Ⅹ) check~!!!
	
	
	
	
	
	
}