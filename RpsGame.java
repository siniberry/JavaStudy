import java.util. Scanner;
import java.util.Random;

class RpsGame
{	
	int computer;
	int user;
	String result;
	// 1 2 3     ��   0     1      2
	String [] rps ={"����","����","��"};
	
	private void runCom()
	{
		Random rd = new Random();
		computer = rd.nextInt(3)+1;
	}
	
	
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.print(" 1: ����  2: ����  3: �� �� �Է�(1~3) : ");
			user=sc.nextInt();
			
		}
		while (1>user||user>3);
		System.out.println();
	}
	
	public void print()
		{		
			System.out.println(" - ����   : "+rps[user-1]);			// str[1]	str[2]	str[3]	��	str[0]	str[1]	str[2]
			System.out.println(" - ��ǻ�� : "+rps[computer-1]);		// str[1]	str[2]	str[3]	��	str[0]	str[1]	str[2]
			System.out.println();

			result="���º�~!!";

			if ((user==1&&computer==3)||(user==2&&computer==1)||(user==3&&computer==2))
			{
				result="����� �̰���ϴ�~~!!!";
			}
			else if ((user==3&&computer==1)||(user==1&&computer==2)||(user==2&&computer==3))
			{
				result="��ǻ�Ͱ� �̰���ϴ�~!!!";
			}
			System.out.println(" >> �º� ���� ��� : "+result);
			System.out.println();
		}
		
		
		
	
}	