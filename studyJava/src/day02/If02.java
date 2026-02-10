package day02;

import java.util.Scanner;

public class If02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력 : ");
		int age = sc.nextInt();
		
		if(age > 19) {
			System.out.println("성인입니다");
		} else {
			System.out.println("미성년자입니다");
		}
		
//		스캐너 사용 후 닫아줘야한다.
		sc.close();
	}
}
