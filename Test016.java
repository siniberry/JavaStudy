/* ================================
  ���� �ڹ� �⺻ ���α׷��� ����
  ================================= */

// ������ �ڷ���
// �ڹ��� �⺻ ����� : BufferedReader Ŭ����

// ����ڷκ��� �̸�, ��������, ��������, ���������� �Է¹޾�
// �̸��� ������ ����ϴ� ���α׷��� �����Ѵ�

//���� ��)
// �̸��� �Է��ϼ��� : �Ž���
// ���� ���� �Է� : 90
// ���� ���� �Է� : 80
// ���� ���� �Է� : 70

// ===[ ��� ]===
// �̸� : �Ž���
// ���� : 240
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test016
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (isr);
		
		
		String	strName;			//�� �밡���� ǥ�� ��
		int nKor,nEng,nMat;  
		int nSum;

	
		System.out.print("�̸��� �Է��ϼ��� : ");


		//  ����ڰ� �Է��� ��(�ܺ� ������)�� ������ ���
		strName = br.readLine();

		System.out.print("���� ���� �Է� :");

		nKor = Integer.parseInt(br.readLine());

		System.out.print("���� ���� �Է� : ");

		nEng = Integer.parseInt(br.readLine());

		System.out.print("���� ���� �Է� : ");

		nMat = Integer.parseInt(br.readLine());

		nSum = nKor + nEng + nMat;

		System.out.println("===[ ��� ]===");
		System.out.printf("�̸� : %s \n���� : %d\n",strName,nSum);
		

	}
}

// ���� ���
/*
�̸��� �Է��ϼ��� : �Ž���
���� ���� �Է� :90
���� ���� �Է� : 80
���� ���� �Է� : 70
===[ ��� ]===
�̸� : �Ž���
���� : 240
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/