
public class Test01 {
	/*
	 * 알파벳 대소문자를 A ~ Z, a ~ z 를 순서대로 출력하세요
	 */
	public static void main(String[] args) {
		for(char ch1='A',ch2='a' ;ch1<='Z';ch1++,ch2++) {
			System.out.println(ch1 + " - " + ch2);
		}
	}

}
