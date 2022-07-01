/*============================================
  ���� ���� �帧�� ��Ʈ��(���) ����
============================================*/

// switch �� �ǽ�

/*
�� ���� ���ù��̶� �ϸ�, switch �� ������ ���� ���� ����
   ���� ������ ���� �������� �б��� �� ����ϴ� �����̴�.

�� ���� �� ����
   switch(����)
   {
	   case ���1 : ����1; [break;]
	   case ���2 : ����2; [break;]
	   		  :
	   [default : ����n+1; [break;]
	}

	switch ���� �����ġ��� case�� ���������
	byte, shortm int, long���̾�� �Ѵ�.

	case �� �ڿ� ��break;���� ���� ������ ���
	���� case ���� ������ ����ؼ�(�̾) �����ϰ� �ȴ�. (�� �⺻ �� )
	��break;���� ������ ���
	�ش� �������� ������ ���� �� switch ���� ����������. (�� �Ϲ� ��)
	*/
	
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

	public class Test043
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		String name;
		int kor, eng, mat, tot;
		//double avg;
		int avg;
		char grade;

		System.out.print("�̸� �Է� : ");
		name = br.readLine();

		System.out.print("�������� �Է� : ");
		kor = Integer.parseInt(br.readLine());
		
		System.out.print("�������� �Է� : ");
		eng = Integer.parseInt(br.readLine());
		
		System.out.print("�������� �Է� : ");
		mat = Integer.parseInt(br.readLine());

		tot = kor + eng + mat;
		//avg = tot / 3.0;
		avg = tot / 3;

		switch (avg/10)
		{
		case 10: grade='A'; break;
		case 9 : grade='A'; break;
        case 8 : grade='B'; break;
        case 7 : grade='C'; break;
		case 6 : grade='D'; break;
        default: grade='F';
            }

		/*	
		switch (avg/10)
		{
		case 10: case 9 : System.out.println(" >>> ����� A �Դϴ�."); break;
        case 8 : System.out.println(" >>> ����� B �Դϴ�."); break;
        case 7 : System.out.println(" >>> ����� C �Դϴ�."); break;
		case 6 : System.out.println(" >>> ����� D �Դϴ�."); break;
        default: System.out.println("F");
            }
			*/
		/*
		switch (avg/10)
		{
		case 10: System.out.println(" >>> ����� A �Դϴ�."); break;
		case 9 : System.out.println(" >>> ����� A �Դϴ�."); break;
        case 8 : System.out.println(" >>> ����� B �Դϴ�."); break;
        case 7 : System.out.println(" >>> ����� C �Դϴ�."); break;
		case 6 : System.out.println(" >>> ����� D �Դϴ�."); break;
		case 5 : System.out.println(" >>> ����� F �Դϴ�."); break;
		case 4 : System.out.println(" >>> ����� F �Դϴ�."); break;
		case 3 : System.out.println(" >>> ����� F �Դϴ�."); break;
		case 2 : System.out.println(" >>> ����� F �Դϴ�."); break;
		case 1 : System.out.println(" >>> ����� F �Դϴ�."); break;
		case 0 : System.out.println(" >>> ����� F �Դϴ�."); break;
         }
			*/
		System.out.printf(" >>> ����� �̸��� %s �Դϴ�.\n ",name);
		System.out.printf(" >>> ���� ������ %d, \n",kor);
		System.out.printf(" >>> ���� ������ %d, \n",eng);
		System.out.printf(" >>> ���� ������ %d,\n",mat);
		System.out.printf(" >>> ������ %d �̰�, ����� %d �Դϴ�.\n",tot,avg);
		System.out.printf(" >>> ����� %c �Դϴ�.\n",grade);

		}

	}
