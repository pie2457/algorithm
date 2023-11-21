package programmers;

/**
 * 새로 생긴 놀이기구는 인기가 매우 많아 줄이 끊이질 않습니다. 이 놀이기구의 원래 이용료는 price원 인데,
 * 놀이기구를 N 번 째 이용한다면 원래 이용료의 N배를 받기로 하였습니다.
 * 즉, 처음 이용료가 100이었다면 2번째에는 200, 3번째에는 300으로 요금이 인상됩니다.
 * 놀이기구를 count번 타게 되면 현재 자신이 가지고 있는 금액에서 얼마가 모자라는지를 return 하도록 solution 함수를 완성하세요.
 * 단, 금액이 부족하지 않으면 0을 return 하세요.
 */
public class $82612 {
	public static void main(String[] args) {
		int price = 2500;		// 이용요금
		int money = 1000000000;	// 내가 가진 돈
		int count = 2500;		// 내가 타고 싶은 횟수
		int answer = 0;			// 총 필요한 이용금액
		for (int i = 1; i <= count; i++) {
			answer += (i*price);
		}
		System.out.println(answer - money < 0 ? 0 : answer - money);
	}
}
