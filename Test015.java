/* ================================
  ���� �ڹ� �⺻ ���α׷��� ����
  ================================= */

// �� ����
// �ﰢ���� �غ��� ���̿� ���̸� ����ڷκ��� �Է¹޾�
// �� �ﰢ���� ���̸� ���ϴ� ���α׷��� �����Ѵ�

// ���� ��)
// �� �ﰢ���� ���� ���ϱ� ��
// - �ﰢ���� �غ� �Է�: 
// - �ﰢ���� ���� �Է�:

// >> �غ��� , ���̰� �� �ﰢ���� ���� : xxx
// ����Ϸ��� �ƹ� Ű��...

//�� ���� �ν� �� �м�
//	 �ﰢ���� ���� =  �غ� * ���� / 2
//	 ����ڷκ��� �����͸� �Է¹޾� ó�� �� BufferedReader Ȱ��

import java.io.BufferedReader;
import java. io.InputStreamReader;
import java. io. IOException;

public class Test015{
	public static void main(String[] args) throws IOException
	{
		/* ���� Ǯ���� ���� ----------------------------------------------------------

		// BufferedReader �ν��Ͻ� ����
		BufferedReader si = new BufferedReader(new InputStreamReader (System.in));

		
		int a, b;
		double area;
		
		System.out.println("��ﰢ���� ���� ���ϱ� ��");
		System.out.print("- �ﰢ���� �غ� �Է�: ");

		a = Integer.parseInt( si.readLine());

		System.out.print("- �ﰢ���� ���� �Է�: ");

		b = Integer.parseInt( si.readLine());

		area = a * b;

		System.out.printf("�غ��� %d, ���̰� %d�� �ﰢ���� ���� : %d\n",a ,b,area);

		���� Ǯ���� ���� -----------------------------------------------------------*/


		// BufferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));

		
		int underLength, height;
		double area;
		// �� ����ڿ��� �ȳ� �޼��� ���
		System.out.println("��ﰢ���� ���� ���ϱ� ��");
		System.out.print("- �ﰢ���� �غ� �Է�: ");

		// �� ����ڰ� �Է��� �����͸� ���� ���·� ��ȯ�� ��
		//	  ���� underLength �� ��Ƴ���
		underLength = Integer.parseInt(br.readLine());

		// �� �ٽ� ����ڿ��� �ȳ� �޼��� ���
		System.out.print("- �ﰢ���� ���� �Է�: ");

		// �� ����ڰ� �Է��� �����͸� ���� ���·� ��ȯ�� ��
		//    ���� height�� ��Ƴ���
		height = Integer.parseInt(br.readLine());
		
		// �� �ﰢ���� ���� ���ϴ� ���� ó��
		// �ﰢ���� ���� = �غ� * ���� /2
		area = underLength * height /2.0;
		//         ������    ������ / ������ �� ���� ��� ���� ( ��, ���� ���ϰ� ������ ������ )
		//		   ������    ������ / �Ǽ��� �� �Ǽ� ��� ����

		// area = (double)(underLength * height /2);                //�� (X)
		// area = underLength * height /2;
		// area = (double)underLength * (double)height /2;
		// area = underLength * height /2.0;


		// �� �Ǽ� �ڷ����� ��������� ������ ��������
		//	  �Ǽ� ����� ������ �ʿ��� ��Ȳ�̴�
		//	  ������ ��2���� �ƴ�, �Ǽ��� ��2.0�� ���� ������ ������ �����ϰ� �Ǹ�
		//	  �� ������ �Ǽ� ������� ó���ȴ�.
		

		// ��� ���
		System.out.println();
	
		System.out.printf(">>�غ��� %d, ���̰� %d�� �ﰢ���� ���� : %.2f\n",underLength ,height,area);

	}
}

// ���� ���
/*
��ﰢ���� ���� ���ϱ� ��
- �ﰢ���� �غ� �Է�: 3
- �ﰢ���� ���� �Է�: 5

>>�غ��� 3, ���̰� 5�� �ﰢ���� ���� : 7.50
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/