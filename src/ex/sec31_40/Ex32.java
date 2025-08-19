package ex.sec31_40;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 250814 로또
public class Ex32 {
	public static void main(String[] args) {
		List<Integer> ballBox = new ArrayList<Integer>();
		List<Integer> lotto = new ArrayList<Integer>();
		for (int i = 1; i < 46; i++) {
			ballBox.add(i);
		}
		Collections.shuffle(ballBox);
		for (int i = 0; i < 7; i++) {
			lotto.add(ballBox.get(i));
		}

		lotto.sort((a, b) -> a - b);
		System.out.println(lotto);

	}
}
