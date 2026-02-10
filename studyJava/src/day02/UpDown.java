package day02;

public class UpDown {
	public static void main(String[] args) {
		
		int num = 10;
		int sum = 0;
		
//		num++ 연산 후 증가
//		++num 연산 전 증가

		sum = num++;
		
		System.out.println("sum = " + sum + ", num : " + num);
		
		sum = ++num;
		
		System.out.println("sum = " + sum + ", num : " + num);
		
		
		
	}
}
