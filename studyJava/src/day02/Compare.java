package day02;

public class Compare {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 15;
		int c = 12;
		
		System.out.println( a >= b ); // a가 b보다 크거나 같다.
		System.out.println( a < b ); // a가 b보다 작다.
		System.out.println( c == b ); // c와 b가 같다. 
		System.out.println( a != b ); // a와 b가 같지 않다. 
		
		System.out.println("==========================");
		
//		논리연산 &&(AND) || (OR)
//		AND : 두값이 모두 참일때 true 아닐때 false
//		OR : 두값이 하나가 참이여도 true 둘다 불일때 false
		
		System.out.println((a < b) && ( b > c )); // a가 b보다 작고, b는 c보다 크다.
		System.out.println((a > b) && ( b < c )); // a가 b보다 크고, b는 c보다 작다. 
		System.out.println((a > b) || ( b > c )); // a가 b보다 크고, b는 c보다 작다. 
	}
}
