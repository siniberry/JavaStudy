
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test035
{
	public static void main(String[]args)throws IOException
	{

		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		int n;

		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());
		
		/*
		if(n%2==0)
		{
			System.out.println(n+ " �� ¦�� ");
		}
		else if (n%2!=0)
		{
			System.out.println(n+ " �� Ȧ�� ");
		}
		else
		{
			System.out.println(n+ " �� �� ");
		}
		*/
		/*
		if (n%2!=0)
		{System.out.println(n+ " �� Ȧ�� ");}
		else if(n==0)
		{System.out.println(n+ " �� �� ");}
		else
		{System.out.println(n+ " �� ¦�� ");}
		*/

		String result="���� �Ұ�";

		if(n==0)
		{
			result = "��";
		}
		else if (n%2==0)
		{
			result = "¦��";
		}
		else if (n%2!=0)
		{
			result = "Ȧ��";
		}
		/*
		else
		{
			result = "���� �Ұ�";
		}*/

		System.out.println(n + " �� "+result);
	}
}

// �� ���ǹ��� ������ ������ �׻� ������ ���� ������ �����ؾ� �Ѵ�.

// �� if~else ������ ��ø ������
//	  �ݵ�� else�� ������ �ϴ� ���� �ƴϴ�.
//	  �ٸ�, ����ؾ� �� ������ ó���ϴ� ��������
//	  ������ �߻����� �ʴ� �������� �ۼ��ؾ� �Ѵ�.

// �� ���ǹ� ���� �������� �̿��� ����(else)��
//	  ������ ���Ե� �������� ó���ϴ� ���� �ٶ������� ���� ��찡 �ִ�.
//	  �Ұ����� ���� ��¿ �� ������
//	  �������̸� ������ ���Ե��� �ʴ� ������
//	  �̿��� ����(else)���� ó���� �� �ֵ��� ����.

//	  