/*===================================================
���� �÷��� �����ӿ�ũ(Collection Framework) ����
=====================================================*/

/*
�� ť(Queue)

	ť(Queue)�� ���Լ����� FIFO(First Input First Output) ������		cf. Test156 ���Լ���(LIFO) LAST INPUT FIRST OUTPUT
	���� �Էµ� �ڷḦ ���� ����ϸ�
	Queue �������̽��� ������ Ŭ������ ť�� ���õ� �پ��� ����� �����Ѵ�.

��  Queue "�������̽�" �ν��Ͻ��� �����ϱ� ���ؼ���
	new �����ڸ� �̿��Ͽ� Queue �������̽��� ������(implements)
	Ŭ������ �����ڸ� ȣ���Ѵ�.

	ex) Queue ob = new LinkedList();

��  �ֿ� �޼ҵ�
	
	- E element()		// return ��ȯ�� �޼ҵ�()�̹Ƿ� element() ������� �� ����� �ϴ� ���׸��� ��ȯ������ ��. element Ÿ���� ��ȯ������ ���ϰڴ�. ex. String element()
	  ť�� head ��Ҹ� ��ȯ�ϸ� �������� �ʴ´�.

	- boolean offer(E o)
	  ������ ��Ҹ� ť�� �����Ѵ�.
	
	- E peak()2
	  ť�� head ��Ҹ� ��ȯ�ϰ� �������� ������
	  ť �ڷᱸ���� empty �� ��� null �� ��ȯ�Ѵ�.

	- E poll()
	  ť�� head ��Ҹ� ��ȯ�ϰ� �����ϸ�
	  ť �ڷᱸ���� empty �� ��� null �� ��ȯ�Ѵ�.

	- E remove()
	  ť�� head ��Ҹ� ��ȯ�ϰ� �����Ѵ�.
*/

import java.util.Queue;
import java.util.LinkedList;

public class Test158
{
	public static void main(String[] args)
	{
		// Queue �ڷᱸ�� ����
		// Queue my Que = new Queue();	--(X) : �������̽��̱� ������ �ν��Ͻ� ���� �Ұ�
		Queue<Object> myQue = new LinkedList<Object>();

		// ������ �غ�
		String str1 = "�����";
		String str2 = "������";
		String str3 = "������";
		String str4 = "������";

		// myQue ��� Queue �ڷᱸ���� ������ �߰�
		myQue.offer(str1);
		myQue.offer(str2);
		myQue.offer(str3);
		boolean test = myQue.offer(str4);	//-- offer�� �Ҹ����� ��ȯ�ϹǷ� ���� �İ� ������.
		
		// �׽�Ʈ(Ȯ��)
		// System.out.println(myQue);		//-- ���� : ��Ʈ���� �� �ִ� �����Ͱ� �ƴ� ������ Ȯ�������� ����(dummy ��¥) ������. �׷��� ���ڿ� ¥���� �ϴ� ���� ������ ��Ʈ�� �ȵ�.
		
		// Queue �ڷᱸ������ ��Ҹ� �������� �ʰ� head ��� ��ȯ
		System.out.println("��1 : " + (String)myQue.element());
		System.out.println("��2 : " + (String)myQue.element());
		//--==>> ��1 : �����
		//		 ��2 : �����
		
		System.out.println();

		String val;

		// ��
		/*
		// peak()
		//-- ť�� head ��� ��ȯ. ���� ����.
		//	 ť�� empty �� ��� null �� ��ȯ
		while (myQue.peek() != null)			//-- ��ǻ� ��� Ȯ���ϰ� �������� ����
		{
			// poll()
			//-- ť�� head ��� ��ȯ. "����"��.
			//	 ť�� empty �� ��� null �� ��ȯ.
			val = (String)myQue.poll();			//-- ����
			System.out.println("��� : " + val);
		}
		System.out.println();
		//--==>>
		/*
		��� : �����
		��� : ������
		��� : ������
		��� : ������
		*/
		
		// �׽�Ʈ
		/*
		while (myQue.poll() != null)			
		{
			// poll()
			val = (String)myQue.poll();			
			System.out.println("��� : " + val);
		}
		System.out.println();
		//--==>> 
		/*
		��� : ������
		��� : ������
		*/
		
		/*
		while (myQue.peak() != null)			
		{
			// peak()
			val = (String)myQue.peak();			
			System.out.println("��� : " + val);
		}
		System.out.println();
		//--==>> 
		��ó�� �����̸� �������� ���
		*/


		// ��		
		/*
		while (true)
		{
			val = (String)myQue.poll();

			if (val==null)
				break;

			else
				System.out.println("��� : " + val);
		}
		System.out.println();
		//--==>>
		��� : �����
		��� : ������
		��� : ������
		��� : ������
		*/

		// ��
		/*
		while (!myQue.isEmpty())		//-- ������
		{
			val = (String)myQue.poll();	//-- �����ϰ�
			System.out.println("��� : " + val);
		}
		System.out.println();
		//--==>>
		/*
		��� : �����
		��� : ������
		��� : ������
		��� : ������
		*/

			
		
	}
}