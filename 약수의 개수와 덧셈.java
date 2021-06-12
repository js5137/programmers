class Solution {
	public int solution(int left, int right) {
		int answer = 0;
		int count = (left == 1) ? 1 : 2;
		for (int i = left; i < right + 1; i++) {
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count % 2 == 0) {
				answer += i;
			} else {
				answer -= i;
			}
			count = 2;
		}
		return answer;
	}
}