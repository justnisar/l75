import java.util.ArrayList;
import java.util.List;
/*
class TrieNode{

    TrieNode[] chars;
    boolean found;


    public TrieNode() {
        chars = new TrieNode[26];
        found = false;
    }
}

class Trie {

    TrieNode head;
    public Trie() {
        head = new TrieNode();
    }

    public void insert(String word) {
        TrieNode current = head;
        for(char ch : word.toCharArray()){
            int index = ch - 'a';
            if(current.chars[index] == null){
                current.chars[index] = new TrieNode();
            }
            else{
                current = current.chars[index];
            }
        }
        current.found = true;
    }

    public boolean search(String word) {
        TrieNode terminalNode = getTerminalNode(word);
        if (terminalNode == null) return false;
        return terminalNode.found;
    }

    public TrieNode getTerminalNode(String word) {
        TrieNode current = head;
        for(char ch : word.toCharArray()){
            int index = ch - 'a';
            if(current.chars[index] == null){
                return null;
            }
            else{
                current = current.chars[index];
            }
        }
        return current;
    }

    public boolean startsWith(String prefix) {
        TrieNode terminalNode = getTerminalNode(prefix);
        return terminalNode != null;
    }

}

public class SearchSuggestionsSystem {

    Trie trie;

    private void insertProducts(String[] products){
        trie = new Trie();
        for(String product : products){
            trie.insert(product);
        }
    }

    public void dfs(TrieNode node, List<String> temp){
        if(node == null){
            return;
        }
        if(node.found){
            temp.add();
        }
        for(TrieNode children : node.chars){
            if()
        }
    }

    public List<String> getProducts(TrieNode node){
        List<String> temp = new ArrayList<>();
        dfs(node, temp);
        return temp;
    }

    private List<List<String>> getRecommendations(String searchWord){

        TrieNode current = trie.head;
        String searchStr = "";
        List<List<String>> result = new ArrayList<>();
        for(char ch : searchWord.toCharArray()){
            searchStr += ch;
            TrieNode terminalNode = trie.getTerminalNode(searchStr);
            List<String> temp = getProducts(terminalNode);
        }
    }

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        insertProducts(products);
        return getRecommendations(searchWord);
    }
}
*/