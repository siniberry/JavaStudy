/*========================
���� Ŭ���� ��� ����
========================*/

// ��ø Ŭ����

// outer
class Test2
{
	static int a =10;		// ��������, Test2�� �������, static����(class���� Ŭ��������)
	int b = 20;				// ��������, Test2�� �������, non-static����(instance���� �ν��Ͻ�����)

	void write()	// �� ù ��° write() �޼ҵ�
	{
		System.out.println("write()...��");
		final int c = 20;	// ��������, ���ȭ�Ⱥ���(���� ������ �ʴ� ����)
		int d = 40;			// ���� ����, ���� ���÷� ���� �� �ִ� ����
 
 		// �޼ҵ� �ȿ� �����ϴ� �Ǵٸ� Ŭ����(���� Ŭ����, local class, ���� Ŭ����)
		// inner
		class LocalTest	//  �޼ҵ� �ȿ� ����� Ŭ���� - ���� Ŭ����
		{	
			void write()	// �� �� ��° write() �޼ҵ�
			{
				System.out.println("write()...��");
				System.out.println("a : " + a);
				System.out.println("b : " + b);
				System.out.println("c : " + c);
				System.out.println("d : " + d);		//-- ���� �߻�(������ ����)
			}
		}
		
		// �� ���� c�� ���� d�� �� �� �������� ������...
		//	  c �� final �����̱� ������
		//	  �� ��° write() �޼ҵ忡�� ���� �����ϴ����
		//	  ������ ������ ������� �� �ִ�.
		//	  �ݸ鿡 d�� �� ���� ���÷� ������ �� �ִ� ��Ȳ�̹Ƿ�
		//	  LocalTest Ŭ������ �ν��Ͻ� ���� ������
		//	  ������ ���� �� �� ���� ������
		//	  �׷��ٸ� d �� � ���� ����ִ��� ������� �� ���� ������
		//	  ���� d�� �����ϴ� ���� ���� �� �ֵ��� ���������� ó��

		//d =10;
		//d -= 30;

		LocalTest lt = new LocalTest();
		lt.write();		//-- �� ��° write() �޼ҵ� ȣ��

		//d += 10;
	}
}

//main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test125
{
	public static void main(String[]args)
	{
		Test2 ob = new Test2();
		ob.write();		//-- ù ��° write() �޼ҵ� ȣ�� 
	}
}