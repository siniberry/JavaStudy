/*====================
���� �迭 ����
====================*/

// �迭�� ���� ó��(�� Random Ŭ���� Ȱ��)		***����***

// ����ڷκ��� ������ ������ �Է¹޾�
// �� ������ ������ŭ ����(1~100)�� �߻����� �迭�� ���
// �迭�� ����ִ� �����͵� ��
// ���� ū ���� ���� ���� ���� �����Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// �߻���ų ������ ���� �Է� : 10
// (50 7 24 81 72 45 61 38 1 99 �� �������� �߻��� ������...)
// (int[] arr = {50, 7, 24, 81, 72, 45, 61, 38, 1, 99} �� �迭�� ��Ƴ���(�迭 ����)
// ���� ū �� : 99, ���� ���� �� : 1
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.util.Scanner;
import java.util.Random;

public class Test097
{
	public static void main(String[] args)
	{
		//Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		// �ȳ� �޼��� ���
		System.out.print("�߻���ų ������ ���� �Է� : ");
		int size = sc.nextInt();

		// size ������ ��Ƴ� ����ŭ�� �迭�� �����
		// (�迭 ���� �� �޸� �Ҵ�)
		int[] arr = new int[size];

		// ������ ����(����)�� �߻���Ű�� ���ؼ���
		// ���� �߻� ���� ��ü�� �ʿ��ϴ�.
		// �� ��java.util.Random��
		Random rd = new Random();

		// �� Random Ŭ������ ��nextInt()�� �޼ҵ�
		//	  0 ~ �Ű������� �Ѱܹ��� ���� n-1 ������ �� ��
		//	  ������ ����(����) 1���� �߻���Ų��.
		// Random Ŭ������ nextInt�� �Ű������� �Ѱ������
		// rd.nextInt(10)		// 0 ~ 9. �߻��ϴ� ���� �ƴ�. �����δ� �� ��.
		
		// �׽�Ʈ
		//System.out.println("�߻��� ���� : " + rd.nextInt(10));
		// 0 ~ 9 ������ ���� ������ ������ ���� �� �� �߻�~!!!
		
		// �迭 ����
		// for (int i=0; i<arr.length; i++)
		for (int i=0; i<size; i++)
		{
			//rd.nextInt(100);
			//�� 0 ~ 99
			arr[i] = rd.nextInt(100) + 1;
			//�� 0 ~ 99 �� 1 ~ 100
		}
		//-- rd.nextInt(100)	�� 0 ~ 99 ������ ������ ���� �� �� �߻�
		//	 rd.nextInt(100)+1	�� 1 ~ 100 ������ ������ ���� �� �� �߻�
	
		// �׽�Ʈ �� ������ �迭�� ��ü ��� ���
		for (int i=0; i<arr.length; i++)
			System.out.printf("%4d", arr[i]);
			System.out.println();
		//--==>>
		
		/*
		�߻���ų ������ ���� �Է� : 10
		14   9  35  37  26  31  50  30  52  82
		����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
		�߻���ų ������ ���� �Է� : 10
		52  51  99  64  37  77  14  88  17  87
		����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
		*/
	
		//------------------------------------------- �迭 ���� �Ϸ�~!

		// ���� ���� ��, ���� ū �� ���
		
		//Scanner sc = new Scanner(System.in);

		int max, min;					//-- �ִ밪, �ּҰ�
		max=min=arr[0];					//-- max = min = 52; (�ٷ� ���� ���÷� ��ٸ�..)

		for (int i=1; i<arr.length ; i++)
		{
			if (max<arr[i])
				max = arr[i];
			
			// �ּҰ��� �ִ밪�� ���ϴ� ������ ���꿡 ������ �������� �����Ƿ� else if�� �ƴ�.
			if (min>arr[i])
				min=arr[i];
		}

		// ��� ���
		System.out.printf("���� ū �� : %d, ���� ���� �� : %d%n", max, min);
	}
}

// ������

/*
�߻���ų ������ ���� �Է� : 10
  63  22   5  36  42   1  95  43  81  32
���� ū �� : 95, ���� ���� �� : 1
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/