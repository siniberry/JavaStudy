/* ================================
  ���� �ڹ� �⺻ ���α׷��� ����
  ================================= */

// �ڹ��� �⺻ ����� : java.until.Scanner

//   �� java.until.Scanner
//		�ܶ� ���� ������ ����Ͽ� �Է��� ��ū�� ���� �����ϸ�
//		����Ʈ(default)�� ���Ǵ� �ܶ����ڴ� �����̴�.
//		�ۼ��� ���� ��ū�� ��next()�� �޼ҵ� ���
//		�ٸ� ����(�ڷ���)�� ������ ��ȯ�� �� �ִ�.

import java.util.Scanner;

public class Test021
{
	public static void main(String[]args)
	{
		// �ֿ� ���� ����
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng, mat, tot;

		// ���� �� ó��
		System.out.print("�̸�,����,����,���� �Է�(��,������) :");
		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");
		//              -----------
		//			  �̿���,90,80,70

		// "\" �� ���� "\\" �� \�� ���ڷ� ����ϰ� ���� 2�������


		// sc = new Scanner("�̿���,90,80,70").useDelimiter("\\s*,\\s*");	
		//									  -------------- \s* , \s*      * �� ��ζ�� ��
		//							     	   �����ڷ� �ڸ� ---   ---
		//											 ��� ���ڿ�   ��� ���ڿ�


		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();

		tot = kor + eng + mat;


		// ��� ���
		System.out.println("\n>> �̸� : " +name);
		System.out.println(">> ���� : " + tot);
	}
}

// ���� ���
/*
�̸�,����,����,���� �Է�(��,������) :�̿���,90,80,70

>> �̸� : �̿���
>> ���� : 240
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/