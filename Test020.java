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
// �갡 ����ִ��� ��ġ �˷��ֱ�, ���� ������ ����ϴ� ��ĳ�ʴ� �� ��ĳ�ʾ� ~

public class Test020
{
	public static void main(String[]args)
	{
		// �ֿ� ���� ����
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng, mat, tot;


		// ���� �� ó��
		// - ����ڿ��� �ȳ� �޼��� ���
		System.out.print("�̸� ���� ���� ���� �Է�(���� ����) : ");

		// - ����ڰ� �Է��� �����͸� �� ������ �� ���� ��Ƴ���
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();

		// - ���� ����
		tot = kor + eng + mat;


		// ��� ���
		System.out.println();
		System.out.println(">> �̸� : " + name);
		System.out.println(">> ���� : " + tot);
	}
}

// ���� ���
/*
�̸� ���� ���� ���� �Է�(���� ����) : �Ž��� 90 80 70

>> �̸� : �Ž���
>> ���� : 240
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/