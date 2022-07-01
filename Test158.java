/*===================================================
■■■ 컬렉션 프레임워크(Collection Framework) ■■■
=====================================================*/

/*
○ 큐(Queue)

	큐(Queue)는 선입선출의 FIFO(First Input First Output) 구조로		cf. Test156 후입선출(LIFO) LAST INPUT FIRST OUTPUT
	먼저 입력된 자료를 먼저 출력하며
	Queue 인터페이스를 구현한 클래스는 큐와 관련된 다양한 기능을 제공한다.

※  Queue "인터페이스" 인스턴스를 생성하기 위해서는
	new 연산자를 이용하여 Queue 인터페이스를 구현한(implements)
	클래스의 생성자를 호출한다.

	ex) Queue ob = new LinkedList();

○  주요 메소드
	
	- E element()		// return 반환형 메소드()이므로 element() 사용했을 때 담고자 하는 제네릭이 반환형으로 옴. element 타입을 반환형으로 취하겠다. ex. String element()
	  큐의 head 요소를 반환하며 삭제하지 않는다.

	- boolean offer(E o)
	  지정된 요소를 큐에 삽입한다.
	
	- E peak()2
	  큐의 head 요소를 반환하고 삭제하지 않으며
	  큐 자료구조가 empty 인 경우 null 을 반환한다.

	- E poll()
	  큐의 head 요소를 반환하고 삭제하며
	  큐 자료구조가 empty 인 경우 null 을 반환한다.

	- E remove()
	  큐의 head 요소를 반환하고 삭제한다.
*/

import java.util.Queue;
import java.util.LinkedList;

public class Test158
{
	public static void main(String[] args)
	{
		// Queue 자료구조 생성
		// Queue my Que = new Queue();	--(X) : 인터페이스이기 때문에 인스턴스 생성 불가
		Queue<Object> myQue = new LinkedList<Object>();

		// 데이터 준비
		String str1 = "우수정";
		String str2 = "이지연";
		String str3 = "박현수";
		String str4 = "이윤태";

		// myQue 라는 Queue 자료구조에 데이터 추가
		myQue.offer(str1);
		myQue.offer(str2);
		myQue.offer(str3);
		boolean test = myQue.offer(str4);	//-- offer는 불린형을 반환하므로 위에 식과 동일함.
		
		// 테스트(확인)
		// System.out.println(myQue);		//-- 더미 : 컨트롤할 수 있는 데이터가 아닌 일종의 확인차원의 더미(dummy 가짜) 데이터. 그래서 문자열 짜르고 하는 식의 데이터 컨트롤 안돼.
		
		// Queue 자료구조에서 요소를 제거하지 않고 head 요소 반환
		System.out.println("값1 : " + (String)myQue.element());
		System.out.println("값2 : " + (String)myQue.element());
		//--==>> 값1 : 우수정
		//		 값2 : 우수정
		
		System.out.println();

		String val;

		// ①
		/*
		// peak()
		//-- 큐의 head 요소 반환. 제거 안함.
		//	 큐가 empty 일 경우 null 을 반환
		while (myQue.peek() != null)			//-- 사실상 요소 확인하고 데려오는 역할
		{
			// poll()
			//-- 큐의 head 요소 반환. "제거"함.
			//	 큐가 empty 일 경우 null 을 반환.
			val = (String)myQue.poll();			//-- 제거
			System.out.println("요소 : " + val);
		}
		System.out.println();
		//--==>>
		/*
		요소 : 우수정
		요소 : 이지연
		요소 : 박현수
		요소 : 이윤태
		*/
		
		// 테스트
		/*
		while (myQue.poll() != null)			
		{
			// poll()
			val = (String)myQue.poll();			
			System.out.println("요소 : " + val);
		}
		System.out.println();
		//--==>> 
		/*
		요소 : 이지연
		요소 : 이윤태
		*/
		
		/*
		while (myQue.peak() != null)			
		{
			// peak()
			val = (String)myQue.peak();			
			System.out.println("요소 : " + val);
		}
		System.out.println();
		//--==>> 
		맨처음 수정이만 무한으로 출력
		*/


		// ②		
		/*
		while (true)
		{
			val = (String)myQue.poll();

			if (val==null)
				break;

			else
				System.out.println("요소 : " + val);
		}
		System.out.println();
		//--==>>
		요소 : 우수정
		요소 : 이지연
		요소 : 박현수
		요소 : 이윤태
		*/

		// ③
		/*
		while (!myQue.isEmpty())		//-- 망보고
		{
			val = (String)myQue.poll();	//-- 제거하고
			System.out.println("요소 : " + val);
		}
		System.out.println();
		//--==>>
		/*
		요소 : 우수정
		요소 : 이지연
		요소 : 박현수
		요소 : 이윤태
		*/

			
		
	}
}