package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
 * 예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다.
 * 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
 */
public class $12926 {
	public static void main(String[] args) {
		int n = 4;
		String s = "a B z";

		char[] c = s.toCharArray();
		StringBuilder answer = new StringBuilder();
		for (int i = 0; i < c.length; i++) {
			answer.append(init(c[i], n));
		}

		System.out.println(answer);
	}

	public static char init(char c, int n) {
		if (Character.isUpperCase(c)) {
			int i = c + n;
			if (i > 'Z') {
				return (char)(i - 26);
			}
		} else if (Character.isLowerCase(c)) {
			int i = c + n;
			if (i > 'z') {
				return (char)(i - 26);
			}
		} else if (c == ' ') {
			return c;
		}
		return (char)(c + n);
	}
}

