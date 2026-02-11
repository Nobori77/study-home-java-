package day03;

public class TripleNestedForLoop {
	public static void main(String[] args) {
		
		//공백이 있는 직각 삼각형 만들기
		for(int i = 0; i < 7; i++) {
			String line = "";
			// 공백
			for(int j = 0; j < 7 - i - 1; j++) {
				line += " ";
			}
			// 별
			for(int k = 0; k < 2 * i + 1; k++) {
				line += "*";
			}
			System.out.println(line);
	 }
	}
}
