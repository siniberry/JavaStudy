/* ================================
  ���� ������(Operator) ����
  ================================= */

// ���� ������ == ���� ������

// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������... �������� ������� �Ǻ��Ͽ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.
//��, �Է��� BufferedReader�� readLine()�� Ȱ���ϰ�
// ���� �����ڸ� Ȱ���Ͽ� ������ ���� �� �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ ���� �Է� : 2000
// 2000�� �� ����
// ����Ϸ��� �ƹ� Ű�� ��������...

//������ ���� �Է� : 2022
// 2021�� �� ���
// ����Ϸ��� �ƹ� Ű�� ��������...

// �� 2���� 28�ϱ��� �ִ� �� �� ���
//			29�ϱ��� �ִ� �� �� ����


// �� ������ �Ǻ� ����
//	  ������ 4�� ����̸鼭 100�� ����� �ƴϰų�
//	  400�� ����̸� ����
//	  �׷��� ������ ���


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test032
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		
		int y;
		String result;

		System.out.print("������ ���� �Է� : ");
		y= Integer.parseInt(br.readLine());
		//-----------------
		//���ڿ��� br.readline���� ���о ���� ����
		

		//���� �ۼ��� �� �� result =  y%400==0 ? "����":( y%4==0 && y%100!=0 ? "����" : "���"); 
		
		result = y%4==0 && y%100!=0 || y%400==0 ? " ����" : "���";

		//���� �ۼ��� �� �� System.out.println(y+"�� �� "+result);
		System.out.printf("%d�� �� %s\n",y,result);

		
	}
}