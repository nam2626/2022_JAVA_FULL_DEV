package lotto;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Lotto_ver2 {

	public static void main(String[] args) {
		Random r = new Random();
		HashSet<Integer> set = new HashSet<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.print("구매할 로또 개수 : ");
		int count = sc.nextInt();
		for (int i = 0; i < count; i++) {
			set.clear();
			while (set.size() < 6) {
				set.add(r.nextInt(45) + 1);
			}
			System.out.println(set);
		}

	}

}
