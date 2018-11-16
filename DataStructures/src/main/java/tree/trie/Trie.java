package tree.trie;

import java.util.List;

import java.util.Collections;
import java.util.Map;

public class Trie {
    /**
     * Cracking Coding Interview also suggests:
     * 1) having a hashmap of char -> node for the children instead of a list
     * 2) how do you know if you're looking at a prefix or a full word? each node
     * can contain a "full word" flag (kind of like the termination flag in the book)
     * in this case, we should not change the flag when we add a new word (done)
     */

    private Node root = new Node();

    public void add(String word) {
        addWord(word.toLowerCase(), 0, root);
    }

    private void addWord(String word, int wordIndex, Node curr) {
        if (wordIndex == word.length()) {
            curr.setWord(true);
            return;
        }
        char childLetter = word.charAt(wordIndex);
        if (emptyOrNoRelevantChild(curr, childLetter)) {
            Node next = new Node(childLetter);
            next.setWord(false);
            curr.addChild(next);
            wordIndex += 1;
            addWord(word, wordIndex, next);
        }
        else {
            wordIndex += 1;
            Node next = null;
            if (curr.getChildren().containsKey(childLetter)) {
                next = curr.getChildren().get(childLetter);
            }
            else {} // something has gone wrong!
            addWord(word, wordIndex, next);
        }

    }

    private boolean emptyOrNoRelevantChild(Node curr, char childLetter) {
        boolean isEmpty = null == curr.getChildren()
                || curr.getChildren().isEmpty();

        if (isEmpty) return true;

        boolean hasChild = false;
        if (curr.getChildren().containsKey(childLetter)) {
            hasChild = true;
        }
        return !hasChild;
    }

    public boolean isPrefix(String word) {
        return isValid(word, 0, root);
    }

    private boolean isValid(String word, int index, Node curr) {
        if (index == word.length()) {
            return true;
        }
        char childLetter = word.charAt(index);
        if (curr.getChildren().containsKey(childLetter)) {
            index += 1;
            return isValid(word, index, curr.getChildren().get(childLetter));
        }
        return false;
    }

    public List<String> allWordsWithPrefix(String prefix) {
        return findWords(prefix, 0, Collections.<String>emptyList(), "", root, false);
    }

    private List<String> findWords(String prefix, int index,
                                   List<String> words, String curr,
                                   Node current, boolean isPrefix) {
        if (current.isWord()) {
            // we reached a terminating leaf that is a word
            words.add(curr);
            return words;
        }

        char currLetter = prefix.charAt(index);
        if (index == prefix.length()) {
            isPrefix = true; // we reached the end of the prefix, now find all related words
            Map<Character, Node> children = current.getChildren();
            for (Map.Entry<Character, Node> c : children.entrySet()) {
                words.addAll(findWords(prefix, index, words, curr, c.getValue(), isPrefix));
            }
        }
        else if (current.getChildren().containsKey(currLetter)) {
            StringBuffer b = new StringBuffer(curr);
            b.append(currLetter);
            index += 1;
            Node child = current.getChildren().get(currLetter);
            words.addAll(findWords(prefix, index, words, b.toString(), child, isPrefix));
            return words;
        }
        return Collections.emptyList();
    }

}
