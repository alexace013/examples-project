package examples.collections_examples.list_examples;

import examples.collections_examples.list_examples.exceptions.FindWordIsNotPresentInTheString;
import examples.collections_examples.list_examples.exceptions.ListIsNotCreateException;

import java.util.ArrayList;
import java.util.List;

public class ListExamples02 {

    private String[] array;
    private List<String> list;
    private List<String> listWithFindWord;

    public ListExamples02() {

    }

    private boolean isFindWordPresentInTheString(String text, String word) {
        array = text.split("[\\s,.:;]+");
        for (String arrayWord : array) {
            return arrayWord.equals(word);
        }
        return false;
    }

    public void addWordsInTheList(String text, String word) throws FindWordIsNotPresentInTheString {
        if (isFindWordPresentInTheString(text, word)) {
            list = new ArrayList<>();
            for (String arrayWord : array) {
                list.add(arrayWord);
            }
            return;
        }
        throw new FindWordIsNotPresentInTheString();
    }

    public List<String> getList() {
        return list;
    }

    public int countTheWordFromTheList(String word) throws ListIsNotCreateException {
        if (list == null) {
            throw new ListIsNotCreateException();
        }
        listWithFindWord = new ArrayList<>();
        for (String listWord : list) {
            if (listWord.equals(word)) {
                listWithFindWord.add(listWord);
            }
        }
        return listWithFindWord.size();
    }

}
