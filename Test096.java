/*====================
���� �迭 ����
====================*/

// �迭�� �迭(2���� �迭)		

// �� ����
// �迭�� �迭(������ �迭)�� Ȱ���Ͽ�
// ������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
/*

	A
	C	B
	D	E	F
	J	I	H	G
	K	L	M	N	O

����Ϸ��� �ƹ� Ű�� ��������...
*/

public class Test096
{
	public static void main(String[] args)
	{
		char[][]arr= new char [5][5];
		char num = 'A';

		for (int i=0;i<arr.length ;i++ )
		{
			for (int j=0; j<=i; j++)	
			{
				if (i%2==0)
				arr[i][j] = num;
				else 
				arr[i][i-j] = num;
				num++;
			}
				
		}
		

		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
				System.out.printf("%3c", arr[i][j]);
			System.out.println();
		}
	}
}
