/*
===============================
■■■ 클래스와 인스턴스 ■■■
================================

※ CircleTest.java 파일과 set임

//원의 넓이와 둘레 구하기
//원의 넓이와 둘레를 구할 수 있는 클래스 설계
클래스 명 CircleTest -> CircleTest.java

원의 넓이 = 반지름 * 반지름 * 3.141592
원의 둘레 = 반지름 * 2 * 3.141592
BufferedReader의 readLine() 사용할것

실행 예


반지름 입력 : xx
반지름이 xx인 원의
넓이 : xxx.xx
둘레 : xxx.xx

계속하려면 아무 키나 누르세요...

*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



public class Test073 
{
	public static void main(String[] args) throws IOException
	{			
			//CircleTest 클래스 기반 인스턴스 생성
			//CircleTest 인스턴스 생성
			//CircleTest 객체 생성
			CircleTest ob = new CircleTest();
			ob.input();
			double area = ob.calarea();
			double length = ob.calLength();
			ob.print(area, length);
		
	}
}


/*
실행 결과

반지름 입력 : 3
반지름이 3인 원의넓이 : 28.274328231811523
둘레 : 18.849552154541016
계속하려면 아무 키나 누르십시오 . . .

*/