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

public class Test019
{
	public static void main(String[] args)
	{
		// Scanner Ŭ���� ����� �ν���Ʈ ����
		// ����(�뿪)�� ���������� InputStreamReader ��� ���ص� ��
		// �̹� IOEx ������ �޾� throws IOException ���ص� ��
		Scanner sc = new Scanner(System.in);


		// �ֿ� ���� ����
		String name;
		int kor, eng, mat;

		// ���� �� ó��
		System.out.print("�̸��� �Է��ϼ��� : ");
		name = sc.next();
		//��sc.next(); ���ڿ��� ���·� ������

		System.out.print("���� ���� �Է� : ");
		//kor = Integar.parseInt(sc.next());
		kor = sc.nextInt();

		System.out.print("���� ���� �Է� : ");
		eng = sc.nextInt();

		System.out.print("���� ���� �Է� : ");
		mat = sc.nextInt();
		
		// ��� ���
		System.out.println();
		System.out.println(">> �̸� : " +name);
		System.out.println(">> ���� : " +(kor+eng+mat));
	}
}

// ���� ���

/*
�̸��� �Է��ϼ��� : �Ž���
���� ���� �Է� : 90
���� ���� �Է� : 90
���� ���� �Է� : 90

>> �̸� : �Ž���
>> ���� : 270
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/