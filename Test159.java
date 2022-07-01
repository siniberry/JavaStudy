/*===================================================
���� �÷��� �����ӿ�ũ(Collection Framework) ����
=====================================================*/

import java.util.Queue;
import java.util.LinkedList;

public class Test159
{
	// ���� ���ڿ� �迭 ���� �� �ʱ�ȭ
	private static final String[] colors
		= {"����", "���", "�ʷ�", "�Ķ�", "����", "����"};


	public static void main(String[] args)
	{
		// Queue �ڷ� ���� ����
		Queue<String> qu = new LinkedList<String>();
		//-- Queue �������̽� ����� �ν��Ͻ��� �����ϱ� ���ؼ���
		//	 new �����ڸ� �̿��Ͽ� Queue �������̽��� implements ��
		//   ���� Ŭ������ �����ڸ� ȣ���ؾ� �Ѵ�.

		// qu ��� Queue �ڷᱸ����
		// colors �迭�� ������ �Է� �� offer()
		

		for ( String color : colors )
		{
			qu.offer(color);
		}

		// qu ��� Queue �ڷᱸ���� ��� ������ ��ü ���
		// peek()
		//	: ť�� head ��Ҹ� ��ȯ�ϰ� �����ϱ� ������
		//	  ť �ڷᱸ���� ����ִ� ���°� �Ǹ� null ��ȯ
		// poll()
		// :  ť�� head ��Ҹ� ��ȯ�ϰ� �����ϸ�
		//	  ť �ڷᱸ���� ����ִ� ���°� �Ǹ� null ��ȯ

		while (qu.peek() != null)
		{
			System.out.print(qu.poll() + " ");
		}
		System.out.println();

	}
}

// ������
/*
���� ��� �ʷ� �Ķ� ���� ����
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/