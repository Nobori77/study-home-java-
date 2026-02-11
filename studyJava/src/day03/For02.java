package day03;

public class For02 {
	public static void main(String[] args) {
		
		int sum = 0; // 합산을 위한 변수
		for(int i = 0; i <= 100; i++) {
			
			if(i % 2 == 0) {
			sum = sum + i;
			}
		}
		// 5050 -> 짝수 : 2550 홀수 : 2500
		System.out.println("짝수의 합 : " + sum);
	}
}
