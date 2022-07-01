import java.util.Scanner; // 원래는 클래스 위면 아무곳에나 놔도 됨.
						 //클래스 두개니까 맨위에 놔야함 (public 있으니까..)

class Rect{ //직사각형 클래스 설계
	
	//데이터 속성, 상태 -> 변수

	int w, h;//가로, 세로;
	

	//기능 동작 행위 -> 메소드
	void input() //반환자료형(void) + 가로세로 입력() 생성자 아니니까 void 써야함! 값을 넣어주는것이니까 ㅋ
	{	
		Scanner sc = new Scanner(System.in);
		//스캐너 여기 객체에서만 필요하니까 굳이 이 오브젝트 밖에서 하면 메모리만 차지하니까
		//사용하는 곳에만 선언해주기.
		//모든 메소드에서 Scanner를 쓸 경우에는 가장 위에 있는 메소드 위에 Scanner sc; 만 해주고,
		//모든 메소드마다 sc = new Scanner(System.in); 이렇게 해야함!!!!!!!!

		System.out.print("가로 입력 : ");
		w = sc.nextInt();

		System.out.print("세로 입력 : ");
		h = sc.nextInt();

		//원래 선언한거에다가 넣는거니까 굳이 호출한곳에 값을 줄 필요가 없음.
		//그래서 return 안해두됨.


		//근데  호출한 공간에 입력 잘 받았다고 호출하고 싶으면 return 해두 됨. String 하고 return "가로 세로 입력 잘 받았음." 이런식으루...
		//거의 이렇게 안함..그냥 void 쓰고 넣어주고 끝나는거로 생각하면됨
	}


	
	int calLength() //둘레계산()

	{	
		int result;
		
		result = (w+h)*2;


		return result;
		

		//return (w+h)*2; 가능.
	}




	int calArea()//넓이계산()
	{

		//주요 변수 선언
		int result;

		//연산 및 처리 -> 선언한 변수들에 값 담아내기
		result = w*h;
		
		
		//최종 결과 반환
		return result;
	
		// return w*h; 가능.
	}


	void print(int a, int l)  //결과 출력 -> 넓이와 둘레 전달

	{
		// 가로 : w
		// 세로 : h
		//넓이 : w*h
		//둘레 :(w+h)*2

		System.out.println("가로 : " + w);
		System.out.println("세로 : " + h );		
		System.out.println("넓이 : " + a);
		System.out.println("둘레 : " + l);
		

	} //결과 출력

}
public class Test072

{
	public static void main(String[] args) 
	{
		//Rect 클래스 기반의 인스턴스 생성

		Rect ob = new Rect(); //인스턴스 생성
	
		//입력 메소드 호출

		ob.input();
		//넓이 연산 메소드

		int area = ob.calArea();

		//길이 연산 메소드
		int length = ob.calLength();
		
		
		ob.print(area,length); //순서만 지켜서 넘겨주면 된다.
		
		
		}


}



/*

실행결과

가로 입력 : 20
세로 입력 : 30
가로 : 20
세로 : 30
넓이 : 600
둘레 : 100
계속하려면 아무 키나 누르십시오 . . .

*/