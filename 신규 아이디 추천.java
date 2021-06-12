class Solution {
	public static String solution(String new_id) {
		String answer = "";
		answer = new_id.toLowerCase();
		answer = answer.replaceAll("[^0-9a-z-_.]", "");
		answer = answer.replaceAll("[.]+", ".");
		answer = answer.replaceAll("^[.]", "");
		answer = answer.replaceAll("[.]$", "");
		if (answer.length() == 0) {
			answer = "a";
		}
		if (answer.length() > 15) {
			answer = answer.substring(0, 15).replaceAll("[.]$", "");
		}
		while (answer.length() < 3) {
			answer = answer + answer.substring(answer.length() - 1);
		}
		return answer;
	}
}