
/*
===============================
���� Ŭ������ �ν��Ͻ� ����
================================


�� Test 073.java �� set��


*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class CircleTest

{

	//������� -> �ֿ� �Ӽ�
	final float PI = 3.141592f; //������ �ٲ�� �ȵǴϰ� final
	int r;				  //������

	//��� �޼ҵ� -> �ֿ� ��� (����, ����)

	
	//������ �Է� ��� -> �޼ҵ� ����
	void input() throws IOException{ //�޼ҵ忡�� throwsó�� ����.
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("������ �Է� : ");
			r = Integer.parseInt(br.readLine());

	}

	//���� ��� ��� -> �޼ҵ� ����
	double calarea(){

		double result;
		result = r * r * PI;
		return result;

	}


	//�ѷ� ��� ��� -> �޼ҵ� ����

	double calLength(){

		double result;
		result = 2 * r * PI;
		return result;
	}

	
	//��� ��� -> �޼ҵ� ����

	void print(double a, double l){ //print ������ �̸��� �ƹ��ų� �ص��� ���Ѱŷ� ��
		System.out.printf(">> �������� %d�� ����%n" , r);
		System.out.println(">> ���� : " + a);
		System.out.println(">> �ѷ� : " + l);
	
	}

}
