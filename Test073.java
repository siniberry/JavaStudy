/*
===============================
���� Ŭ������ �ν��Ͻ� ����
================================

�� CircleTest.java ���ϰ� set��

//���� ���̿� �ѷ� ���ϱ�
//���� ���̿� �ѷ��� ���� �� �ִ� Ŭ���� ����
Ŭ���� �� CircleTest -> CircleTest.java

���� ���� = ������ * ������ * 3.141592
���� �ѷ� = ������ * 2 * 3.141592
BufferedReader�� readLine() ����Ұ�

���� ��


������ �Է� : xx
�������� xx�� ����
���� : xxx.xx
�ѷ� : xxx.xx

����Ϸ��� �ƹ� Ű�� ��������...

*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



public class Test073 
{
	public static void main(String[] args) throws IOException
	{			
			//CircleTest Ŭ���� ��� �ν��Ͻ� ����
			//CircleTest �ν��Ͻ� ����
			//CircleTest ��ü ����
			CircleTest ob = new CircleTest();
			ob.input();
			double area = ob.calarea();
			double length = ob.calLength();
			ob.print(area, length);
		
	}
}


/*
���� ���

������ �Է� : 3
�������� 3�� ���ǳ��� : 28.274328231811523
�ѷ� : 18.849552154541016
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/