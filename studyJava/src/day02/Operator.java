package day02;

public class Operator {
	public static void main(String[] args) {
		
		int num01 = 100;
		byte byNum01 = 10;
		long lyNum01 = 20;
		double dyNum01 = 33.3333;
		
//		byte 타입에 byte + byte = 오류 발생
//		byte byResult = byNum01 + byNum01;
		
		int inResult01 = byNum01 + byNum01;
		
		inResult01 = byNum01 + num01;
		
//		int 타입에 long + int = 오류발생
//		inResult01 = lyNum01 + num01;
		
		long lnResult01 = lyNum01 + num01;
		
		
		int target = 10;
		System.out.println( target % 3 );
		
	}
}
