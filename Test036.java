/*============================================
  ���� ���� �帧�� ��Ʈ��(���) ����
============================================*/

// if ~ else �� �ǽ�

// 1. ���α׷��� �ۼ��� �� �־��� ���ǿ� ����
//	  �б� ������ ���ϱ� ���� ����ϴ� �������
//	  if��, if~else��, ���ǿ�����, ����if��(if�� ��ø),
//	  switch ���� �ִ�.

// 2. if���� if ������ ������ ���� ���
//    Ư�� ������ �����ϰ��� �� �� ���Ǵ� �����̴�.

// ����ڷκ��� ������ ������ �Է¹޾�
// ������ ���� �Ǻ� ����� ����ϴ� ���α׷��� �����Ѵ�.

// 2�� ��� / 3�� ��� / 2�� 3�� ��� / 3�� 3�� ��� �ƴ�

// ���� ��)
// ������ ���� �Է� : 4
// 4 �� 2�� ���
// ����Ϸ��� �ƹ� Ű�� ��������...

// ������ ���� �Է� : 9
// 9 �� 3�� ���
// ����Ϸ��� �ƹ�Ű�� ��������...

// ������ ���� �Է� : 6
// 6 �� 2�� 3�� ���
// ����Ϸ��� �ƹ�Ű�� ��������...

// ������ ���� �Է� : 17
// 17 �� 2�� 3�� ��� �ƴ�
// ����Ϸ��� �ƹ�Ű�� ��������...

import java.io. BufferedReader;
import java.io. IOException;
import java.io. InputStreamReader;

public class Test36
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));

		int a;

		System.out.print(" ������ ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		if (a%2==0 && a%3==0)
		{
			System.out.printf("%d �� 2�� 3�� ���\n",a);
		}
		else if (a%2==0)
		{
			System.out.printf("%d �� 2�� ���\n",a);
		}
		else if (a%3==0)
		{
			System.out.printf("%d �� 3�� ���\n",a);
		}
		else if (a%2!=0 && a%3!=0)
		{
			System.out.printf("%d �� 2�� 3�� ��� �ƴ�\n",a);
		}
		else
		{
			System.out.printf("%d �� ���� �Ұ�\n",a);
		}
	}
}