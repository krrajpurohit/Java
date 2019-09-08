package collectionsExample;

import java.util.*;

public class CountVowelsAndConsonants {

	LinkedHashMap<String, Integer> vowels = new LinkedHashMap<String, Integer>();
	LinkedHashMap<String, Integer> consonants = new LinkedHashMap<String, Integer>();

	public void getMaxCount(String test) {
		char[] charArray = test.trim().toCharArray();
		String vowelString = "aeiou";
		int count = 0;
		for (int i = 0; i < charArray.length; i++) {
			count = 0;
			if (vowelString.contains(String.valueOf(charArray[i]))) {
				if (vowels.containsKey(String.valueOf(charArray[i]))) {
					count = vowels.get(String.valueOf(charArray[i]));
					vowels.put(String.valueOf(charArray[i]), ++count);
				} else {
					vowels.put(String.valueOf(charArray[i]), 1);
				}

			} else {
				if (consonants.containsKey(String.valueOf(charArray[i]))) {
					count = consonants.get(String.valueOf(charArray[i]));
					consonants.put(String.valueOf(charArray[i]), ++count);
				} else {
					consonants.put(String.valueOf(charArray[i]), 1);
				}
			}
		}

	}

	public void printHashMap() {

		System.out.println("TOTAL VOWELS= " + vowels.size() + " TOTAL CONSONANTS=" + consonants.size());
		String maxVowel = "null";
		String maxConsonant = "null";
		int maxCountVowel = 0;
		int maxCountConsonant = 0;

		Set vowelsKeys = vowels.keySet();
		Iterator viterator = vowelsKeys.iterator();

		Set consonantsKeys = consonants.keySet();
		Iterator citerator = consonantsKeys.iterator();

		while (viterator.hasNext()) {
			String vowel = viterator.next().toString();
			int count = vowels.get(vowel);

			if (count > maxCountVowel) {
				maxCountVowel = count;
				maxVowel = vowel;
			}

		}

		while (citerator.hasNext()) {
			String consonant = citerator.next().toString();
			int count = consonants.get(consonant);

			if (count > maxCountConsonant) {
				maxCountConsonant = count;
				maxConsonant = consonant;
			}

		}
		System.out.println("MaxVowel= " + maxVowel + " MaxCount= " + maxCountVowel);
		System.out.println("MaxConsonant= " + maxConsonant + " MaxCount= " + maxCountConsonant);

	}

	public static void main(String args[]) {
		CountVowelsAndConsonants test = new CountVowelsAndConsonants();

		test.getMaxCount("this is input string");
		test.printHashMap();

	}

}
