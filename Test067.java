/*============================================
  ���� ���� �帧�� ��Ʈ��(���) ����
============================================*/

// break �ǽ�

// ������ ���� ó���� �̷������ ���α׷��� �����Ѵ�.
// ��, �Է¹޴� ������ 1~100 ���� �ȿ�����
// �����ϵ��� �ۼ��Ѵ�.

// ���� ��)
// ������ ���� �Է� : -10

// ������ ���� �Է� : 0

// ������ ���� �Է� : 2022

// ������ ���� �Է� : 10
// >> 1 ~ 10 ������ �� : 55
// ����Ͻðڽ��ϱ�?(Y/N)? : y

// ������ ���� �Է� : 100
// >> 1 ~ 10 ������ �� : 5050
// ����Ͻðڽ��ϱ�?(Y/N)? : N
// ����Ϸ��� �ƹ� Ű�� ��������... �� ���α׷� ����
	
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test067
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		
		// �ʱ�ȭ check~!!
		int n, s, i;
		//	 n : ����� �Է°��� ��Ƶ� ����
		//	 s : ������ ���� ����� ��Ƴ� ����
		//	 i : 1���� 1�� ������� �Է°����� ������ ����

		char ch;
		//	 ���μ����� ��� �������� ������ ���θ� ��Ƶ� ����

		while (true)
		{
			do
			{
			System.out.print(" \n������ ���� �Է� : ");
			n=Integer.parseInt(br.readLine());
			}
			while (n<1||n>100);
			
			s =0;		// ������ ������ �ʱ�ȭ ��ġ check!

			for (i=1; i<=n; i++)
				s+=i;
			
			System.out.printf(" >> 1 ~ %d ������ �� : %d%n",n,s);
		
		
			System.out.print("����Ͻðڽ��ϱ�?(Y/N)? :");
			ch = (char)System.in.read();

			// �׸��ҷ� �ǻ�ǥ��
			//if (ch=='N'||ch=='n')		N �Ǵ� n �Է��Ѱ� ����?
			if (ch!='Y'&& ch!='y')
			{
			// �ݺ����� ���߰� �������� �� �ִ� ó��
			// ���� ���� �ǻ� ǥ���� �ߴٸ�
			//  �׵��� �����ߴ� �ݺ����� ���߰� ���������� �Ѵ�.
			break;
			// ����� ( + �׸��� ����������)
		
			}//end if

			// ���Ͱ�(\r\n)ó��
			System.in.skip(2);

		}//end while
		//����� ��������
		
	}//end main
}// end class