import java.util.Scanner; // ������ Ŭ���� ���� �ƹ������� ���� ��.
						 //Ŭ���� �ΰ��ϱ� ������ ������ (public �����ϱ�..)

class Rect{ //���簢�� Ŭ���� ����
	
	//������ �Ӽ�, ���� -> ����

	int w, h;//����, ����;
	

	//��� ���� ���� -> �޼ҵ�
	void input() //��ȯ�ڷ���(void) + ���μ��� �Է�() ������ �ƴϴϱ� void �����! ���� �־��ִ°��̴ϱ� ��
	{	
		Scanner sc = new Scanner(System.in);
		//��ĳ�� ���� ��ü������ �ʿ��ϴϱ� ���� �� ������Ʈ �ۿ��� �ϸ� �޸𸮸� �����ϴϱ�
		//����ϴ� ������ �������ֱ�.
		//��� �޼ҵ忡�� Scanner�� �� ��쿡�� ���� ���� �ִ� �޼ҵ� ���� Scanner sc; �� ���ְ�,
		//��� �޼ҵ帶�� sc = new Scanner(System.in); �̷��� �ؾ���!!!!!!!!

		System.out.print("���� �Է� : ");
		w = sc.nextInt();

		System.out.print("���� �Է� : ");
		h = sc.nextInt();

		//���� �����Ѱſ��ٰ� �ִ°Ŵϱ� ���� ȣ���Ѱ��� ���� �� �ʿ䰡 ����.
		//�׷��� return ���صε�.


		//�ٵ�  ȣ���� ������ �Է� �� �޾Ҵٰ� ȣ���ϰ� ������ return �ص� ��. String �ϰ� return "���� ���� �Է� �� �޾���." �̷�������...
		//���� �̷��� ����..�׳� void ���� �־��ְ� �����°ŷ� �����ϸ��
	}


	
	int calLength() //�ѷ����()

	{	
		int result;
		
		result = (w+h)*2;


		return result;
		

		//return (w+h)*2; ����.
	}




	int calArea()//���̰��()
	{

		//�ֿ� ���� ����
		int result;

		//���� �� ó�� -> ������ �����鿡 �� ��Ƴ���
		result = w*h;
		
		
		//���� ��� ��ȯ
		return result;
	
		// return w*h; ����.
	}


	void print(int a, int l)  //��� ��� -> ���̿� �ѷ� ����

	{
		// ���� : w
		// ���� : h
		//���� : w*h
		//�ѷ� :(w+h)*2

		System.out.println("���� : " + w);
		System.out.println("���� : " + h );		
		System.out.println("���� : " + a);
		System.out.println("�ѷ� : " + l);
		

	} //��� ���

}
public class Test072

{
	public static void main(String[] args) 
	{
		//Rect Ŭ���� ����� �ν��Ͻ� ����

		Rect ob = new Rect(); //�ν��Ͻ� ����
	
		//�Է� �޼ҵ� ȣ��

		ob.input();
		//���� ���� �޼ҵ�

		int area = ob.calArea();

		//���� ���� �޼ҵ�
		int length = ob.calLength();
		
		
		ob.print(area,length); //������ ���Ѽ� �Ѱ��ָ� �ȴ�.
		
		
		}


}



/*

������

���� �Է� : 20
���� �Է� : 30
���� : 20
���� : 30
���� : 600
�ѷ� : 100
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/