/*====================
���� �迭 ����
====================*/

// �迭�� �迭(2���� �迭)		

// �迭�� �迭(������ �迭)�� Ȱ���Ͽ�
// ������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
/*	n
	��
	1 2 3 4 5
	5 1 2 3 4
	4 5 1 2 3
	3 4 5 1 2
	2 3 4 5 1
����Ϸ��� �ƹ� Ű�� ��������
*/

/*	
	1 2 3 4 5		�� i=0	0 ���� ���
	5 1 2 3 4		�� i=1	1 ���� ���
	4 5 1 2 3		�� i=2	2 ���� ���
	3 4 5 1 2		�� i=3	3 ���� ���
	2 3 4 5 1		�� i=4	4 ���� ���
				
����Ϸ��� �ƹ� Ű�� ��������
*/

/*        0����..
1 2 3 4 5 |	
  1 2 3 4 | 5 		
    1 2 3 | 4 5		
      1 2 | 3 4 5 		
        1 | 2 3 4 5 		
*/

public class Test090	
{
	public static void main(String[] args)
	{
		// �迭�� �迭 ���� + �޸� �Ҵ�
		int[][] arr = new int[5][5];

		// �迭 ä���ֱ�
		for (int i=0; i<arr.length; i++)
		{
			for (int n=1, j=i; n<=5; n++)	// n �� 1 2 3 4 5
			{											
				// System.out.print(i+"-"+j+"     ");	// 00��1 11��1 22��1 33��1 44��1
														// 01��2 12��2 23��2 34��1 40��2
				arr[i][j] = n;							// 02��3 13��3 24��3 35��1 41��3
														// 03��4 14��4 20��4 31��1 42��4
														// 04��5 10��5 21��5 32��1 43��5
				j++;
				if(j==5)
					j=0;
			}
				System.out.println();
		}
		
		// ����� ����ϱ�
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}
}

// ������
/*
  1  2  3  4  5
  5  1  2  3  4
  4  5  1  2  3
  3  4  5  1  2
  2  3  4  5  1
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/