/*===================================================
���� �÷��� �����ӿ�ũ(Collection Framework) ����
=====================================================*/

// ���� �ڷᱸ�� ��ü ���� �� ���� ��
// ����� ���� Ŭ���� Ȱ��
// �� �ڷ���

import java.util.Vector;

// ����� ���� Ŭ���� ���� �� �ڷ���ó�� Ȱ��
class MyData
{
	// �ֿ� �Ӽ� ���� �� �ֿ� ���� ����(��� ����)
	private String name;		// �̸�
	private int age;			// ����
	
	// getXxx() �� getter
	// setXxx() �� setter

	// getter / setter ����
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	// ������(�Ű����� 2�� ������) �� ����� ���� ������
	public MyData(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	// �� ����� ���� �����ڰ� ������ ���
	//	  default �����ڰ� �ڵ����� ���Ե��� �ʱ� ������
	//	  default ������ ������ �����ڸ� ����� ���� �����ڷ�
	//	  �߰� �����ϰ� �Ǵ� ���� �Ϲ����� Ŭ���� ���� ����
	//	  (��, �ݵ�� �����ؾ� �� �ʿ�� ����)

	// ������(�Ű����� ���� ������) �� ����� ���� ������
	public MyData()
	{
		name = "";
		age = 0;
	}
}

public class Test164
{
	public static void main(String[]args)
	{
		// ��Ÿ �ڷᱸ�� ����
		Vector<MyData> v = new Vector<MyData>();

		// ���� �ڷᱸ�� v��
		// ȫ���� 13�� / ������ 7�� / ������ 78��
		// ��Ƴ���
		
		// ��
		/*
		MyData st1 = new MyData();
		st1.setName("ȫ����");
		st1.setAge(13);
		v.add(st1);
		
		st2.setName("������");
		st2.setAge(7);
		v.add(st2);

		st3.setName("������");
		st3.setAge(78);
		v.add(st3);
		*/

		// ��
		/*
		MyData st1 = new MyData("ȫ����",13);
		v.add(st1);

		MyData st2 = new MyData("������",7);
		v.add(st2);

		MyData st3 = new MyData("������",78);
		v.add(st3);
		*/

		// ��
		
		v.add(new MyData("ȫ����",13));
		v.add(new MyData("������",7));
		v.add(new MyData("������",78));
		

		// ���� �ڷᱸ�� v�� ��� ����(���) ��ü ����ϱ�
		// ���� ��)
		// �̸�:ȫ����, ����:13��
		// �̸�:������, ����:7��
		// �̸�:������, ����:78��

		//��
		for (MyData obj : v)
			System.out.printf("�̸�:%s, ����:%d��\n",obj.getName(), obj.getAge());
		System.out.println();
		//--==>>
		/*
		�̸�:ȫ����, ����:13��
		�̸�:������, ����:7��
		�̸�:������, ����:78��
		*/

		// ��
		for (int i=0;i<v.size() ;i++ )
			System.out.printf("�̸�:%s, ����:%d��\n",v.elementAt(i).getName(),v.elementAt(i).getAge());
		System.out.println();
		//--==>>
		/*
		�̸�:ȫ����, ����:13��
		�̸�:������, ����:7��
		�̸�:������, ����:78��
		*/

		//��
		for (Object temp : v)
			System.out.printf("�̸�:%s, ����:%d��\n",((MyData)temp).getName(), ((MyData)temp).getAge());
		System.out.println();
		//--==>>
		/*
		�̸�:ȫ����, ����:13��
		�̸�:������, ����:7��
		�̸�:������, ����:78��
		*/



	}
}