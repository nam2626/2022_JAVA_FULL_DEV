package lotto;

import java.util.HashSet;
import java.util.Random;

public class Lotto_ver1 {

	public static void main(String[] args) {
		Random r = new Random();
		HashSet<Integer> set = new HashSet<Integer>();
		
		while(set.size()<6) {
			set.add(r.nextInt(45)+1);
		}
		
		System.out.println(set);
	}

}
