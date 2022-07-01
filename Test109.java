/*===============================
���� ����(Sort) �˰��� ����
===============================*/

/*
�� ����
   : �����͸� Ư���� ��Ģ(����)�� �°� ������� ����(��������, ��������)

�� ������ ����
   : ������ ó�� ������ ���Ǽ��̳� �������� ���̱� ����
   �� ���� ����.. �˻��ϱ� ����
   �� ������ �ݺ��� Ƚ���� ������

�� ������ ����
   : ���� ����, ���� ����, ���� ����, �� ����, �� ����, �� ����, ....
   �� ���ҽ� �Ҹ� ������ ���ϱ� ������ ����ؼ� ���� ������ ����

*/

// ���� ����(Selection Sort)
//�� �ϳ��� �����ϰ� ������ ������

// ���� ��)
// Source Data : 52 42 14 62 60
// Sorted Data : 12 42 52 60 62
// ����Ϸ��� �ƹ�Ű�� ��������...

public class Test109
{
	public static void main(String[]args)
	{
		int [] a = {52, 42, 12, 62, 60};
		
		/*
		52 42 12 62 60

		42 52 12 62 60
		== --

		12 52 42 62 60
		==    --

		12 52 42 62 60
		==       --

		12 52 42 62 60
		==          --
		------------------------------------- 1ȸ��
		12 42 52 62 60
		   == --
		 
		12 42 52 62 60
		   ==    --

		12 42 52 62 60
		   ==       --
		------------------------------------- 2ȸ��
		12 42 52 62 60
		      == --
		
		12 42 52 62 60
			  ==    --
		------------------------------------- 3ȸ��
		12 42 52 60 62
		         == --
		------------------------------------- 4ȸ��
		*/
		
		// ������ Ǯ�� 
		/*
		System.out.print("Source Data : ");
		
		for (int i = 0;i<a.length ;i++ )
		{
			System.out.print(a[i]+ " ");
		}
		System.out.println();

		for (int i = 0;i<a.length ;i++ )
		{
			for (int j=i+1;j<a.length ;j++ )
			{
			
				if (a[i]>a[j])
				{
					a[i] = a[i] ^ a[j];
					a[j] = a[j] ^ a[i];
					a[i] = a[i] ^ a[j];
				}
			}
		}

		
		System.out.print("Sorted Data : ");

		for (int i = 0;i<a.length ;i++ )
		{
				System.out.print(a[i]+" ");
		}
		System.out.println();
		*/

		int i, j;
		
		System.out.print("Sourse Data : ");
		
		/*
		for (i=0;i<a.length ;i++ )
			System.out.print(a[i] + " ");
		System.out.println();
		*/

		// ���� for�� (for each����)
		/*
		for (�ڷᱸ�� ����� Ÿ��+�̸�:�ڷᱸ��(��������ۼ�))
		{

		}
		*/
		for ( int n : a )
			System.out.print(n+" ");
		System.out.println();

		// Selection Sort
		for (i =0;i<a.length-1 ;i++ )
		{
			for (j=i+1;j<a.length ;j++ )
			{
				if (a[i]>a[j])
				{
				a[i] = a[i] ^ a[j];
				a[j] = a[j] ^ a[i];
				a[i] = a[i] ^ a[j];
				}	
			}
		}

		System.out.print("Sorted Data : ");
		/*
		for (i=0;i<a.length ;i++ )
			System.out.print(a[i] + " ");
		System.out.println();
		*/
		for (int n: a )
			System.out.print(n+" ");
		System.out.println();

		
	}
}

// ���� ���

/*
Sourse Data : 52 42 12 62 60
Sorted Data : 12 42 52 60 62
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/