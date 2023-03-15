package io.javabrains.javacollections;

import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

// Implement the VocabularyWordManager using a SortedSet internally

public class VocabularyWordManager {
	SortedSet<String> ss = null;

    public VocabularyWordManager(Collection<String> words) {
    	ss = new TreeSet<String>(words);
        //throw new RuntimeException("Not implemented");
    }

    public String getFirstWord() {
    	return ss.first();
        //throw new RuntimeException("Not implemented");
    }

    public String getLastWord() {
    	return ss.last();
        //throw new RuntimeException("Not implemented");

    }

    public SortedSet<String> getWordsBefore(String word) {
    	return ss.headSet(word);
        //throw new RuntimeException("Not implemented");
    }

    public SortedSet<String> getWordsAfter(String word) {
    	return ss.tailSet(word);
        //throw new RuntimeException("Not implemented");
    }

    public SortedSet<String> getWordsBetween(String startWord, String endWord) {
    	return ss.subSet(startWord, endWord);
        //throw new RuntimeException("Not implemented");
    }

    public static void main(String[] args) {
        VocabularyWordManager vocab = new VocabularyWordManager(
                Set.of("apple",
                        "banana",
                        "carrot",
                        "date",
                        "eggplant",
                        "fig",
                        "grape",
                        "honey"));
        
        System.out.println("First word: " + vocab.getFirstWord());
        System.out.println("Last word: " + vocab.getLastWord());

        String targetWord = "eggplant";
        SortedSet<String> wordsBefore = vocab.getWordsBefore(targetWord);
        System.out.println("Words before " + targetWord + ": " + wordsBefore);

        SortedSet<String> wordsAfter = vocab.getWordsAfter(targetWord);
        System.out.println("Words after " + targetWord + ": " + wordsAfter);

        String startWord = "carrot";
        String endWord = "grape";
        SortedSet<String> wordsBetween = vocab.getWordsBetween(startWord, endWord);
        System.out.println("Words between " + startWord + " and " + endWord + ": " + wordsBetween);
    }
}

//OUTPUT::
//	First word: apple
//	Last word: honey
//	Words before eggplant: [apple, banana, carrot, date]
//	Words after eggplant: [eggplant, fig, grape, honey]
//	Words between carrot and grape: [carrot, date, eggplant, fig]
