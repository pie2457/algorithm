package programmers;

import java.util.Arrays;

/**
 * Leo는 카펫을 사러 갔다가 아래 그림과 같이 중앙에는 노란색으로 칠해져 있고 테두리 1줄은 갈색으로 칠해져 있는 격자 모양 카펫을 봤습니다.
 * Leo는 집으로 돌아와서 아까 본 카펫의 노란색과 갈색으로 색칠된 격자의 개수는 기억했지만, 전체 카펫의 크기는 기억하지 못했습니다.
 * Leo가 본 카펫에서 갈색 격자의 수 brown, 노란색 격자의 수 yellow가 매개변수로 주어질 때
 * 카펫의 가로, 세로 크기를 순서대로 배열에 담아 return 하도록 solution 함수를 작성해주세요.
 *
 * brown	yellow	return
 * 10		2		[4, 3]
 * 8		1		[3, 3]
 * 24		24		[8, 6]
 */
public class $42842 {
	public static void main(String[] args) {
		int brown = 10;
		int yellow = 2;
		int sum = brown + yellow;
		int answer[] = new int[2];

		for (int i = 3; i < sum; i++) {
			int j = sum / i;

			if (sum % i == 0 && j >= 3) {
				int w = Math.max(i, j);
				int h = Math.min(i, j);
				int center = (w - 2) * (h - 2);

				if (center == yellow) {
					answer[0] += w;
					answer[1] += h;
					System.out.println(Arrays.toString(answer));
					return;
				}
			}
		}
	}
}
