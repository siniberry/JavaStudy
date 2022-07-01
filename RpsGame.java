import java.util. Scanner;
import java.util.Random;

class RpsGame
{	
	int computer;
	int user;
	String result;
	// 1 2 3     →   0     1      2
	String [] rps ={"가위","바위","보"};
	
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
			System.out.print(" 1: 가위  2: 바위  3: 보 중 입력(1~3) : ");
			user=sc.nextInt();
			
		}
		while (1>user||user>3);
		System.out.println();
	}
	
	public void print()
		{		
			System.out.println(" - 유저   : "+rps[user-1]);			// str[1]	str[2]	str[3]	→	str[0]	str[1]	str[2]
			System.out.println(" - 컴퓨터 : "+rps[computer-1]);		// str[1]	str[2]	str[3]	→	str[0]	str[1]	str[2]
			System.out.println();

			result="무승부~!!";

			if ((user==1&&computer==3)||(user==2&&computer==1)||(user==3&&computer==2))
			{
				result="당신이 이겼습니다~~!!!";
			}
			else if ((user==3&&computer==1)||(user==1&&computer==2)||(user==2&&computer==3))
			{
				result="컴퓨터가 이겼습니다~!!!";
			}
			System.out.println(" >> 승부 최종 결과 : "+result);
			System.out.println();
		}
		
		
		
	
}	