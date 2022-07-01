/*========================
���� Ŭ���� ��� ����
========================*/

// �������̽�(Interface)

// �� �ǽ� ����
// ���� ó�� ���α׷��� �����Ѵ�.
// ��, �������̽��� Ȱ���� �� �ֵ��� �Ѵ�.

// ���� ��)
// �ο� �� �Է�(1~10) : 2
// 1��° �л��� �й� �̸� �Է�(���� ����) : 2280946 ȫ����
// ���� ���� ���� ���� �Է�   (���� ����) : 90 100 85
// 2��° �л��� �й� �̸� �Է�(���� ����) : 2290847 �ֹ���
// ���� ���� ���� ���� �Է�   (���� ����) : 85 70 65

// 2280946 ȫ����		90 100 85   xxx    xx
//						��  �� ��
// 2290847 �ֹ���		85  70 65   xxx    xx
//						��  �� ��

// ����Ϸ��� �ƹ� Ű�� ��������...

import java.util.Scanner;

// �Ӽ��� �����ϴ� Ŭ���� �� �ڷ��� Ȱ��
class Record 
{
	String hak, name;		//-- �й�, �̸�
	int kor, eng, mat;		//-- ����, ����, ���� ����
	int tot, avg;			//-- ����, ���(���ǻ� ���� ó��)
}

// �������̽�
interface Sungjuk 
{
	public void set();		//-- �ο� ����
	public void input();	//-- ������ �Է�
	public void print();	//-- ��� ���
}

// ���� �ذ� �������� �����ؾ� �� Ŭ���� �� Sungjuk  �������̽��� �����ϴ� Ŭ����
class SungjukImpl implements Sungjuk
{
	private int inwon;
	private Record[]rec;
	
	@Override
	public void set()
	{
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.print("�ο� �� �Է�(1~10) :");
			inwon = sc.nextInt();
		}
		while (inwon<1||inwon>10); // 1~10�� �ƴϸ� �ݺ� 

		rec =new Record [inwon]; // �Է� ���� �ο� �� ��ŭ �迭
	}

	@Override
	public void input()
	{
		Scanner sc = new Scanner(System.in);

		for (int i=0;i<inwon;i++ )
		{
			rec[i] = new Record();
			
			System.out.printf("%d��° �л��� �й� �̸� �Է�(���� ����) : ",(i+1));
			rec[i].hak = sc.next();
			rec[i].name = sc.next();

			System.out.print("���� ���� ���� ���� �Է�   (���� ����) : ");
			rec[i].kor = sc.nextInt();
			rec[i].eng = sc.nextInt();
			rec[i].mat = sc.nextInt();

			rec[i].tot = rec[i].kor +rec[i].eng +rec[i].mat;

			rec[i].avg = rec[i].tot/3;

		}
	}

	// ���������� ��޿� ���� ������ ������ �޼ҵ�
	private String panjung(int score)
	{
		
		switch (score/10)
				{
					case 10:case 9: return"��";
					case 8: return"��";
					case 7: return"��";
					case 6: return"��";
					default : return"��";
				} 
	}

	@Override
	public void print() 
	{
		for (int i =0;i<inwon ;i++ )
		{
			System.out.printf("%s  %s    %3d %3d %3d    %3d  %3d\n", rec[i].hak, rec[i].name, rec[i].kor, rec[i].eng, rec[i].mat, rec[i].tot, rec[i].avg);
			System.out.printf("%18s %s %s%n",panjung(rec[i].kor),panjung(rec[i].eng),panjung(rec[i].mat));
		}
	}

}

// main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test123
{
	public static void main(String[]args)
	{
		Sungjuk ob;

		// ���� �ذ� �������� �ۼ��ؾ� �� ob ����

		ob = new SungjukImpl();

		ob.set();
		ob.input();
		ob.print();
	}
}