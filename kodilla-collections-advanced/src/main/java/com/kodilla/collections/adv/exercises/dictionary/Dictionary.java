package com.kodilla.collections.adv.exercises.dictionary;

import java.util.*;

public class Dictionary {
    Map<String, List<EnglishWord>> dictionary = new HashMap<>();
    public void addWord(String polishWorld, EnglishWord englishWord){
        List<EnglishWord> englishWords = dictionary.getOrDefault(polishWorld,new ArrayList<>());
        englishWords.add(englishWord);
        dictionary.put(polishWorld,englishWords);
    }

    public List<EnglishWord> findEnglishWords(String polishWord){
        return dictionary.getOrDefault(polishWord,Collections.emptyList());
    }
    public List<EnglishWord> findEnglishWords(String polishWord, PartOfSpeech partOfSpeech){
        List<EnglishWord> result = new ArrayList<>();
        for(EnglishWord englishWord : dictionary.getOrDefault(polishWord,Collections.emptyList())){
            if(englishWord.getPartOfSpeech().equals(partOfSpeech)){
                result.add(englishWord);
            }
        }
        return result;
    }

    public int size(){
        return dictionary.size();
    }
}
