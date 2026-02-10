package day02;

public class ChangeChar {
	public static void main(String[] args) {
		
		char ch = 'E';
		int num = 97;
		
		int chToNum = 0;
		char inToCh = ' ';
		
//		int 와 char는 자동형변환
		
//		char --> int 로 변경할때는 자동형변환 가능
		chToNum = ch;
//		int ---> char 변경할 때는 강제형변환
		inToCh = (char)num;

		System.out.println(chToNum);
		System.out.println(inToCh);
	}
}
