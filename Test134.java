/*========================
¡á¡á¡á Å¬·¡½º °í±Þ ¡á¡á¡á
========================*/

// Wrapper Å¬·¡½º

import java.math.BigInteger;

public class Test134
{
	public static void main(String[]args)
	{
		//int a1 = 123456789123456789;
		//System.out.pritnln(a1);
		//long b1 = 123456789123456789;
		//long b1 = 123456789123456789l;
		//long b1 = 123456789123456789123456789l;
		//System.out.println(b1);

		BigInteger a = new BigInteger("123456789123456789");
		BigInteger b = new BigInteger("123456789123456789");

		//BigInteger c = a + b;
		//System.out.println(c);
		
		// ´õÇÏ±â
		BigInteger c = a.add(b);
		System.out.println("µ¡¼À °á°ú : " + c);

		// »©±â
		BigInteger d = a.subtract(b);
		System.out.println("»¬¼À °á°ú : " + d);

		// °öÇÏ±â
		BigInteger e = a.multiply(b);
		System.out.println("°ö¼À °á°ú : " + e);

		// ³ª´©±â
		BigInteger f = a.divide(b);
		System.out.println("³ª´°¼À °á°ú : " + f);


		// Áö¼ö½Â
		BigInteger g = new BigInteger("2");
		System.out.println("2ÀÇ 3½Â : " + g.pow(3));
	}
}


// ½ÇÇà °á°ú