import java.util.*;

public class Solution {
	public static int[] solution(int[] arr) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				arrayList.add(arr[i]);
			} else if (arr[i] != arr[i - 1]) {
				arrayList.add(arr[i]);
			}
		}
		int[] answer = new int[arrayList.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = arrayList.get(i);
		}
		return answer;
	}
}