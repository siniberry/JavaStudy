/*====================
���� �迭 ����
====================*/

// �迭�� �迭(2���� �迭)		

// �迭�� �迭(������ �迭)�� Ȱ���Ͽ�
// ������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
/*
	E	J	O	T	Y
	D	I	N	S	X
	C	H	M	R	W
	B	G	L	Q	V
	A	F	K	P	U
����Ϸ��� �ƹ� Ű�� ��������...
*/

public class Test092
{
	public static void main(String[] args)
	{
		// �迭�� �迭 ���� + �޸� �Ҵ�
		char[][] arr = new char[5][5];

		char start='A';

		// �迭 ä���ֱ�
		for (int i=0; i<5; i++)			// i �� 0 1 2 3 4
		{	
			for (int j=4; j>=0; j--)		
				arr[j][i] = (char)start++;	//-- ĳ����Ÿ������ ��ȯ���� �ʴ��� start ������ ĳ����Ÿ���̳�, �������·� ��ȯ�Ǿ� arr[j][i]���� ��ǻ� ������ ��� ��.
		}									//	 �׷��� �ؿ� '��ü ��� ���'���� %c�� ������ ����Ÿ������ ������ ��.

		// ��ü ��� ���
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
				System.out.printf("%3c", arr[i][j]);
			System.out.println();
		}
	}
}

// ���� ���

/*

  E  J  O  T  Y
  D  I  N  S  X
  C  H  M  R  W
  B  G  L  Q  V
  A  F  K  P  U
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/