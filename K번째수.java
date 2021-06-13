import java.util.Arrays;

class Solution {
	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		for (int i = 0; i < commands.length; i++) {
			int start, end, k = 0;
			start = commands[i][0];
			end = commands[i][1];
			int[] temp = new int[end - start + 1];
			for (int j = 0; j < temp.length; j++) {
				temp[j] = array[start - 1 + k];
				k++;
			}
			arraySort(temp);
			answer[i] = temp[commands[i][2] - 1];
		}
		return answer;
	}

	public static int[] arraySort(int[] array) {
		int temp = 0;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		return array;
	}
}