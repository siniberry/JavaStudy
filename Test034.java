/*============================================
  ���� ���� �帧�� ��Ʈ��(���) ����
============================================*/

// if ~ else �� �ǽ�

// 1. ���α׷��� �ۼ��� �� �־��� ���ǿ� ����
//	  �б� ������ ���ϱ� ���� ����ϴ� �������
//	  if��, if~else��, ���ǿ�����, ����if��(if�� ��ø),
//	  switch ���� �ִ�.

// 2. if���� if ������ ������ ���� ���
//    Ư�� ������ �����ϰ��� �� �� ���Ǵ� �����̴�.


// �� ������ �Է¹޾� Ȧ��/¦�� �Ǻ��ϴ� ���α׷��� �����Ѵ�.
//	  ��, ���� if ������ ����Ѵ�.

import java.io. IOException;
import java.io. BufferedReader;
import java.io. InputStreamReader;


public class Test034
{
	public static void main(String[]arg)throws IOException
	{
	
	BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
		
	int a;
	String b = "Ȧ��";
	
	System.out.print("������ �Է��ϼ��� : ");
	a = Integer.parseInt(br.readLine());


	if (a%2==0)
	{ b="¦��";}
	System.out.println(b);

	}
}