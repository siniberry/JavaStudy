/*================================
  ���� Ŭ������ �ν��Ͻ� ����
=================================*/

// ������(Constructor)

/*
 �� ������(Constructor)�� ����

	1. �ν��Ͻ� ���� �� �޸� �Ҵ�
	2. �ʱ�ȭ


 �� ������(Constructor)�� Ư¡

 	1. �����ڴ� �޼ҵ������� , �Ϲ� �޼ҵ�ó�� ȣ��� �� ������,
	   ��ȯ �ڷ����� ���� �� ����.
	   (��void������ ���� �� ������, ���� ��ȯ�� ���� ����.)
	2. �����ڴ� Ŭ������ ������ �̸��� ������ �Ѵ�.
	   (��ҹ��� ��Ȯ�� ����)
	3. �����ڴ� ��ü�� �����ϴ� �������� ��new ������();���� ���·� ȣ��ȴ�.
	   (�ν��Ͻ� ���� �� �� �� ���� ȣ��)

*/


class NumberTest
{
	int num;
	
	// ����� ���� �����ڰ� �������� ���� ���...
	// ������ �������� �ڵ����� ���ԵǴ� ����Ʈ ������(default constructor)
	/*
	NumberTest()
	{
		// �� ����ִ� ����
	}
	*/
	
	// ����� ���� ������ 
	NumberTest()
	{
		num = 10;
		System.out.println("����� ���� ������ ȣ��~!!!");
	}

	int getNum()
	{
		return num;
	}
}


public class Test076
{
	public static void main(String[] args)
	{
		// NumberTest Ŭ���� ����� �ν��Ͻ� ����
		NumberTest nt1 = new NumberTest();
		//-- �ν��Ͻ��� �����Ǵ� ��������
		//	 �̿� ���ÿ� ������ ���� ���� ������ ȣ���� �̷������.
		//								  -----------
		//								  NumberTest()

		/*
		NumberTest nt1 = new NumberTest
								+
							 NumberTest()
		*/

		//nt1.NemberTest();
		// --==>> ���� �߻�(������ ����)
		//		  cannot find symbol

		System.out.println(nt1.getNum());
		//--==>> 10

		nt1.num = 100;
		System.out.println(nt1.getNum());
		//--==>> 100

		NumberTest nt2 = new NumberTest();
	
		int testResult = nt2.getNum();
		System.out.println(testResult);
		//--==>> 10
		
	}
}

// ���� ���
/*
����� ���� ������ ȣ��~!!!
10
100
����� ���� ������ ȣ��~!!!
10
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/