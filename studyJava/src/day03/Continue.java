package day03;

public class Continue {
	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 0; i < 100; i++) {
			
			//짝수만 더하자
			if(i % 2 == 0) {
//				System.out.println(i);
				continue; // 여기서 실행문 종료
			}
			sum += (i + 1);
		}
		
			System.out.println(sum);
	}
}
