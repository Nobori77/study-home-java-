package day03;

public class Dowhile02 {
	public static void main(String[] args) {
		
		int count = 1;
		int sum = 0;
		
		do {
			
			sum += count++;
			
		}while(count <= 10);
		
		System.out.println(sum);
	}
}
