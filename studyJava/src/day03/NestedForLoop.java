package day03;

public class NestedForLoop {
	public static void main(String[] args) {
		
		for(int i = 2; i < 10; i++) {
			
			// 구구단 출력
			for(int j = 1; j < 10; j++) {
				
				System.out.print(i +"x"+ j + "=" + (i * j) + "\t");
			}
			// 줄바꿈 시 내용이 없는 println() 메서드 사용
			System.out.println();
		}
		
	}
}
