/*============================================
  ���� �޼ҵ��� ��� ȣ�� ����
============================================*/

public class InfRecul
{
	public static void main(String[]args)
	{
		showHi(10);
	}

	// �ڵ� ������ 2���� ��ġ �ٲٱ�

	public static void showHi(int cnt)
	{	/*
		System.out.println("Hi~ ");
		showHi(cnt--);// --�� �ڷ� ������ ���� ó���ε� ������ ó���� ���� ����
		if (cnt==1)
		return;
		*/

		/*
		System.out.println("Hi~ ");
		showHi(--cnt);//1�ΰ��� if������ ������ ����?
		if (cnt==1)
		return;
		*/
		System.out.println("Hi~ ");

		if (cnt==1)
			return;

		showHi(--cnt);

	}
	
}