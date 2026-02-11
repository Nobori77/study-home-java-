package day03;

public class Break {
	public static void main(String[] args) {
		
		int sum = 0;
		
		while(true) {
			
			int val = (int)(Math.random() * 50) + 1;
			
			if(val == 30) {
				System.out.println("30이 나와 종료됩니다.");
				break;
			}
			
			sum += val;
			System.out.println(val + ", ");
		}
		
		System.out.println();
		System.out.println(sum);
	}
}
