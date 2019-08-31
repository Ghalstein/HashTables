import java.util.*;

public class Anagram {

	public static List<List<String>> findAnagrams(List<String> list) {
		Map<String, List<String>> anagramList = new HashMap<>();
		for (String s : list) {

			char[] sortedCharArr = s.toCharArray();
			Arrays.sort(sortedCharArr);
			String sortedStr = new String(sortedCharArr);
			if (!anagramList.containsKey(sortedStr)) {
				anagramList.put(sortedStr, new ArrayList<String>());
			}
			anagramList.sortedStr.add(s);
		}
		return anagramList;
	}
	public static void main(String[] args) {

	}
}