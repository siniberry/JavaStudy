/* ================================
  ���� ������(Operator) ����
  ================================= */

// ���� ������ == ���� ������

// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������ �������, ��������, 0���� �����Ͽ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, �Է� �����ʹ� BufferedReader �� readLine()�� ���� �Ѱܹ��� �� �ֵ��� �Ѵ�.
// ����, ���� ������(���׿�����)�� Ȱ���Ͽ� ����� ������ �� �ֵ��� �Ѵ�


// ���� ��)
// ������ ���� �Է� : -12
// -12 �� ����
// ����Ϸ��� �ƹ� Ű�� ��������...

// ������ ���� �Է� : 257
// 257 �� ���
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


// ������ ���� �Է� : 0
// 0 �� ��
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

// Hint : ���ǿ����� ��ø

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test030
{
	public static void main(String[]args)throws IOException
	{
		// �ֿ� ���� ����
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int n;
		String strResult;
	
		// ���� �� ó��
		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());
		/*
		 n�� 0���� ũ�� �� true  �� n�� ���
						�� false �� n�� 0���� �۴� �� true	�� n�� ����
												   �� false	�� n�� ��
		*/
		// ����? ���϶� : ���� ? ���϶� : �����϶�;
		strResult= (n>0) ? "���" : (n<0) ? "����" : "��";


		// ���� ��� ���
		System.out.printf("%d �� %s\n",n,strResult);
		
	


	
	}
}