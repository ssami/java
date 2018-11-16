package tree.trie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Node {

    private char letter;
    private Map<Character, Node> children;

    public Node() {}
    public Node(char letter) {
        this.letter = letter;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public Map<Character, Node> getChildren() {
        return children;
    }

    public void setChildren(Map<Character, Node> children) {
        this.children = children;
    }

    public void addChild(Node child) {
        if (null == this.children || this.children.isEmpty()) {
            this.children = new HashMap<Character, Node>();
        }
        this.children.put(child.getLetter(), child);
    }

    public boolean isWord() {
        return isWord;
    }

    public void setWord(boolean word) {
        isWord = word;
    }

    private boolean isWord;  // how can you tell if the node is a terminal node?






}
