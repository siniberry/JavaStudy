/* ================================
  ���� �ڹ� �⺻ ���α׷��� ����
  ================================= */

// �ڹ��� �⺻ ����� : System.in.read()


/*
��System.in.read()�� �޼ҵ�� �� ���ڸ� �����´�
��, �Է¹��� �ϳ��� ���ڸ� ���� �״�� �������� ���� �ƴ϶�
ASCII Code ������ ��ȯ�Ѵ�.
*/

// ���� ��)
// �� ���� �Է� : A
// ���ڸ� ���� �Է� : 8

import java.io.IOException;

public class Test017
{
	public static void main(String[]args) throws IOException
	{
		/*
		// �ֿ� ���� ����
		char ch;

		// ����ڿ��� �ȳ� �޼��� ���
		System.out.print("���� �ϳ� �Է��ϼ��� : ");		//A
		ch = (char)System.in.read();						//65

		// ��� ���
		System.out.println(ch);
		*/
			
		// �ֿ� ���� ����
		char ch;
		int n;
		
		// ���� �� ó��

		System.out.print("�� ���� �Է� : ");
		ch=(char)System.in.read();

		// �Է� ��⿭�� �����ִ� ��\r���� ��\n���� ��ŵ (�ǳʶٱ�)
		System.in.skip(2);
		// �� �Ű�����(2)�� ���� �� ���ڸ� �����ʰ� �ǳʶٴ�.(������)

		System.out.print("�� �ڸ� ���� �Է� : ");
		n=System.in.read();

		// 1 �� 49
		// 2 �� 50
		// 3 �� 51
		//  :
		// 9 �� 57
		
		// �Է¹��� n �� 48��ŭ ���ҽ��Ѷ�
		n-=48;


		// ��� ���
		System.out.println();
		System.out.println("�Է��� ���� : "+ch);
		System.out.println("�Է��� ���� : "+n);


	}
}

// ���� ȭ�� 
/*
�� ���� �Է� : A
�� �ڸ� ���� �Է� : 5

�Է��� ���� : A
�Է��� ���� : 5
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .*/