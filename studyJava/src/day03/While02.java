package day03;

import java.util.Scanner;

public class While02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int target = (int)(Math.random() * 50) + 1;
		
		int user = 0;
		int count = 0;
		
		while(target != user) {
			System.out.println("숫자를 입력 : ");
			user = sc.nextInt();
			
			if(target > user) {
				System.out.println("업");
			}else if(target < user){
				System.out.println("다운");
			}else {
				System.out.println("정답! 값은" + target + "입니다.");
				System.out.println(count +  "번 만에 맞췃습니다.");
			}
			count++;
		}
		
		sc.close();
	}
}
