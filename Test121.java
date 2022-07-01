/*========================
���� Ŭ���� ���� ����
========================*/

// �������̽�(Interface)

// �������̽�
interface Demo
{
	public void write();
	public void print();
}

// �������̽��� �����ϴ� �߻� Ŭ����
abstract class DemoImpl implements Demo
{
	@Override
	public void write()
	{
		System.out.println("write() �޼ҵ� ������...");
	}

	// public void print();
}

// �߻� Ŭ������ ��ӹ޴� �߻� Ŭ����
//abstract class DemoImlSub extends DemoImpl
//	��
// �߻� Ŭ������ ��ӹ޴� Ŭ����
class DemoImplSub extends DemoImpl
{
	/*
	@Override
	public void write()
	{
		System.out.println("write() �޼ҵ� ������...");
	}
	*/
	@Override
	public void print()
	{
		System.out.println("print() �޼ҵ� ������...");
	}
}

// main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test121
{
	public static void main(String[]args)
	{
		//Demo ob1 = new Demo();
		//-- �ν��Ͻ� ���� �Ұ� �� �������̽�

		//DemoImpl ob2 = new DemoImpl();
		//-- �ν��Ͻ� ���� �Ұ� �� �߻�Ŭ����

		DemoImplSub ob3 = new DemoImplSub();

		ob3.write();
		ob3.print();
		//--==>> write() �޼ҵ� ������...
		//		 print() �޼ҵ� ������...
	}
}

// ��� ���

/*
write() �޼ҵ� ������...
print() �޼ҵ� ������...
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/